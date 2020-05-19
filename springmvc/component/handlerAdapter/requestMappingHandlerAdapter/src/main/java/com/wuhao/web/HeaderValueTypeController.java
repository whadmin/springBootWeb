package com.wuhao.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;


@Controller
@RequestMapping("/method/param/annotation")
public class HeaderValueTypeController {
    
    @RequestMapping(value="/header")
    public String test(
            @RequestHeader("User-Agent") String userAgent,
            @RequestHeader(value="Accept") String[] accepts) {
        
        System.out.println(userAgent);
        System.out.println(Arrays.toString(accepts));
        
        return "success";
    }

}
