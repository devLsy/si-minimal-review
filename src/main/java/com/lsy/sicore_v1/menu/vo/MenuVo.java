package com.lsy.sicore_v1.menu.vo;

import com.lsy.sicore_v1.common.vo.CommonVo;
import lombok.Data;

@Data
public class MenuVo extends CommonVo {

    private String menuId;
    private String menuName;
    private String parentMenuId;
    private int menuLevel;
    private int sortOrder;
    private String menuUrl;
}
