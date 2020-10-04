package com.example.primass.utils;

public class Validacao {

    public static boolean ValidacaoData(String mDia, String mMes, String mAno) {


        String data = String.format("%02d", Integer.parseInt(mDia)) + String.format("%02d", Integer.parseInt(mMes)) + mAno;

        if (data.length() == 8) {
            int dia, mes, ano, limiteDia;

            dia = Integer.parseInt(mDia);
            mes = Integer.parseInt(mMes);
            ano = Integer.parseInt(mAno);

            if (mes <= 12) {

                switch (mes) {

                    case 2:

                        limiteDia = (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)) ? 29 : 28;
                        return dia <= limiteDia;

                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return dia <= 31;

                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return dia <= 30;

                    default:
                        return false;

                }

            } else {

                return false;

            }

        } else {

            return false;

        }

    }

}
