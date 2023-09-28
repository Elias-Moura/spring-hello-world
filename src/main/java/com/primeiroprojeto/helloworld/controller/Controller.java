package com.primeiroprojeto.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping
    public String helloWorld() {
        return "Hello World!!";
    }

    @GetMapping("/bsm")
    public String bsm() {
        return """
                {
                "lista bsm" : ["Persistência",
                "Mentalidade de Crescimento",
                "Orientação ao Futuro",
                "Responsabilidade Pessoal",
                "Trabalho em Equipe", 
                "Comunicação",
                "Orientação aos Detalhes",
                "Proatividade"]
                }
                """;
    }


    @GetMapping("/objetivos")
    public String objetivos() {
        return "Aprender REST.";
    }
}

