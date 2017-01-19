package com.xhao.security;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xhao.entity.Operator;
import com.xhao.utils.JsonUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 创建时间：2017/1/18 9:49
 * 作者：WangXianHao.
 */
public class SecurityUser implements UserDetails {

    private String optId;
    private String userName;
    private String loginName;
    private String password;
    private String dataorgid;

    public SecurityUser(Operator o) {
        this.loginName = o.getAccount();
        this.dataorgid = o.getDataorgid();
        this.userName = o.getOptName();
        this.optId = o.getOptId();
        this.password = getPassword();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> auths = new ArrayList<>();
        auths.add(new SimpleGrantedAuthority("USER"));
        return auths;
    }

    @Override
    public String getPassword() {
        return "000000";
    }

    @Override
    public String getUsername() {
        return this.loginName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getDataorgid() {
        return dataorgid;
    }

    public String getOptId() {
        return optId;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        String result = "";
        try {
            result = JsonUtils.toJson(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
