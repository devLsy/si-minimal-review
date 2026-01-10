package com.lsy.sicore_v1.menu.vo;

import com.lsy.sicore_v1.common.vo.CommonVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class MenuVo extends CommonVo {

    private String menuId;
    private String menuName;
    private String parentMenuId;
    private int depth;
    private int menuLevel;
    private int sortOrder;
    private String menuUrl;
    
    private List<MenuVo> children = new ArrayList<>();
}
