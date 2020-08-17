package com.wuhao.web.controller;

import com.wuhao.web.exception.MyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: wuhao.w
 * @Date: 2020/6/12 16:33
 */
@ControllerAdvice
@ResponseBody
@Slf4j
@Controller
public class ControllerAdviceController {

    @ExceptionHandler({MyException.class})
    public String exception(MyException ex, Model model) {
        model.addAttribute("msg", ex.getMessage());
        return "exception";
    }
}
