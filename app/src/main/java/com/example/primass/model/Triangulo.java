package com.example.primass.model;

import java.util.ArrayList;

public class Triangulo extends ArrayList<String> {
    private ArrayList<String> linhas = new ArrayList<>();

    public Triangulo() {

    }

    public ArrayList<String> getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList<String> linhas) {
        this.linhas = linhas;
    }
}
