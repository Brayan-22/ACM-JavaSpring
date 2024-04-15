package com.acm.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity(name = "recibos")
@Table(name = "recibos")
public class Recibos {

    @Id
    @Column(name = "idRecibo")
    private int id;

    @Column(name = "precio")
    private double precio;

    @ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "idPersonaFK",referencedColumnName = "idPersona")
    private JavaBeanPersona persona;

    @OneToMany(mappedBy = "recibo",fetch = FetchType.LAZY,cascade = {CascadeType.ALL})
    private List<Recibo_Producto> recibo_Producto;
    public Recibos() {
    }

    public Recibos(int id, double precio, JavaBeanPersona persona) {
        this.id = id;
        this.precio = precio;
        this.persona = persona;
    }
    public Recibos(int id, double precio) {
        this.id = id;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public JavaBeanPersona getPersona() {
        return persona;
    }

    public void setPersona(JavaBeanPersona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Recibos [id=" + id + ", precio=" + precio +  "]";
    }

    
}
