package com.example.practica1.controlador;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador{

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/procesa")
    public String procesa(HttpServletRequest request, Model modelo){
        String nombre = request.getParameter("nombre");
        //System.out.println("nombre ->" + nombre);
        modelo.addAttribute("nombre", nombre);
        return "cuenta";
    }
}