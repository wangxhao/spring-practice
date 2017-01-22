package com.xhao.controller;

import com.xhao.entity.User;
import com.xhao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 创建时间：2017/1/19 15:47
 * 作者：WangXianHao.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String insert(){
        return "user/register";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    @ResponseBody
    public User register(User user){
        userService.insert(user);
        return user;
    }

}
