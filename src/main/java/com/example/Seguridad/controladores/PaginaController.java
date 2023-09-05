package com.example.Seguridad.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {
    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/login2")
    public String login(){
        return "login";
    }

    @GetMapping("/admin/info")
    public String gestion(){
        return "privados/privada";
    }

    @GetMapping("/user/info")
    public String gestionUser(){
        return "privados/privada";
    }

    @GetMapping("/registrados")
    public String regsistrados(){
        return "regsistrados";
    }
}
