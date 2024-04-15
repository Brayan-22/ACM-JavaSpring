package com.acm.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    protected static final String DRIVER = "org.h2.Driver";
    protected static final String URL = "jdbc:h2:~/test";
    protected static final String USER = "sa";
    protected static final String PASS = "";
    private Connection con = null;
    protected Connection getConexion(){
        try {
            if (this.con == null) {
                Class.forName(DRIVER);
                con = DriverManager.getConnection(URL, USER, PASS);
            }
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return con;
        }
    }
    protected void cerrarConexion(){
        if (this.con != null) {
            try {
                if (!this.con.isClosed()) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
