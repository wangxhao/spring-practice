package com.xhao.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xhao.utils.JSONUtils;

/**
 * 创建时间：2017/1/19 15:33
 * 作者：WangXianHao.
 */
public class User {

    private String id;
    private String account;
    private String username;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        try {
            return JSONUtils.toJsonString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "User{}";
    }
}
