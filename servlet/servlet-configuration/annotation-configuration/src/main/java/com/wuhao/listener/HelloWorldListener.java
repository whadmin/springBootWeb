package com.wuhao.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Author: wuhao.w
 * @Date: 2020/7/4 16:37
 */
@WebListener
@Slf4j
public class HelloWorldListener implements ServletContextListener {

    @Override
    public void contextInitialized(final ServletContextEvent sce) {
        log.info("init servlet context");
    }

    @Override
    public void contextDestroyed(final ServletContextEvent sce) {
        log.info("destroy servlet container");
    }
}
