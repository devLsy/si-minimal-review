package com.lsy.sicore_v1.menu.controller;

import com.lsy.sicore_v1.menu.service.MenuService;
import com.lsy.sicore_v1.menu.vo.MenuVo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/menu")
public class MenuApiController {
    private final MenuService menuService;

    /**
     * 메뉴 트리
     * @return
     */
    @GetMapping("/tree")
    public ResponseEntity<List<MenuVo>> getMenuTree() {
        return ResponseEntity.ok(menuService.selectMenuTree());
    }
}
