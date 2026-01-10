package com.lsy.sicore_v1.role.vo;

import com.lsy.sicore_v1.common.vo.CommonVo;
import lombok.Data;

@Data
public class RoleVo extends CommonVo {
    private String roleCode;
    private String roleName;
    private char userYn;
}
