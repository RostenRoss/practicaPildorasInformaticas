package com.practica.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HolaAlumnosControlador {

    @GetMapping("/formulario")
    public String muestraFormulario(){

        return "holaAlumnosFormulario";
    }    

     @GetMapping("/procesaFormulario")
    public String procesaFormulario(@RequestParam("nombreAlumno") String nombreAlumno, Model model ){

        model.addAttribute("nombreAlumno", nombreAlumno);
        return "holaAlumnosSpring";
    }
    
}