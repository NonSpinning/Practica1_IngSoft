package com.example.practica1.Controlador;
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
        //System.out.println("nombre ->" + nombre);
        modelo.addAttribute("nombre", nombre);
        return "cuenta";
    }

}


