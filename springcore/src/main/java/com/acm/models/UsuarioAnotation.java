package com.acm.models;

import org.springframework.stereotype.Component;

@Component
public class UsuarioAnotation implements IUsuario{

    @Override
    public void mostrarDatos() {
        System.out.println("usuario anotation");
    }
    
}
