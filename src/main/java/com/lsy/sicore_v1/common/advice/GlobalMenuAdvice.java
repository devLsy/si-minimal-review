package com.lsy.sicore_v1.common.advice;

import com.lsy.sicore_v1.menu.service.MenuService;
import com.lsy.sicore_v1.menu.vo.MenuVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@ControllerAdvice
@RequiredArgsConstructor
public class GlobalMenuAdvice {

    private final MenuService menuService;

    @ModelAttribute("menuList") // 모든 페이지에서 "menuList"라는 이름으로 사용 가능!
    public List<MenuVo> getGlobalMenuList() {
        return menuService.selectMenuTree();
    }
}
