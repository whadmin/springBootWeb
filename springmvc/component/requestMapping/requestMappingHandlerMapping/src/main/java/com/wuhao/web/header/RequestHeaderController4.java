package com.wuhao.web.header;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: wuhao.w
 * @Date: 2020/5/19 14:57
 */
@Controller
@RequestMapping("/header4")
public class RequestHeaderController4 {

    @RequestMapping(headers = {"Accept=application/json", "Content-Type=application/json"})
    public String test31() {
        System.out.println("=========Accept=application/json , Content-Type=application/json");
        return "success";
    }
}
