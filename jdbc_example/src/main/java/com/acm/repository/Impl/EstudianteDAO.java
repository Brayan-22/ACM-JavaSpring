package com.acm.repository.Impl;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.acm.models.Estudiante;
import com.acm.repository.Conexion;
import com.acm.repository.IEstudianteDAO;

public class EstudianteDAO extends Conexion implements IEstudianteDAO{
    private DatabaseMetaData metaData;
    public EstudianteDAO(){
        super();
        try {
            metaData = getConexion().getMetaData();
        } catch (Exception e) {
            e.printStackTrace();
            metaData = null;
        }
    }
    @Override
    public void registrar(Estudiante estudiante)throws SQLException {
        try {
            String sql = "INSERT INTO estudiante(id,nombre,apellido,codigo) values (?,?,?,?)";
            PreparedStatement ps = getConexion().prepareStatement(sql);
            ps.setInt(1, estudiante.id());
            ps.setString(2, estudiante.nombre());
            ps.setString(3, estudiante.apellido());
            ps.setString(4, estudiante.codigo());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Estudiante> getAll() throws SQLException {
        List<Estudiante> estudiantes = new ArrayList<>();
        String sql = "SELECT * FROM estudiante";
        try (PreparedStatement preparedStatement = getConexion().prepareStatement(sql)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                estudiantes.add(new Estudiante(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
            return estudiantes;
        } catch (Exception e) {
            throw new SQLException("Error");
        }
    }
    @Override
    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS estudiante (id int UNIQUE NOT NULL,nombre VARCHAR(40),apellido VARCHAR(40),codigo VARCHAR(25),PRIMARY KEY(id));";
        try (Statement statement = getConexion().createStatement()) {
            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void dropTable() {
        String sql = "DROP TABLE estudiante;";
        try (Statement statement = getConexion().createStatement()) {
            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public int cantidad(){
        String countQuery = "SELECT COUNT(*) FROM estudiante";
        try (PreparedStatement ps = getConexion().prepareStatement(countQuery)) {
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return 0;
    }
    
}
