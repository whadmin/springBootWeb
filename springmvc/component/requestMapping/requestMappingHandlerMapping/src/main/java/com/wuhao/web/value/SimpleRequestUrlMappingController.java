package com.wuhao.web.value;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: wuhao.w
 * @Date: 2020/5/13 17:26
 */
@Controller
@RequestMapping("/simple")
public class SimpleRequestUrlMappingController {

    @RequestMapping(value = "/test1")
    public String test1() {
        return "index";
    }

    @RequestMapping(value = {"/test1", "/test2"})
    public String test23() {
        return "index";
    }

    @RequestMapping(value = "/testAnt/**")
    public String testAnt1() {
        return "index";
    }

    @RequestMapping(value = "/testAnt/?")
    public String testAnt2() {
        return "index";
    }
}
