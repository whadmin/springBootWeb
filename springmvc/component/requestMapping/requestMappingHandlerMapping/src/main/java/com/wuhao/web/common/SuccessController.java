package com.wuhao.web.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuccessController {

    @RequestMapping(value="/success")
    public String success() {
        return "success";
    }
}
