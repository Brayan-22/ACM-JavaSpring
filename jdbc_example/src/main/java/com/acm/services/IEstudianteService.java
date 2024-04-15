package com.acm.services;

import java.util.List;

import com.acm.models.Estudiante;

public interface IEstudianteService {
    public void registrar(Estudiante estudiante);
    public List<Estudiante> getAll();
    public void dropTable();
    public void createTable();
    public int cantidad();
}
