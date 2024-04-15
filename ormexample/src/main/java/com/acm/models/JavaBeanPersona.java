package com.acm.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity(name = "Persona")
@Table(name = "Persona")
public class JavaBeanPersona implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "idPersona")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "cedula")
    private int cedula;

    @Column(name = "nombrePersona")
    private String nombre;

    @Column(name = "apellidoPersona")
    private String apellido;
    
    @Column(name = "fechaNacimiento")
    private LocalDate date;
    
    // @OneToOne(cascade = {CascadeType.ALL})
    @OneToOne(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "idParqueaderoFK",referencedColumnName = "idParqueadero")
    private Parqueadero parqueadero;

    @OneToMany(mappedBy = "persona",fetch = FetchType.LAZY,cascade = {CascadeType.ALL})
    private List<Recibos> recibos = new ArrayList<>();


    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public JavaBeanPersona(){}
    
    public JavaBeanPersona(int cedula,String nombre, String apellido,LocalDate date) {
        this.date = date;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }
    

    public JavaBeanPersona(int cedula,String nombre, String apellido,LocalDate date, Parqueadero parqueadero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.parqueadero = parqueadero;
        this.date = date;
        this.cedula = cedula;
    }

    private int getId() {
        return id;
    }
    private void setId(int id) {
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

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Recibos> getRecibos() {
        return recibos;
    }

    public void setRecibos(List<Recibos> recibos) {
        this.recibos = recibos;
    }

    @Override
    public String toString() {
        return "JavaBeanPersona [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
                + ", date=" + date + ", parqueadero=" + getParqueadero() + ", recibos=" + getRecibos() + "]";
    }

    




    
}
