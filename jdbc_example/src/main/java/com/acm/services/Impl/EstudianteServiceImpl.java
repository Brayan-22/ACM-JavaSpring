package com.acm.services.Impl;

import java.sql.SQLException;
import java.util.List;

import com.acm.models.Estudiante;
import com.acm.repository.IEstudianteDAO;
import com.acm.services.IEstudianteService;

public class EstudianteServiceImpl implements IEstudianteService{
    
    public IEstudianteDAO estudianteDAO;
    public EstudianteServiceImpl(IEstudianteDAO estudianteDAO){
        this.estudianteDAO = estudianteDAO;
    }

    @Override
    public void registrar(Estudiante estudiante){
        if (estudiante != null) {
            if (estudiante.id()>=0 && !estudiante.nombre().isBlank() && !estudiante.apellido().isBlank() && !estudiante.codigo().isBlank()) {
                try {
                    estudianteDAO.registrar(estudiante);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public List<Estudiante> getAll(){
        List<Estudiante> lista = null;
        try {
            lista = estudianteDAO.getAll();
            return lista;
        } catch (SQLException e) {
            e.printStackTrace();
            return lista;
        }
    }

    @Override
    public void dropTable() {
        estudianteDAO.dropTable();
    }

    @Override
    public void createTable() {
        estudianteDAO.createTable();
    }
    @Override
    public int cantidad(){
        return estudianteDAO.cantidad();
    }
    
}
