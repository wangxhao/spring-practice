package com.xhao.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 创建时间：2017/1/18 11:09
 * 作者：WangXianHao.
 */
@Configuration
@MapperScan("com.xhao.dao")
public class MyBatisConfig {
}
