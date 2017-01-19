package com.xhao.service;

import com.xhao.dao.OperatorDao;
import com.xhao.entity.Operator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 创建时间：2017/1/18 10:55
 * 作者：WangXianHao.
 */
@Service
public class OperatorService {
    @Autowired
    OperatorDao operatorDao;

    public Operator getByAccount(String account){
        return operatorDao.getByAccount(account);
    }

    public List<Operator> queryAll(){
        return operatorDao.queryAll();
    }
}
