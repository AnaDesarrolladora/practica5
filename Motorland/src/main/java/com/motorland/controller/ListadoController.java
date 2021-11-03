package com.motorland.controller;

import com.motorland.model.Conexion;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListadoController {
    private JdbcTemplate jdbc;
    
    public ListadoController() {
        Conexion conexion = new Conexion();
        this.jdbc = new JdbcTemplate(conexion.conectar());
    }
    
    @RequestMapping("listado.htm")
    public ModelAndView listado() {
        String consulta = "select * from motores";
        List motores = this.jdbc.queryForList(consulta);
        
        ModelAndView mv = new ModelAndView();
        mv.addObject("motores", motores);
        mv.setViewName("listado");
        
        return mv;
    }
}
