package com.example.tp_2_android.model;

import java.util.ArrayList;

public class Parametro {
    private String[] campos={"id","nombre"};

    public Parametro(String[] campos) {
        this.campos = campos;
    }

    public Parametro() {
    }

    public String[] getCampos() {
        return campos;
    }

    public void setCampos(String[] campos) {
        this.campos = campos;
    }
}

