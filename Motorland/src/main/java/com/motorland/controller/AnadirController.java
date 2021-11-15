package com.motorland.controller;

import com.motorland.config.Conexion;
import com.motorland.model.Motor;
import com.motorland.pojo.ErrorPojo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnadirController {
    Conexion con = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.getConexion());
    ModelAndView mv = new ModelAndView();
    
    @RequestMapping(value = "anadir.htm", method = RequestMethod.GET)
    public ModelAndView anadir() {
        mv.addObject(new Motor());
        return mv;
    }
    
    @RequestMapping(value = "anadir.htm", method = RequestMethod.POST)
    public ModelAndView anadir(Motor motor) {
        if (motor != null && 
            motor.getModelo() != null && motor.getModelo().length() == 5 && 
            motor.getPeso() > 0 && 
            motor.getPotencia() > 0 && 
            motor.getCantidad() > 0) {
            String consulta = "insert into motores (modelo, fabricante, potencia, peso, cantidad) values (?,?,?,?,?)";
            this.jdbcTemplate.update(consulta, motor.getModelo(), motor.getFabricante(), motor.getPotencia(), motor.getPeso(), motor.getCantidad());     
            mv = new ModelAndView("redirect:/listado.htm");
        } else {
            List<ErrorPojo> erroresPojo = new ArrayList<>();
            if (motor.getModelo() == null || (motor.getModelo() != null && motor.getModelo().length() != 5)) {
                ErrorPojo ep = new ErrorPojo();
                ep.setMensajeError("El modelo debe tener 5 caracteres.");
                erroresPojo.add(ep);
            }
            if (motor.getPeso() <= 0) {
                ErrorPojo ep = new ErrorPojo();
                ep.setMensajeError("El peso debe ser mayor que cero.");
                erroresPojo.add(ep);
            }
            if (motor.getPotencia() <= 0) {
                ErrorPojo ep = new ErrorPojo();
                ep.setMensajeError("La potencia debe ser mayor que cero.");
                erroresPojo.add(ep);
            }
            if (motor.getCantidad() <= 0) {
                ErrorPojo ep = new ErrorPojo();
                ep.setMensajeError("El stock debe ser mayor que cero.");
                erroresPojo.add(ep);
            }
            mv.addObject("errores", erroresPojo);         
            mv.setViewName("anadir");
        }
        
        return mv;        
    }
}
