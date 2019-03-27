package com.hujia.listener;

import com.hujia.config.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * java版本的配置
 */
public class MyDispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //指定配置类
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        //映射：将DispatcherServlet映射到/
        return new String[]{"/"};
    }
}
