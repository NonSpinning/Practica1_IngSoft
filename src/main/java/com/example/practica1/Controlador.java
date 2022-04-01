package com.example.practica1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador{
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("nombre", new Nombre());
        return "index";
    }

    @PostMapping("/nombre")
    public String displayNombre(@ModelAttribute Nombre nombre, Model model){
        model.addAttribute("nombre", nombre);
        return "nombres";
    }
}
