package com.xhao.dao;

import com.xhao.entity.Operator;

import java.util.List;

/**
 * 创建时间：2017/1/18 10:52
 * 作者：WangXianHao.
 */
public interface OperatorDao {

    Operator getByAccount(String account);

    List<Operator> queryAll();
}
