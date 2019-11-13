package com.liyu.springbootthymeleaf.config;

import com.liyu.springbootthymeleaf.filter.MyFilter;
import com.liyu.springbootthymeleaf.listener.MyListener;
import com.liyu.springbootthymeleaf.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MyServerConfig {

    //三大组件
    //servlet
    @Bean
    public ServletRegistrationBean myServletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean =  new ServletRegistrationBean(new MyServlet(),"/myServlet");
        return servletRegistrationBean;
    }
    //filter
    @Bean
    public FilterRegistrationBean myFilterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/hello","/myServlet"));
        return filterRegistrationBean;
    }
    //listener
    @Bean
    public ServletListenerRegistrationBean myServletListenerRegistrationBean(){
        ServletListenerRegistrationBean<MyListener> ServletListenerRegistrationBean = new ServletListenerRegistrationBean<>();
        ServletListenerRegistrationBean.setListener(new MyListener());
        return ServletListenerRegistrationBean;
    }
}
