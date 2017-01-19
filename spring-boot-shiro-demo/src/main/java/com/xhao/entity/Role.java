package com.xhao.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xhao.utils.JSONUtils;

import java.io.Serializable;

/**
 * 创建时间：2017/1/19 15:37
 * 作者：WangXianHao.
 */
public class Role implements Serializable{

    private String id;
    private String role;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        try {
            return JSONUtils.toJsonString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "Role{}";
    }
}
