package br.unipar.programacaointernet.clinica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginWebController {

    @GetMapping("/login")
    public String loginForm() {
        return "login"; // Retorna a página de login (login.html)
    }

    @GetMapping("/hello-world")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "World")
                             String name) {
        return "Hello " + name + "!";
    }

}
