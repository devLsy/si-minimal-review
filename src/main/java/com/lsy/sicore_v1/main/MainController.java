package com.lsy.sicore_v1.main;

import com.lsy.sicore_v1.menu.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/main")
public class MainController {

    private final MenuService menuService;

    @GetMapping("")
    public String mainPage(Model model) {
        return "view/main";
    }
}
