package com.example.primass.calculos;

import com.example.primass.model.Triangulo;

import java.util.ArrayList;

public class TrianguloInvertido {

    private ArrayList<String> colunas;
    private ArrayList<Triangulo> linhas;

    public TrianguloInvertido() {
    }

    public ArrayList<Triangulo> ArcanoRegente(String numNome) {

        String xNome = numNome.replace(" ", "");
        String soma = "";

        linhas = new ArrayList<>();
        colunas = new ArrayList<>();

        for (int i = 0; i < xNome.length(); i++) {
            colunas.add(String.valueOf(xNome.charAt(i)));
        }

        Triangulo t = new Triangulo();
        t.setLinhas(colunas);
        linhas.add(t);
        for (int j=0; j<colunas.size();j++) {

            for (int i = 0; i < colunas.size(); i++) {

                if (i < colunas.size() - 1) {
                    t = new Triangulo();

                    soma = String.valueOf(Integer.parseInt(colunas.get(i)) + Integer.parseInt(colunas.get(i + 1)));
                    while (soma.length() > 1) {
                        soma = String.valueOf(Integer.parseInt(String.valueOf(soma.charAt(0))) + Integer.parseInt(String.valueOf(soma.charAt(1))));
                    }
                    t.add(soma);
                }
                linhas.add(t);
            }

            colunas = new ArrayList<>();
            colunas = linhas.get(j);
        }

//        String arcano = "";
//        String reducao = numNome.replace(" ","");

//        while (reducao.length() > 1) {
//
//            for (int i = 0; i < reducao.length(); i++) {
//
//                if (i < reducao.length() - 1) {
//
//                    String num = String.valueOf(Integer.parseInt(String.valueOf(reducao.charAt(i))) + Integer.parseInt(String.valueOf(reducao.charAt(i+1))));
//
//                    while (num.length()>1){
//                        num = String.valueOf(Integer.parseInt(String.valueOf(num.charAt(0))) + Integer.parseInt(String.valueOf(num.charAt(1))));
//                    }
//
//                    colunas.add(num);
//
//                    reducao = "";
//                    for (int co = 0; co< colunas.size(); co++){
//                        reducao += colunas.get(co);
//                    }
//                }
//
//            }
//            Triangulo t = new Triangulo();
//
//            t.setLinhas(colunas);
//
//            linhas.add(t);
//
//        }
        return linhas;
    }
}
