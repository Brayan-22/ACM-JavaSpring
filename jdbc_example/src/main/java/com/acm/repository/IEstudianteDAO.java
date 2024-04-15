package com.acm.repository;

import java.sql.SQLException;
import java.util.List;
import com.acm.models.Estudiante;

public interface IEstudianteDAO{
    public void registrar(Estudiante estudiante) throws SQLException;
    public List<Estudiante> getAll() throws SQLException;
    public void createTable();
    public void dropTable();
    public int cantidad();
}
