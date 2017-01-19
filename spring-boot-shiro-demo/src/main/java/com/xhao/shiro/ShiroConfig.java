package com.xhao.shiro;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 创建时间：2017/1/19 15:16
 * 作者：WangXianHao.
 */
@Configuration
public class ShiroConfig {

    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager){
        System.out.println("ShiroConfig.shiroFilterFactoryBean");

        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        //必须设置securityManager
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        //配置拦截
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
        //key: 配置的访问路径  value: 需要的拦截
        /**
         * 过滤链定义：从上到下顺序执行，一般将/**放在最下边
         */
        filterChainDefinitionMap.put("/logout", "logout");
        filterChainDefinitionMap.put("/**", "authc");

        //登录页面，默认会寻找工程目录下的/login.jsp
        shiroFilterFactoryBean.setLoginUrl("/login");


        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }

    /**
     * 定义安全管理Bean
     * @return
     */
    @Bean
    public SecurityManager securityManager(){
        return new DefaultWebSecurityManager();
    }

}
