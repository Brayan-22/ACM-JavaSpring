package com.acm.persistencia;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class PersistenciaUsuario implements IPersistenciaUsuario {
    @Override
    public void addUsuario(){
        System.out.println("usuario añadido desde persitencia con postgres");
    }
}
