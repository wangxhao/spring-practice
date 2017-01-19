package com.xhao.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 创建时间：2017/1/18 11:42
 * 作者：WangXianHao.
 */
public class JsonUtils {
    private static ObjectMapper mapper = new ObjectMapper();

    public static String toJson(Object o) throws JsonProcessingException {
        return mapper.writeValueAsString(o);
    }

}
