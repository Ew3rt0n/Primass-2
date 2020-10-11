package com.example.primass.calculos;

import com.example.primass.utils.Constants;

public class Calculos {

    public Calculos() {
    }

    public String nome(String texto) {
        return converter(texto, Constants.NOME);
    }

    public String vogais(String texto) {
        return converter(texto, Constants.VOGAL);
    }

    public String consoante(String texto) {
        return converter(texto, Constants.CONSOANTE);
    }

    public String calcNome(String texto, boolean valida) {
        return calcular(nome(texto).replace(" ", ""), valida);
    }

    public String calcVogal(String texto, boolean valida) {
        return calcular(vogais(texto).replace(" ", ""), valida);
    }

    public String calcConsoante(String texto, boolean valida) {
        return calcular(consoante(texto).replace(" ", ""), valida);
    }

    public String calcData(String texto, boolean valida) {
        return calcular(texto, valida);
    }

    public String calcNomeComData(String valNome, String valData, boolean valida) {
        return calcularNomeData(String.valueOf(Integer.parseInt(valNome) + Integer.parseInt(valData)), valida);
    }

    public String converter(String texto, int nvc) {

        texto = texto.toUpperCase();

        String resultado = "", vogal = "", consoante = "";

        String convert, caracter;

        for (int i = 0; i < texto.length(); i++) {

            caracter = String.valueOf(texto.charAt(i));

            convert = equivalencia(caracter);
            resultado += convert;

            if (caracter.equals("A") || caracter.equals("E") || caracter.equals("I")
                    || caracter.equals("O") || caracter.equals("U") || caracter.equals("È")
                    || caracter.equals("Õ") || caracter.equals("Ë") || caracter.equals("À")
                    || caracter.equals("ì") || caracter.equals("Ä") || caracter.equals("Ï")
                    || caracter.equals("Á") || caracter.equals("Í") || caracter.equals("Ù")
                    || caracter.equals("Ê") || caracter.equals("Ü") || caracter.equals("Û")
                    || caracter.equals("Ã") || caracter.equals("Ò") || caracter.equals("Ô")
                    || caracter.equals("Ö") || caracter.equals("É") || caracter.equals("Ú")
                    || caracter.equals("Â") || caracter.equals("Î") || caracter.equals("Ó")) {
                vogal += convert;
            } else {
                consoante += convert;
            }
        }

        switch (nvc) {
            case Constants.VOGAL:
                return vogal;

            case Constants.CONSOANTE:
                return consoante;

            case Constants.NOME:
                return resultado;

            default:
                return "";
        }

    }

    private String calcular(String calc, boolean valida) {

        int soma = somaTudo(calc);

        if (valida) {

            while (soma >= 10 && soma != 11 && soma != 22) {

                soma = somaTudo(String.valueOf(soma));

            }

        } else {

            while (soma >= 10) {

                soma = somaTudo(String.valueOf(soma));

            }

        }

        return String.valueOf(soma);
    }

    private String calcularNomeData(String calc, boolean valida) {

        int soma = Integer.parseInt(calc);

        if (valida) {

            while (soma >= 10 && soma != 11 && soma != 22) {

                soma = somaTudo(String.valueOf(soma));

            }

        } else {

            while (soma >= 10) {

                soma = somaTudo(String.valueOf(soma));

            }

        }

        return String.valueOf(soma);
    }

    private int somaTudo(String valor) {

        int somar = 0;

        for (int i = 0; i < valor.length(); i++) {
            somar = somar + Integer.parseInt(String.valueOf(valor.charAt(i)));
        }

        return somar;

    }

    private String equivalencia(String caracter) {

        String troca;

        switch (caracter) {
            case "A":
            case "I":
            case "J":
            case "Q":
            case "Y":
            case "È":
            case "Õ":
            case "Ë":
            case "1":
                troca = "1";
                break;

            case "B":
            case "K":
            case "R":
            case "À":
            case "ì":
            case "Ä":
            case "Ï":
            case "Ÿ":
            case "2":
                troca = "2";
                break;

            case "C":
            case "G":
            case "L":
            case "S":
            case "Á":
            case "Í":
            case "Ù":
            case "Ê":
            case "Ü":
            case "Ý":
            case "3":
                troca = "3";
                break;

            case "D":
            case "M":
            case "T":
            case "Û":
            case "Ã":
            case "4":
                troca = "4";
                break;

            case "E":
            case "N":
            case "H":
            case "Ò":
            case "Ô":
            case "Ö":
            case "5":
                troca = "5";
                break;

            case "U":
            case "V":
            case "W":
            case "X":
            case "Ç":
            case "6":
                troca = "6";
                break;

            case "O":
            case "Z":
            case "É":
            case "7":
                troca = "7";
                break;

            case "F":
            case "P":
            case "Ñ":
            case "Ú":
            case "Â":
            case "Î":
            case "8":
                troca = "8";
                break;

            case "Ó":
            case "9":
                troca = "9";
                break;

            default:
                troca = " ";
                break;

        }

        return troca;
    }

}
