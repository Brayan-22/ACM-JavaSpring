package com.acm.models;

public class Parqueadero {
    private int id;
    private int espacio;

    
    public Parqueadero() {
    }

    
    public Parqueadero(int id, int espacio) {
        this.id = id;
        this.espacio = espacio;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getEspacio() {
        return espacio;
    }
    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }


    @Override
    public String toString() {
        return "Parqueadero [id=" + id + ", espacio=" + espacio + "]";
    }

    
}
