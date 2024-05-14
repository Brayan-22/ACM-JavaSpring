package com.acm.persistencia;

public class PersistenciaUsuarioMYSQL implements IPersistenciaUsuario{

    @Override
    public void addUsuario() {
        System.out.println("Usuario persistido desde MYSQL");
    }
    
}
