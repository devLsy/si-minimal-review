package com.lsy.sicore_v1.user.mapper;

import com.lsy.sicore_v1.user.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserVo> selectUserList();
    UserVo selectUser(String userId);
    int insertUser(UserVo userVo);
    int updateUser(UserVo userVo);
    int deleteUser(UserVo userVo);
}
