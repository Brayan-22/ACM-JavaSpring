package com.acm.models;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity(name = "Producto")
@Table(name = "Producto")
public class Producto{
    @Id
    @Column(name = "idProductoPK")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idProducto;

    @Column(name = "nombre")
    private String nombreProducto;

    @Column(name = "precio")
    private double precioProducto;

    @Column(name = "fechaCaducidad")
    private LocalDate caducidad;

    @OneToMany(mappedBy = "producto",cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    private List<Recibo_Producto> recibo_Producto;

    public Producto(String nombreProducto, double precioProducto, LocalDate caducidad) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.caducidad = caducidad;
    }

    public Producto() {
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    @Override
    public String toString() {
        return "Producto [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precioProducto="
                + precioProducto + ", caducidad=" + caducidad +  "]";
    }

    
}
