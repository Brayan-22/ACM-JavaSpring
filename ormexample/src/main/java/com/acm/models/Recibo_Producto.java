package com.acm.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



/**
 * Entidad intermediaria entre la relacion muchos a muchos de las entidades Recibo-Producto
 */
@Entity
@Table
public class Recibo_Producto {

    @Id
    @Column(name = "idReciboProductoPK")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idRecibo_Producto;
    @ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name ="idProductoFK" ,referencedColumnName = "idProductoPK")
    private Producto producto;

    @ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "idReciboFK",referencedColumnName = "idRecibo")
    private Recibos recibo;

    public Recibo_Producto(Producto producto, Recibos recibo) {
        this.producto = producto;
        this.recibo = recibo;
    }

    public Recibo_Producto() {
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Recibos getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibos recibo) {
        this.recibo = recibo;
    }

    @Override
    public String toString() {
        return "Recibo_Producto [idRecibo_Producto=" + idRecibo_Producto + ", producto=" + getProducto() + ", recibo="
                + getRecibo() + "]";
    }

    
}
