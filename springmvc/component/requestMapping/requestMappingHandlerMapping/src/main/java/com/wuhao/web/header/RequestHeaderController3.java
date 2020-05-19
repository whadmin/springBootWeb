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

    @RequestMapping(value="/header/test8", headers = {"Accept!=text/vnd.wap.wml", "abc=123"})
    public String test5() {
        System.out.println("=========Accept!=text/vnd.wap.wml , abc=123");
        return "success";
    }
}
