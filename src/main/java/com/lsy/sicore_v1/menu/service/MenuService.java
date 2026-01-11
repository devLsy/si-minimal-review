package com.lsy.sicore_v1.menu.service;

import com.lsy.sicore_v1.menu.mapper.MenuMapper;
import com.lsy.sicore_v1.menu.vo.MenuVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional(readOnly = true)
public class MenuService {
    private final MenuMapper menuMapper;

     /**
     * 메뉴 목록 조회
     * @return
     */
    public List<MenuVo> selectMenuList() {
        return menuMapper.selectMenuList();
    }

    /**
     * 메뉴트리 조회
     * @return
     */
    public List<MenuVo> selectMenuTree() {
        return makeMenuTree(menuMapper.selectMenuTree());
    }

    /**
     * 1. 메뉴-권한 삭제
     * 2. 메뉴 사용 중지
     * @param menuIds
     */
    @Transactional 
    public void removeMenuProcess(List<String> menuIds) {
        if(menuIds == null || menuIds.isEmpty()) return;
        // 1. 매핑 정보 삭제
        deleteMultipleMappings(menuIds);
        // 2. 메뉴 상태 변경
        deleteMultipleMenus(menuIds);
    }

    /**
     * 메뉴 사용 중지
     * @param menuIds
     */
    private void deleteMultipleMenus(List<String> menuIds) {
        int result = menuMapper.deleteMultipleMenus(menuIds);
        if (result != menuIds.size()) throw new IllegalStateException("메뉴 사용 중지 실패");
    }

    /**
     * 메뉴-권한 삭제
     * @param menuIds
     */
    private void deleteMultipleMappings(List<String> menuIds) {
        menuMapper.deleteMultipleMappings(menuIds);
    }

    /**
     * 메뉴트리 조합
     * @param allMenuList
     * @return
     */
    private List<MenuVo> makeMenuTree(List<MenuVo> allMenuList) {
        List<MenuVo> rootList = new ArrayList<>();
        Map<String, MenuVo> map = new HashMap<>();

        allMenuList.forEach(m -> map.put(m.getMenuId(), m));

        for (MenuVo menu : allMenuList) {
            // 최상위 메뉴
            if (menu.getParentMenuId() == null) {
                rootList.add(menu);
            // 하위 메뉴
            } else {
                MenuVo parent = map.get(menu.getParentMenuId());
                if (parent != null) {
                    parent.getChildren().add(menu);
                }
            }
        }

        return rootList;
    }

    /**
     * 메뉴 상세 정보
     * @param menuId
     * @return
     */
    public MenuVo selectMenu(String menuId) {
        return menuMapper.selectMenu(menuId);
    }

    /**
     * 코드 등록
     * @param menuVo
     */
    @Transactional
    public void insertMenu(MenuVo menuVo) {
        int result = menuMapper.insertMenu(menuVo);
        if (result != 1) throw new IllegalStateException("메뉴 등록 실패");
    }

    /**
     * 메뉴 정보 수정
     * @param menuVo
     * @param menuId
     */
    @Transactional
    public void updateMenu(MenuVo menuVo, String menuId) {
        int result = menuMapper.updateMenu(menuVo, menuId);
        if (result != 1) throw new IllegalStateException("메뉴 정보 수정 실패");
    }
}
