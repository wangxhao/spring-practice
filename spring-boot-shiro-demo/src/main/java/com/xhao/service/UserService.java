package com.xhao.service;

import com.xhao.dao.UserDao;
import com.xhao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 创建时间：2017/1/19 15:46
 * 作者：WangXianHao.
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public User getByAccount(String account){
        return userDao.getByAccount(account);
    }

    public void insert(User user){
        userDao.insert(user);
    }
}
