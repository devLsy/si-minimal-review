package com.lsy.sicore_v1.role.service;

import com.lsy.sicore_v1.role.mapper.RoleMapper;
import com.lsy.sicore_v1.role.vo.RoleVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional(readOnly = true)
public class RoleService {
    private final RoleMapper roleMapper;

    /**
     * 권한 목록 조회
     * @return
     */
    public List<RoleVo> selectRoleList() {
        return roleMapper.selectRoleList();
    }

    /**
     * 권한 상세 정보
     * @param roleCode
     * @return
     */
    public RoleVo selectGroupCode(String roleCode) {
        return roleMapper.selectRole(roleCode);
    }

    /**
     * 권한 등록
     * @param roleVo
     */
    @Transactional
    public void insertGroupCode(RoleVo roleVo) {
        int result = roleMapper.insertRole(roleVo);
        if (result != 1) throw new IllegalStateException("권한 등록 실패");
    }

    /**
     * 권한 정보 수정
     * @param roleVo
     */
    @Transactional
    public void updateGroupCode(RoleVo roleVo) {
        int result = roleMapper.updateRole(roleVo);
        if (result != 1) throw new IllegalStateException("권한 정보 수정 실패");
    }

    /**
     * 권한 사용 중지
     * @param roleCode
     */
    @Transactional
    public void deleteGroupCode(String roleCode) {
        int result = roleMapper.deleteRole(roleCode);
        if (result != 1) throw new IllegalStateException("권한 사용 중지 실패");
    }
}
