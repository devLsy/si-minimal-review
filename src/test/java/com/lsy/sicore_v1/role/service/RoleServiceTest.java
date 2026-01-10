package com.lsy.sicore_v1.role.service;

import com.lsy.sicore_v1.role.mapper.RoleMapper;
import com.lsy.sicore_v1.role.vo.RoleVo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
class RoleServiceTest {

    @Autowired RoleMapper roleMapper;

    @Test
    @Disabled
    void 목록() {
        roleMapper.selectRoleList();
    }

    @Test
    @Disabled
    void 상세() {
        roleMapper.selectRole("ADMIN");
    }

    @Test
    @Disabled
    void 등록() {
        RoleVo roleVo = new RoleVo();
        roleVo.setRoleCode("AVENGERS");
        roleVo.setRoleName("어벤저스");

        // when
        int result = roleMapper.insertRole(roleVo);

        // then
        assertEquals(1, result);

    }

    @Test
    @Disabled
    void 수정() {
        RoleVo roleVo = new RoleVo();
        roleVo.setRoleName("권리자");
        roleVo.setRoleCode("ADMIN");

        // when
        int result = roleMapper.updateRole(roleVo);

        // then
        assertEquals(1, result);
    }

    @Test
    @Disabled
    void 삭제() {
        // when
        int result = roleMapper.deleteRole("ADMIN");

        // then
        assertEquals(1, result);
    }
}