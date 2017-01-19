package com.xhao.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xhao.entity.Operator;
import com.xhao.security.SecurityUser;
import com.xhao.service.OperatorService;
import org.apache.catalina.security.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 创建时间：2017/1/18 10:57
 * 作者：WangXianHao.
 */
@Controller
@RequestMapping("/operator")
public class OperatorController {

    @Autowired
    private OperatorService operatorService;

    @RequestMapping()
    @ResponseBody
    public List<Operator> query(){
        PageHelper.startPage(2,10);
        PageInfo<Operator> pageInfo = new PageInfo<>(operatorService.queryAll());
        return pageInfo.getList();
    }

    @RequestMapping("/{account}")
    @ResponseBody
    public String account(@PathVariable("account")String account){
        Operator operator = operatorService.getByAccount(account);
        return operator.toString();
    }

    @RequestMapping("/current")
    @ResponseBody
    public String current(){
        SecurityUser user = (SecurityUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return user.toString();
    }
}
