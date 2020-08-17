package com.wuhao.web.handlerExceptionResolver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 实现 HandlerExceptionResolver 接口统一处理异常
 *
 * @Author: wuhao.w
 * @Date: 2020/6/11 18:38
 */
@Slf4j
@Component
public class HandlerExceptionResolverImpl implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv = new ModelAndView("exception");
        mv.addObject("msg", ex.getMessage());
        return mv;
    }
}
