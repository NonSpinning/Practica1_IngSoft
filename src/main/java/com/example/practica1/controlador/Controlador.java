package com.example.practica1.controlador;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Controlador{

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/entrar")
    public String entrar(HttpServletRequest request, Model modelo){
        String nombre = request.getParameter("nombre");
        modelo.addAttribute("nombre", nombre);
        String nombre2 = request.getParameter("nombre2");
        modelo.addAttribute("nombre2", nombre2);
        String nombre3 = request.getParameter("nombre3");
        modelo.addAttribute("nombre3", nombre3);
        String nombre4 = request.getParameter("nombre4");
        modelo.addAttribute("nombre4", nombre4);
        String nombre5 = request.getParameter("nombre5");
        modelo.addAttribute("nombre5", nombre5);
        return "cuenta";
    }
}