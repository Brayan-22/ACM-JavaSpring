package com.acm.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Controller
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Usuario {
    
    private int id;
    private String nombre;
    private String apellido;
    private Parqueadero parqueadero;
    
    public void initBean(){
        System.out.println("Creacion de bean persona");
    }

    public void destroyBean(){
        System.out.println("Destruccion de bean persona");
    }
    public Usuario() {
    }

    public Usuario(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }



    
    public Usuario(int id, String nombre, String apellido, Parqueadero parqueadero) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.parqueadero = parqueadero;
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", parqueadero=" + parqueadero
                + "]";
    }

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }

    
}
