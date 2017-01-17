package com.xhao.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建时间：2017/1/17 14:17
 * 作者：WangXianHao.
 */
@RestController
public class HelloController {

    @RequestMapping("hello/{name}")
    public String hello(@PathVariable("name")String name){

        return "Hello " + name;
    }
}
