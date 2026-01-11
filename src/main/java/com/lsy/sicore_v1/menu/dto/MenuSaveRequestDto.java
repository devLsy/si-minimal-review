package com.lsy.sicore_v1.menu.dto;

import com.lsy.sicore_v1.menu.vo.MenuVo;
import lombok.Data;

@Data
public class MenuSaveRequestDto {
    private String menuId;
    private String menuName;
    private String parentMenuId;
    private Integer menuLevel;
    private Integer sortOrder;
    private String menuUrl;

    /**
     * 임시로 만든 메소드
     * @return
     */
    public MenuVo toVo() {
        MenuVo vo = new MenuVo();
        vo.setMenuId(this.menuId);
        vo.setMenuName(this.menuName);
        vo.setMenuLevel(this.menuLevel);
        vo.setParentMenuId(this.parentMenuId);
        vo.setSortOrder(this.sortOrder != null ? this.sortOrder : 0);
        vo.setMenuUrl(this.menuUrl);
        return vo;
    }
}
