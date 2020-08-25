package com.example.primass.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.primass.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment implements
View.OnClickListener {

    private EditText campoNome;
    private String vogal, consoante;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

        }

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);




    }




    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_calc:
                converter(campoNome.getText().toString().toUpperCase());
                break;

            default:
                break;

        }
    }

    private void converter(String texto){

        String resultado = "";
        vogal = "";
        consoante = "";

        String convert, caracter;

        for(int i =0; i <texto.length(); i++){

            caracter = String.valueOf(texto.charAt(i));
            //    resultado += equivalencia(String.valueOf(texto.charAt(i)));
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
                    || caracter.equals("Â") || caracter.equals("Î") || caracter.equals("Ó"))
            {
                vogal += convert;
            } else {
                consoante += convert;
            }
        }


        ((TextView) campoNome.findViewById(R.id.tv_resultado)).setText(resultado);
        //  ((TextView) findViewById(R.id.tv_resultado_vogal)).setText(vogal);
        //  ((TextView) findViewById(R.id.tv_resultado_consoante)).setText(consoante);

        String calcNome, calcVogal, calcConsoante;

        calcNome = calcular(resultado.replace(" ",""), true);
        calcVogal = calcular(vogal.replace(" ",""), true);
        calcConsoante = calcular(consoante.replace(" ",""), false);

        //((TextView) findViewById(R.id.tv_calc)).setText(String.valueOf(soma));
        //   ((TextView) findViewById(R.id.tv_calc)).setText(calcNome);
        //   ((TextView) findViewById(R.id.tv_calc_vogal)).setText("VOGAL: " + calcVogal);
        //  ((TextView) findViewById(R.id.tv_calc_consoante)).setText("CONSOANTE: " + calcConsoante);

    }

    //private void calcular(String calc) {

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
    private int somaTudo(String valor){

        int somar = 0;

        for (int i = 0; i < valor.length(); i++ ) {
            somar = somar + Integer.parseInt(String.valueOf(valor.charAt(i)));
        }

        return somar;

    }

    private String equivalencia (String caracter) {

        String troca;

        switch (caracter) {
            case "A": case"I": case"J": case"Q":
            case"Y": case"È": case"Õ": case"Ë":
            case"1":
                troca = "1";
                break;

            case "B": case"K": case"R": case"À":
            case"ì": case"Ä": case"Ï": case"Ÿ":
            case"2":
                troca = "2";
                break;

            case "C": case"G": case"L": case"S":
            case"Á": case"Í": case"Ù": case"Ê":
            case"Ü": case"Ý": case"3":
                troca = "3";
                break;

            case "D": case"M": case"T": case"Û":
            case"Ã": case"4":
                troca = "4";
                break;

            case "E": case"N": case"H": case"Ò":
            case"Ô":  case"Ö": case"5":
                troca = "5";
                break;

            case "U": case"V": case"W": case"X":
            case"Ç": case"6":
                troca = "6";
                break;

            case "O": case"Z": case"É": case"7":
                troca = "7";
                break;

            case "F": case"P": case"Ñ": case"Ú":
            case"Â": case"Î":  case"8":
                troca = "8";
                break;

            case "Ó": case"9":
                troca = "9";
                break;

            default:
                troca = " ";
                break;

        }

        return troca;
    }

}






