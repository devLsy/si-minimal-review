package com.lsy.sicore_v1.code.vo;

import com.lsy.sicore_v1.common.vo.CommonVo;
import lombok.Data;

@Data
public class CodeVo extends CommonVo {
    
    private String code;
    private String groupCode;
    private String codeName;
    private int sortOrder;
    private char useYn;
}
