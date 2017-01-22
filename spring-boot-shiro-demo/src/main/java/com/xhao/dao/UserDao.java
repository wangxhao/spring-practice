package com.xhao.dao;

import com.xhao.entity.User;

/**
 * 创建时间：2017/1/19 15:44
 * 作者：WangXianHao.
 */
public interface UserDao {

    User getByAccount(String account);

    void insert(User user);
}
