package com.xhao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 创建时间：2017/1/19 14:34
 * 作者：WangXianHao.
 */
@Controller
public class HelloController {

    @Value("${application.hello:Hello WangXianHao}")
    private String hello;

    @RequestMapping("hello")
    public String hello(Model model){
        model.addAttribute("hello", hello);
        return "hello";
    }
}
