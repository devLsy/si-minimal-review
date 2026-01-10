package com.lsy.sicore_v1.code.vo;

import com.lsy.sicore_v1.common.vo.CommonVo;
import lombok.Data;

@Data
public class GroupCodeVo extends CommonVo {
    private String groupCode;
    private String groupName;
    private String description;
    private char useYn;
}
