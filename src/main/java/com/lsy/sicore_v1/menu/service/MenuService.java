package com.lsy.sicore_v1.menu.service;

import com.lsy.sicore_v1.menu.mapper.MenuMapper;
import com.lsy.sicore_v1.menu.vo.MenuVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    /**
     * 메뉴 사용 중지
     * @param menuId
     */
    @Transactional
    public void deleteCode(String menuId) {
        int result = menuMapper.deleteMenu(menuId);
        if (result != 1) throw new IllegalStateException("메뉴 사용 중지 실패");
    }
}
