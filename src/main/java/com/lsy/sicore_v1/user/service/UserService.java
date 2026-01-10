package com.lsy.sicore_v1.user.service;

import com.lsy.sicore_v1.user.mapper.UserMapper;
import com.lsy.sicore_v1.user.vo.UserVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional(readOnly = true)
public class UserService {
    private final UserMapper userMapper;

    /**
     * 사용자 목록 조회
     * @return
     */
    public List<UserVo> selectUserList() {
        return userMapper.selectUserList();
    }

    /**
     * 사용자 상세 정보
     * @param userId
     * @return
     */
    public UserVo selectUser(String userId) {
        return userMapper.selectUser(userId);
    }

    /**
     * 사용자 등록
     * @param userVo
     */
    @Transactional
    public void insertUser(UserVo userVo) {
        int result = userMapper.insertUser(userVo);
        if (result != 1) throw new IllegalStateException("사용자 등록 실패");
    }

    /**
     * 사용자 정보 수정
     * @param userVo
     */
    @Transactional
    public void updateUser(UserVo userVo) {
        int result = userMapper.updateUser(userVo);
        if (result != 1) throw new IllegalStateException("사용자 정보 수정 실패");
    }

    /**
     * 사용자 탈퇴
     * @param userVo
     */
    @Transactional
    public void deleteUser(UserVo userVo) {
        int result = userMapper.updateUser(userVo);
        if (result != 1) throw new IllegalStateException("사용자 탈퇴 실패");
    }
}
