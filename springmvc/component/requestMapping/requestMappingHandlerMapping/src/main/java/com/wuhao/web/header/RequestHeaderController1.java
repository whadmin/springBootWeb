package com.wuhao.web.header;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/header")
public class RequestHeaderController1 {

    @RequestMapping(headers = "Content-Type", method= RequestMethod.GET)
    public String test11() {
        return "success";
    }
    
    @RequestMapping(headers = "!Content-Type", method=RequestMethod.POST)
    public String test12() {
        return "success";
    }

    

    
    @RequestMapping(value="/header/test5", headers = "Accept=text/*") 
    public String test33() {
        System.out.println("=========Accept=text/*");
        return "success";
    }
    
    @RequestMapping(value="/header/test6", headers = "Accept=*/*") 
    public String test34() {
        System.out.println("=========Accept=*/*");
        return "success";
    }
    
    

    

    
    
    
}
