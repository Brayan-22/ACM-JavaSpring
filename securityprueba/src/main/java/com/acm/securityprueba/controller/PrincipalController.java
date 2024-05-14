package com.acm.securityprueba.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api")
public class PrincipalController {
    
    @GetMapping("/prueba")
    public String prueba() {
        return "hola mundo";
    }


    @GetMapping("/pruebaSegura")
    public String pruebaSegura() {
        return "hola mundo seguro";
    }
    
    




}
