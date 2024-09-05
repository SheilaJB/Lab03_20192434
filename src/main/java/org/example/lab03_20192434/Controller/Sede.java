package org.example.lab03_20192434.Controller;

public class Sede {
    private int id;
    private String distrito;
    private String direccion;

    public Sede(int id, String distrito, String direccion) {
        this.id = id;
        this.distrito = distrito;
        this.direccion = direccion;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
