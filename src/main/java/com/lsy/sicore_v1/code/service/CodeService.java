package com.lsy.sicore_v1.code.service;

import com.lsy.sicore_v1.code.mapper.CodeMapper;
import com.lsy.sicore_v1.code.vo.CodeVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional(readOnly = true)
public class CodeService {
    private final CodeMapper codeMapper;

    /**
     * 코드 목록 조회
     * @return
     */
    public List<CodeVo> selectCodeList() {
        return codeMapper.selectCodeList();
    }

    /**
     * 코드 상세 정보
     * @param groupCode
     * @param code
     * @return
     */
    public CodeVo selectCode(String groupCode, String code) {
        return codeMapper.selectCode(groupCode, code);
    }

    /**
     * 코드 등록
     * @param codeVo
     */
    @Transactional
    public void insertCode(CodeVo codeVo) {
        int result = codeMapper.insertCode(codeVo);
        if (result != 1) throw new IllegalStateException("코드 등록 실패");
    }

    /**
     * 코드 정보 수정
     * @param codeVo
     * @param groupCode
     * @param code
     */
    @Transactional
    public void updateCode(CodeVo codeVo, String groupCode, String code) {
        int result = codeMapper.updateCode(codeVo, groupCode, code);
        if (result != 1) throw new IllegalStateException("코드 정보 수정 실패");
    }

    /**
     * 코드 사용 중지
     * @param groupCode
     * @param code
     */
    @Transactional
    public void deleteCode(String groupCode, String code) {
        int result = codeMapper.deleteCode(groupCode, code);
        if (result != 1) throw new IllegalStateException("코드 사용 중지 실패");
    }
}
