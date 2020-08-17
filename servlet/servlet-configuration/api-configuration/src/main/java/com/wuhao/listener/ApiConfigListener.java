package com.wuhao.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.WebListener;

/**
 * @Author: wuhao.w
 * @Date: 2020/7/4 16:58
 */
@WebListener
public class ApiConfigListener implements ServletContextListener {
    @Override
    public void contextInitialized(final ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();


        sc.addFilter("dynamicFilter", DynamicFilter.class);

        ServletRegistration.Dynamic dynamic1 = sc.addServlet("dynamicServlet1", DynamicServlet.class);
        dynamic1.setLoadOnStartup(1);
        dynamic1.addMapping("/dynamic1");

        ServletRegistration.Dynamic dynamic2 = sc.addServlet("dynamicServlet2", "com.sishuok.chapter2.web.servlet.DynamicServlet");
        dynamic2.addMapping("/dynamic2");

        ServletRegistration.Dynamic dynamic3 = sc.addServlet("dynamicServlet3", new DynamicServlet());
        dynamic3.addMapping("/dynamic3");

    }

    @Override
    public void contextDestroyed(final ServletContextEvent sce) {
    }
}
