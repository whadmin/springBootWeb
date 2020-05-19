package com.wuhao.web.header;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: wuhao.w
 * @Date: 2020/5/19 14:31
 */
@Controller
@RequestMapping("/header1")
public class RequestHeaderController2 {

    @RequestMapping(headers = "Content-Type=application/json", method= RequestMethod.GET)
    public String test21() {
        System.out.println("=========Content-Type=text/json");
        return "success";
    }

    @RequestMapping(headers = "Content-Type!=application/json", method=RequestMethod.POST)
    public String test22() {
        System.out.println("=========Content-Type=text/json");
        return "success";
    }
}
