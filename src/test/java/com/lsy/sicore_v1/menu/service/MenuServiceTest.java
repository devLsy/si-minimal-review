package com.lsy.sicore_v1.menu.service;

import com.lsy.sicore_v1.menu.mapper.MenuMapper;
import com.lsy.sicore_v1.menu.vo.MenuVo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
class MenuServiceTest {

    @Autowired MenuMapper menuMapper;

    @Test
    @Disabled
    void 목록() {
        menuMapper.selectMenuList();
    }

    @Test
    void 메뉴트리() {
        menuMapper.selectMenuTree();
    }

    @Test
    @Disabled
    void 상세() {
        menuMapper.selectMenu("MNU_SYS_000");
    }

    @Test
    @Disabled
    void 등록() {
        MenuVo menuVo = new MenuVo();
        menuVo.setMenuId("MNU_SYS_999");
        menuVo.setMenuName("멍텅관리");
        menuVo.setMenuLevel(1);
        menuVo.setSortOrder(1);
        menuVo.setMenuUrl("/mungtung");

        // when
        int result = menuMapper.insertMenu(menuVo);

        // then
        assertEquals(1, result);
    }

    @Test
    @Disabled
    void 수정() {
        MenuVo menuVo = new MenuVo();
        menuVo.setMenuName("테스트");
        menuVo.setMenuLevel(9);
        menuVo.setSortOrder(999);
        menuVo.setMenuUrl("/man");

        // when
        int result = menuMapper.updateMenu(menuVo, "MNU_SYS_010");

        // then
        assertEquals(1, result);
    }

    @Test
    @Disabled
    void 삭제() {
        // when
        int result = menuMapper.deleteMenu("MNU_SYS_000");

        // then
        assertEquals(1, result);
    }
}