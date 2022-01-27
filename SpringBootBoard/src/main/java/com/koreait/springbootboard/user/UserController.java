package com.koreait.springbootboard.user;

import com.koreait.springbootboard.user.model.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/login")
    public void login(@ModelAttribute("userEntity") UserEntity userEntity) {}
}
