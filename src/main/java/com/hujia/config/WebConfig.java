package com.hujia.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 配置类
 */
@Configuration
@EnableWebMvc        //springmvc带有的注解
@ComponentScan("com.hujia")
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * 此类用于配置视图解析器
     * @param configurer
     */

    /**
     * 此重载方法用于配置对静态资源的处理
     * @param configurer
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        super.configureDefaultServletHandling(configurer);
    }
}
