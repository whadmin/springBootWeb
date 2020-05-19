package com.wuhao.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * URI模板模式映射
 *
 * @Author: wuhao.w
 * @Date: 2020/5/13 16:35
 */
@Controller
@RequestMapping("/urlTemplate/")
public class UrlTemplateMappingController {


    /**
     * 请求的URL可以是 "/urlTemplate/xiaoxiao"或"/urlTemplate/wuhao"
     */
    @RequestMapping(value = "/{userId}")
    public String index(@PathVariable(value = "userId") String userId) {
        return "index";
    }
}
