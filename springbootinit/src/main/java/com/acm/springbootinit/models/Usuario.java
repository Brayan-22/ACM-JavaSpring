package com.acm.springbootinit.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Usuario implements Serializable{

    @Id
    @Column
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String contraseña;
}
