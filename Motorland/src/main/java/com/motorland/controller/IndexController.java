package com.motorland.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {    
    ModelAndView mv = new ModelAndView();
    
    @RequestMapping("index.htm")
    public ModelAndView index() {
        mv.setViewName("index");
        
        return mv;
    }
}
