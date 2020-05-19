package com.wuhao.web.method;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/requestMethod/**")                                  //①处理器的通用映射前缀
public class RequestMethodController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)  //②进行类级别的@RequestMapping窄化
    public String methodGET(Model model) {
        model.addAttribute("method", "GET");
        System.out.println("===============GET");
        return "requestMethod/requestMethod";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST) //③进行类级别的@RequestMapping窄化
    public String methodPOST(Model model) {
        model.addAttribute("method", "POST");
        System.out.println("================POST");
        return "requestMethod/requestMethod";
    }

    @RequestMapping(value = "/getOrpost", method = {RequestMethod.POST, RequestMethod.GET})
    public String methodGETOrPOST(Model model) {
        model.addAttribute("method", "GETOrPOST");
        System.out.println("================GET or POST");
        return "requestMethod/requestMethod";
    }
}
