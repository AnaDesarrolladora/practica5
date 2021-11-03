package com.motorland.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    
    @RequestMapping("index.htm")
    public ModelAndView listado() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        
        return mv;
    }
}
