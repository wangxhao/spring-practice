package com.xhao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 创建时间：2017/1/17 15:02
 * 作者：WangXianHao.
 * @author
 * 描述：
 *      Spring MVC的一些自定义配置
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("/login");
        registry.addViewController("/logout").setViewName("/logout");
    }
}
