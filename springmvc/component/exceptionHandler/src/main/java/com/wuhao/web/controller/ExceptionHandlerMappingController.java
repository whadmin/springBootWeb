package com.wuhao.web.controller;

import com.wuhao.web.exception.MyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 使用 @ ExceptionHandler 注解处理异常（方式一）
 * <p>
 * 异常处理的方法必须与发生异常的方法在同一个Controller里面
 * 这种方式最大的缺陷就是不能全局控制异常。每个类都要写一遍
 *
 * @Author: wuhao.w
 * @Date: 2020/5/13 17:26
 */
@Slf4j
@Controller
@RequestMapping("/simple")
public class ExceptionHandlerMappingController {

    /**
     * 用于处理异常的
     *
     * @return
     */
    @ExceptionHandler({MyException.class})
    public String exception(MyException ex, Model model) {
        model.addAttribute("msg", ex.getMessage());
        return "exception";
    }


    @RequestMapping("test")
    public void test() {
        throw new MyException("error");
    }


}
