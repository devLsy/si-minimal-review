package com.lsy.sicore_v1.code.mapper;

import com.lsy.sicore_v1.code.vo.GroupCodeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GroupCodeMapper {
    List<GroupCodeVo> selectGroupCodeList();
    GroupCodeVo selectGroupCode(@Param("groupCode") String groupCode);
    int insertGroupCode(GroupCodeVo groupCodeVo);
    int updateGroupCode(
        @Param("groupCodeVo") GroupCodeVo groupCodeVo,
        @Param("oldGroupCode") String oldGroupCode
    );
    int deleteGroupCode(@Param("groupCode") String groupCode);
}
