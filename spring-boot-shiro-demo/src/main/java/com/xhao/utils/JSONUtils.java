package com.xhao.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 创建时间：2017/1/19 15:34
 * 作者：WangXianHao.
 */
public class JSONUtils {

    public static String toJsonString(Object o) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(o);
    }
}
