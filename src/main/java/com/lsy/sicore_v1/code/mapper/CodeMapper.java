package com.lsy.sicore_v1.code.mapper;

import com.lsy.sicore_v1.code.vo.CodeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CodeMapper {
    List<CodeVo> selectCodeList();
    CodeVo selectCode(@Param("groupCode") String groupCode, @Param("code") String code);
    int insertCode(CodeVo codeVo);
    int updateCode(
        @Param("codeVo") CodeVo codeVo,
        @Param("oldGroupCode") String oldGroupCode,
        @Param("oldCode") String oldCode
    );
    int deleteCode(@Param("groupCode") String groupCode, @Param("code") String code);
}
