package com.lsy.sicore_v1.user.controller;

import com.lsy.sicore_v1.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user/api")
public class UserApiController {
    private final UserService userService;
}
