package com.lsy.sicore_v1.user.service;

import com.lsy.sicore_v1.user.mapper.UserMapper;
import com.lsy.sicore_v1.user.vo.UserVo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
class UserServiceTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    @Disabled
    void 등록() {
        // given
        UserVo user = new UserVo();
//        user.setUserId("test_user_001");
        user.setUserId("A" + System.currentTimeMillis());
        user.setLoginId("test_login_001");
        user.setPassword("1234");
        user.setUserName("테스트유저");
        user.setEmail("test@test.com");
        user.setPhone("01012345678");
        user.setStatusCd("NORMAL");
        user.setLoginFailCnt(0);

        // when
        int result = userMapper.insertUser(user);

        // then
        assertEquals(1, result);
    }

    @Test
    @Disabled
    void 목록() {
        List<UserVo> userList = userMapper.selectUserList();
    }

    @Test
//    @Disabled
    void 수정() {
        UserVo user = new UserVo();
        user.setPassword("4321");
        
        user.setUserId("1");

        // when
        int result = userMapper.updateUser(user);

        // then
        assertEquals(1, result);
    }

    @Test
    @Disabled
    void 탈퇴() {
    }
}