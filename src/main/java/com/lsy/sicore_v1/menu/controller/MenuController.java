package com.lsy.sicore_v1.menu.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/sys/menus")
public class MenuController {

    /**
     * 메뉴 관리 메인 화면 이동
     */
    @GetMapping("/admin")
    public String menuAdminPage() {
        return "view/menu/menu_admin";
    }
}
