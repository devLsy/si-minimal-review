package com.lsy.sicore_v1.menu.controller;

import com.lsy.sicore_v1.menu.dto.MenuSaveRequestDto;
import com.lsy.sicore_v1.menu.dto.MenuUpdateRequestDto;
import com.lsy.sicore_v1.menu.service.MenuService;
import com.lsy.sicore_v1.menu.vo.MenuVo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/menus")
public class MenuApiController {
    private final MenuService menuService;

    /**
     * 메뉴 트리
     * @return
     */
    @GetMapping
    public ResponseEntity<List<MenuVo>> getMenuTree() {
        return ResponseEntity.ok(menuService.selectMenuTree());
    }

    /**
     * 메뉴 상세
     * @param menuId
     * @return
     */
    @GetMapping("/{menuId}")
    public ResponseEntity<MenuVo> getMenuDetail(@PathVariable("menuId") String menuId) {
        return ResponseEntity.ok(menuService.selectMenu(menuId));
    }

    /**
     * 메뉴 등록
     * @param menuDto
     * @return
     */
    @PostMapping
    public ResponseEntity<String> saveMenu(@RequestBody MenuSaveRequestDto menuDto) {
        menuService.insertMenu(menuDto.toVo());
        return ResponseEntity.ok("저장되었습니다.");
    }

    /**
     * 메뉴 수정
     * @param menuId
     * @param menuUpdateDto
     * @return
     */
    @PutMapping("/{menuId}")
    public ResponseEntity<String> updateMenu(@PathVariable("menuId") String menuId,
                                             @RequestBody MenuUpdateRequestDto menuUpdateDto) {
        menuService.updateMenu(menuUpdateDto.toVo(), menuId);
        return ResponseEntity.ok("수정되었습니다.");
    }

    /**
     * 메뉴 삭제
     * @param menuIds
     * @return
     */
    @PatchMapping("/remove")
    public ResponseEntity<String> deleteMenus(@RequestBody List<String> menuIds) {
        menuService.removeMenuProcess(menuIds);
        return ResponseEntity.ok("삭제(사용 중지) 처리되었습니다.");
    }
}
