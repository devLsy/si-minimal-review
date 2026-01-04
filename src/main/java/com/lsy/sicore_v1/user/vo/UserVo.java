package com.lsy.sicore_v1.user.vo;

import com.lsy.sicore_v1.common.vo.CommonVo;
import lombok.Data;

import java.util.Date;

@Data
public class UserVo extends CommonVo {

    private String userId;
    private String loginId;
    private String password;
    private String userName;
    private String email;
    private String phone;
    private String statusCd;
    private int loginFailCnt;
    private Date lastLoginAt;
}

