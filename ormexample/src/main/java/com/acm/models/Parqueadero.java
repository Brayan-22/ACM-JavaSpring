package com.acm.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity(name = "parqueadero")
@Table(name = "parqueadero")
public class Parqueadero implements Serializable{
    
    @Id
    @Column(name = "idParqueadero",unique = true,nullable = false)
    private int id;

    @Column(name = "espacioEnMetros")
    private int espacio;

    @OneToOne(mappedBy = "parqueadero",fetch = FetchType.LAZY)
    private JavaBeanPersona persona;
    
    public Parqueadero() {
    }

    public Parqueadero(int id, int espacio) {
        this.id = id;
        this.espacio = espacio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public JavaBeanPersona getPersona() {
        return persona;
    }

    public void setPersona(JavaBeanPersona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Parqueadero [id=" + id + ", espacio=" + espacio +  "]";
    }
}
