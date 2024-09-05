package org.example.lab03_20192434.Controller;

public class Auto {

    private  int id;
    private  String modelo;
    private  String color;
    private  int kilometraje;
    private  String sede;
    private  double costo;

    public Auto(int id, String modelo, String color, int kilometraje, String sede, double costoPorDia, Sede sede2 ) {
        this.id = id;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
        this.sede = sede;
        this.costo = costoPorDia;

    }

    public Auto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public double getCostoPorDia() {
        return costo;
    }

    public void setCostoPorDia(double costoPorDia) {
        this.costo = costoPorDia;
    }
}
