package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TestController2 {
    @RequestMapping("/page2")
    public String requestMethodName(Model model) {
        model.addAttribute("msg", new String("Test Message"));
        return new String("page2");
    }
    
}
