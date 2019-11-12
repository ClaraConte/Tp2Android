package com.example.tp_2_android.model;

import java.util.ArrayList;

public class Resultado {
    private int cantidad;
    private int inicio;

    private ArrayList<Provincia> provincias = new ArrayList<Provincia> ();

    private Parametro paramentro;
    private int total;

    public Resultado(int cantidad, int inicio, ArrayList<Provincia> provincias, Parametro paramentro, int total) {
        this.cantidad = cantidad;
        this.inicio = inicio;
        this.provincias = provincias;
        this.paramentro = paramentro;
        this.total = total;
    }

    public Resultado() {
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public ArrayList<Provincia> getProvincia() {
        return provincias;
    }

    public void setProvincia(ArrayList<Provincia> provincia) {
        this.provincias = provincia;
    }

    public Parametro getParamentro() {
        return paramentro;
    }

    public void setParamentro(Parametro paramentro) {
        this.paramentro = paramentro;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "cantidad=" + cantidad +
                ", inicio=" + inicio +
                ", municipio=" + provincias +
                ", paramentro=" + paramentro +
                ", total=" + total +
                '}';
    }
}
