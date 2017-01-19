package com.xhao.entity;

import com.alibaba.druid.support.json.JSONUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.xhao.utils.JsonUtils;

/**
 * 操作员
 * 创建时间：2017/1/18 10:05
 * 作者：WangXianHao.
 */
public class Operator {
    private String optId;
    private String optName;
    private String account;
    private String deptId;
    private String enabled;
    private String dataorgid;

    public String getOptId() {
        return optId;
    }

    public void setOptId(String optId) {
        this.optId = optId;
    }

    public String getOptName() {
        return optName;
    }

    public void setOptName(String optName) {
        this.optName = optName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getDataorgid() {
        return dataorgid;
    }

    public void setDataorgid(String dataorgid) {
        this.dataorgid = dataorgid;
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
