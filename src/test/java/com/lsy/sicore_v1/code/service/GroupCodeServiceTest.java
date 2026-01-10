package com.lsy.sicore_v1.code.service;

import com.lsy.sicore_v1.code.mapper.GroupCodeMapper;
import com.lsy.sicore_v1.code.vo.GroupCodeVo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
class GroupCodeServiceTest {

    @Autowired GroupCodeMapper groupCodeMapper;

    @Test
    @Disabled
    void 목록() {
        groupCodeMapper.selectGroupCodeList();
    }

    @Test
    @Disabled
    void 상세() {
        groupCodeMapper.selectGroupCode("CO_USER_STATUS");
    }

    @Test
    @Disabled
    void 등록() {
        GroupCodeVo groupCodeVo = new GroupCodeVo();
        groupCodeVo.setGroupCode("CO_TEST");
        groupCodeVo.setGroupName("CO_TEST_NAME");
        groupCodeVo.setDescription("테스트야");

        // when
        int result = groupCodeMapper.insertGroupCode(groupCodeVo);

        // then
        assertEquals(1, result);
    }

    @Test
    @Disabled
    void 수정() {
        GroupCodeVo groupCodeVo = new GroupCodeVo();
        groupCodeVo.setGroupName("CO_TEST_NAME");
        groupCodeVo.setDescription("테스트로 수정");

        // when
        int result = groupCodeMapper.updateGroupCode(groupCodeVo, "CO_USER_STATUS");
        // then
        assertEquals(1, result);
    }

    @Test
    @Disabled
    void 삭제() {
        // when
        int result = groupCodeMapper.deleteGroupCode("CO_USER_STATUS");
        // then
        assertEquals(1, result);
    }
}