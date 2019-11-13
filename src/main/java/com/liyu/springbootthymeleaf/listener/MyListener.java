package com.liyu.springbootthymeleaf.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("server init...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("server destroyed...");
    }
}
