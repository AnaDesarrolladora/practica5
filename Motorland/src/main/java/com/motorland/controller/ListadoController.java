package com.motorland.controller;

import com.motorland.config.Conexion;
import com.motorland.model.Motor;
import com.motorland.pojo.MotorPojo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListadoController {
    Conexion con = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.getConexion());
    ModelAndView mv = new ModelAndView();
    
    @RequestMapping("listado.htm")
    public ModelAndView listado() {
        String consulta = "select * from motores";
        List<Motor> motores = this.jdbcTemplate.query(consulta, new Object[]{}, new BeanPropertyRowMapper<Motor>(Motor.class));
        if (motores != null) {
            List<MotorPojo> motoresPojo = new ArrayList<>();
            for (Motor motorActual: motores) {
                MotorPojo nuevoMotorPojo = new MotorPojo(motorActual);
                if (nuevoMotorPojo != null) {
                    motoresPojo.add(nuevoMotorPojo);
                }
            }
            mv.addObject("lista", motoresPojo); 
        }           
        mv.setViewName("listado");
        
        return mv;
    }
}
