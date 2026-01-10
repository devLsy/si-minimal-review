package com.lsy.sicore_v1.code.service;

import com.lsy.sicore_v1.code.mapper.GroupCodeMapper;
import com.lsy.sicore_v1.code.vo.GroupCodeVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional(readOnly = true)
public class GroupCodeService {
    private final GroupCodeMapper groupCodeMapper;

    /**
     * 그룹 코드 목록 조회
     * @return
     */
    public List<GroupCodeVo> selectGroupCodeList() {
        return groupCodeMapper.selectGroupCodeList();
    }

    /**
     * 그룹 코드 상세 정보
     * @param groupCode
     * @return
     */
    public GroupCodeVo selectGroupCode(String groupCode) {
        return groupCodeMapper.selectGroupCode(groupCode);
    }

    /**
     * 그룹 코드 등록
     * @param groupCodeVo
     */
    @Transactional
    public void insertGroupCode(GroupCodeVo groupCodeVo) {
        int result = groupCodeMapper.insertGroupCode(groupCodeVo);
        if (result != 1) throw new IllegalStateException("그룹 코드 등록 실패");
    }

    /**
     * 그룹 코드 정보 수정
     * @param groupCodeVo
     * @param groupCode
     */
    @Transactional
    public void updateGroupCode(GroupCodeVo groupCodeVo, String groupCode) {
        int result = groupCodeMapper.updateGroupCode(groupCodeVo, groupCode);
        if (result != 1) throw new IllegalStateException("그룹 코드 정보 수정 실패");
    }

    /**
     * 그룹 코드 사용 중지
     * @param groupCode
     */
    @Transactional
    public void deleteGroupCode(String groupCode) {
        int result = groupCodeMapper.deleteGroupCode(groupCode);
        if (result != 1) throw new IllegalStateException("그룹 코드 사용 중지 실패");
    }
}
