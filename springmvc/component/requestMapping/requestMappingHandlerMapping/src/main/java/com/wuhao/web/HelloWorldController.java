package com.wuhao.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractUrlViewController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HelloWorld {@link Controller}
 */
@Controller
public class HelloWorldController extends AbstractUrlViewController {

    @ResponseBody
    @RequestMapping("/hello")
    public String index(Model model) {
        return "hello";
    }


    @Override
    protected String getViewNameForRequest(HttpServletRequest request) {
        return null;
    }
}
