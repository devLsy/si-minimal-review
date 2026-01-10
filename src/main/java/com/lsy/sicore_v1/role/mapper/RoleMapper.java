package com.lsy.sicore_v1.role.mapper;

import com.lsy.sicore_v1.role.vo.RoleVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {
    List<RoleVo> selectRoleList();
    RoleVo selectRole(String roleCode);
    int insertRole(RoleVo roleVo);
    int updateRole(RoleVo roleVo);
    int deleteRole(String roleCode);
}
