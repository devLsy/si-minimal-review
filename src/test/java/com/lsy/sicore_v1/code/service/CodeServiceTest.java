package com.lsy.sicore_v1.code.service;

import com.lsy.sicore_v1.code.mapper.CodeMapper;
import com.lsy.sicore_v1.code.vo.CodeVo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
class CodeServiceTest {

    @Autowired CodeMapper codeMapper;

    @Test
    @Disabled
    void 목록() {
        codeMapper.selectCodeList();
    }

    @Test
    @Disabled
    void 상세() {
        codeMapper.selectCode("CO_USER_STATUS", "NORMAL");
    }

    @Test
    @Disabled
    void 등록() {
        CodeVo codeVo = new CodeVo();
        codeVo.setCode("TEST1");
        codeVo.setGroupCode("TEST_GROUP");
        codeVo.setCodeName("테스트코드1");
        codeVo.setSortOrder(1);

        // when
        int result = codeMapper.insertCode(codeVo);

        // then
        assertEquals(1, result);
    }

    @Test
    @Disabled
    void 수정() {
        CodeVo codeVo = new CodeVo();
        codeVo.setCode("TEST1");
        codeVo.setGroupCode("TEST_GROUP");
        codeVo.setSortOrder(9);
        codeVo.setCodeName("테스트에서변경");

        int result = codeMapper.updateCode(codeVo, "CO_USER_STATUS", "NORMAL");
        assertEquals(1, result);
    }

    @Test
    @Disabled
    void 삭제() {
        // when
        int result = codeMapper.deleteCode("CO_USER_STATUS", "NORMAL");

        // then
        assertEquals(1, result);
    }
}