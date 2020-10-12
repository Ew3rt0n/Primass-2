package com.example.primass.calculos;

import java.util.ArrayList;

public class TrianguloInvertido {

    private ArrayList<String> colunas;
    private ArrayList<ArrayList<String>> linhas;

    public TrianguloInvertido() {
    }

    public ArrayList<ArrayList<String>> ArcanoRegente(String numNome) {

        String xNome = numNome.replace(" ", "");
        String soma = "";

        linhas = new ArrayList<>();
        colunas = new ArrayList<>();

        for (int i = 0; i < xNome.length(); i++) {
            colunas.add(String.valueOf(xNome.charAt(i)));
        }

        linhas.add(colunas);
        ArrayList<String> lin;

        int size = colunas.size();

        for (int j = 0; j < size; j++) {

            lin = new ArrayList<>();

            for (int i = 0; i < colunas.size(); i++) {

                if (i < colunas.size() - 1) {

                    soma = String.valueOf(Integer.parseInt(colunas.get(i)) + Integer.parseInt(colunas.get(i + 1)));

                    while (soma.length() > 1) {
                        soma = String.valueOf(Integer.parseInt(String.valueOf(soma.charAt(0))) + Integer.parseInt(String.valueOf(soma.charAt(1))));
                    }

                    lin.add(soma);
                }
            }

            colunas = new ArrayList<>();
            colunas = lin;

            if (!lin.isEmpty()) {
                linhas.add(lin);
            }
        }

        return linhas;
    }
}
