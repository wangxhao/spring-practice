package com.xhao.shiro;

import java.io.Serializable;

/**
 * 创建时间：2017/1/19 15:27
 * 作者：WangXianHao.
 */
public class ShiroUser implements Serializable{

    private String account;
    private String username;
    private String password;
    private String salt;

    private byte state;

}
