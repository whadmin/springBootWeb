package com.wuhao.web.header;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: wuhao.w
 * @Date: 2020/5/19 14:31
 */
@Controller
@RequestMapping("/header3")
public class RequestHeaderController3 {

    @RequestMapping(headers = "Accept=text/*", method = RequestMethod.GET)
    public String test23() {
        System.out.println("=========Accept=text/*");
        return "success";
    }

    @RequestMapping(headers = "Accept=*/*", method = RequestMethod.POST)
    public String test24() {
        System.out.println("=========Accept=*/*");
        return "success";
    }
}
