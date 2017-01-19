package com.xhao.security;

import com.xhao.dao.OperatorDao;
import com.xhao.entity.Operator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * 创建时间：2017/1/18 14:39
 * 作者：WangXianHao.
 */
public class CustomUserService implements UserDetailsService {

    @Autowired
    OperatorDao operatorDao;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Operator operator = operatorDao.getByAccount(s);
        if(operator == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        SecurityUser user = new SecurityUser(operator);
        return user;
    }
}
