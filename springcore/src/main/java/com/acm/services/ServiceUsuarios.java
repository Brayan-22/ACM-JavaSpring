package com.acm.services;

import com.acm.persistencia.IPersistenciaUsuario;

public class ServiceUsuarios {
    private IPersistenciaUsuario persistenciaUsuario;

    public ServiceUsuarios(IPersistenciaUsuario persistenciaUsuario){
        this.persistenciaUsuario = persistenciaUsuario;
    }
    public void addUsuario(){
        persistenciaUsuario.addUsuario();
        System.out.println("añadido usuario desde servicio");
    }

    public IPersistenciaUsuario getPersistenciaUsuario() {
        return persistenciaUsuario;
    }
    public void setPersistenciaUsuario(IPersistenciaUsuario persistenciaUsuario) {
        this.persistenciaUsuario = persistenciaUsuario;
    }


    
}
