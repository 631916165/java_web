package com.example.boot_he.controller;


import com.example.boot_he.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getuser")
    @ResponseBody
    public User getuser() {
        User user = new User();
        user.setUsername("杨过");
        user.setPassword("123456");
        user.setAge(18);
        user.setSex("男");
        return user;
    }
}
