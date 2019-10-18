package com.wuhao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * HelloWorld {@link Controller}
 */
@Controller
public class HelloWorldController {

    @ResponseBody
    @RequestMapping("/hello")
    public String index(@RequestParam int value, Model model) {
        return "index";
    }

}
