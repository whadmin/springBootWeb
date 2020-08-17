package com.wuhao.filter;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author: wuhao.w
 * @Date: 2020/7/4 16:39
 */
@Data
@Slf4j
@WebFilter(filterName = "helloWorl", urlPatterns = "/*", initParams = {
        @WebInitParam(name = "msg", value = "hello world")
}, dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD})
public class HelloWorldFilter implements Filter {

    private String msg;

    @Override
    public void init(final FilterConfig filterConfig) throws ServletException {
        msg = filterConfig.getInitParameter("msg");
    }

    @Override
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        log.info("filter1===" + httpServletRequest.getRequestURI());
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }
}
