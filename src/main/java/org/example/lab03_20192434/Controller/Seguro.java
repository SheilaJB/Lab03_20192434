package org.example.lab03_20192434.Controller;

import java.security.PrivateKey;

public class Seguro {
    int idseguro;
    String nombreEmpresa;
    Double coberturaMax;
    Double tarifa;

    public Seguro(int idseguro, String nombreEmpresa, Double coberturaMax, Double tarifa) {
        this.idseguro = idseguro;
        this.nombreEmpresa = nombreEmpresa;
        this.coberturaMax = coberturaMax;
        this.tarifa = tarifa;

    }

    public Seguro() {

    }

    public int getIdseguro() {
        return idseguro;
    }

    public void setIdseguro(int idseguro) {
        this.idseguro = idseguro;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Double getCoberturaMax() {
        return coberturaMax;
    }

    public void setCoberturaMax(Double coberturaMax) {
        this.coberturaMax = coberturaMax;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }
}
