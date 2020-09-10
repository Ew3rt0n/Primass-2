package com.example.primass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


import com.example.primass.Fragments.ArcanosFragment;
import com.example.primass.Fragments.CompatibilidadeFragment;
import com.example.primass.Fragments.DescricaoFragment;
import com.example.primass.Fragments.ResultadoFragment;
import com.example.primass.Fragments.TrianguloFragment;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {


    private ImageButton bt_Home, bt_Resultado,
            bt_Compatibilidade, bt_Triangulo,
            bt_Arcanos, bt_Descricao;

    private EditText campoNome,
            tv_dia, tv_mes, tv_ano;
    private Button bt_calc;
    private String vogal, consoante;

    private FragmentManager fm;
    private FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.campoNome3);
        tv_dia = findViewById(R.id.tv_dia);
        tv_mes = findViewById(R.id.tv_mes);
        tv_ano = findViewById(R.id.tv_ano);
        findViewById(R.id.bt_compatibilidade).
                setOnClickListener(this);


        bt_Home = findViewById(R.id.bt_Home);
        bt_Resultado = findViewById(R.id.bt_Resultado);
        bt_Compatibilidade = findViewById
                (R.id.bt_Compatibilidade);
        bt_Triangulo = findViewById(R.id.bt_Triangulo);
        bt_Arcanos = findViewById(R.id.bt_Arcanos);
        bt_Descricao = findViewById(R.id.bt_Descricao);


        trocaCor(bt_Home.getId());


        bt_Home.setOnClickListener(this);
        bt_Resultado.setOnClickListener(this);
        bt_Triangulo.setOnClickListener(this);
        bt_Compatibilidade.setOnClickListener(this);
        bt_Arcanos.setOnClickListener(this);
        bt_Descricao.setOnClickListener(this);
        bt_Home.setOnClickListener(this);

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_compatibilidade:
                converter(campoNome.getText().
                        toString().toUpperCase());
                break;


            case R.id.bt_Home:

                fm.popBackStack(null,
                        FragmentManager.POP_BACK_STACK_INCLUSIVE);

                trocaCor(view.getId());

                break;

            case R.id.bt_Resultado:

                fm.popBackStack(null,
                        FragmentManager.POP_BACK_STACK_INCLUSIVE);

                ft=fm.beginTransaction();
                ft.replace(R.id.viewPage,
                        ResultadoFragment.newInstance("",""));
                ft.addToBackStack(null);
                ft.commit();

                trocaCor(view.getId());

                break;

            case R.id.bt_Compatibilidade:

                fm.popBackStack(null,
                        FragmentManager.POP_BACK_STACK_INCLUSIVE);

                ft=fm.beginTransaction();
                ft.replace(R.id.viewPage,
                        CompatibilidadeFragment.newInstance("",""));
                ft.addToBackStack(null);
                ft.commit();

                trocaCor(view.getId());

                break;

            case R.id.bt_Triangulo:

                fm.popBackStack(null,
                        FragmentManager.POP_BACK_STACK_INCLUSIVE);

                ft=fm.beginTransaction();
                ft.replace(R.id.viewPage,
                        TrianguloFragment.newInstance("",""));
                ft.addToBackStack(null);
                ft.commit();

                trocaCor(view.getId());

                break;

            case R.id.bt_Arcanos:

                fm.popBackStack(null,
                        FragmentManager.POP_BACK_STACK_INCLUSIVE);

                ft=fm.beginTransaction();
                ft.replace(R.id.viewPage,
                        ArcanosFragment.newInstance("",""));
                ft.addToBackStack(null);
                ft.commit();

                trocaCor(view.getId());

                break;

            case R.id.bt_Descricao:

                fm.popBackStack(null,
                        FragmentManager.POP_BACK_STACK_INCLUSIVE);

                ft=fm.beginTransaction();
                ft.replace(R.id.viewPage,
                        DescricaoFragment.newInstance("",""));
                ft.addToBackStack(null);
                ft.commit();

                trocaCor(view.getId());

                break;
        }
    }

    private void trocaCor(int btn) {
        bt_Home.setColorFilter
                (getResources().getColor(R.color.white));
        // COR PARA PRAGMENTO DESATIVO
        bt_Resultado.setColorFilter
                (getResources().getColor(R.color.white));
        // COR PARA PRAGMENTO DESATIVO
        bt_Triangulo.setColorFilter
                (getResources().getColor(R.color.white));
        // COR PARA PRAGMENTO DESATIVO
        bt_Compatibilidade.setColorFilter
                (getResources().getColor(R.color.white));
        // COR PARA PRAGMENTO DESATIVO
        bt_Arcanos.setColorFilter
                (getResources().getColor(R.color.white));
        // COR PARA PRAGMENTO DESATIVO
        bt_Descricao.setColorFilter
                (getResources().getColor(R.color.white));
        // COR PARA PRAGMENTO DESATIVO
        bt_Home.setColorFilter
                (getResources().getColor(R.color.white));
        // COR PARA PRAGMENTO DESATIVO

        ImageButton bt = findViewById(btn);
        bt.setColorFilter
                (getResources().getColor(R.color.TODO));
        // COR PARA FRAGMENTO ATIVO
    }

    private void converter(String texto) {

        String resultado = "";
        vogal = "";
        consoante = "";

        String convert, caracter;

        for (int i = 0; i < texto.length(); i++) {

            caracter = String.valueOf(texto.charAt(i));
            //resultado += equivalencia
            // (String.valueOf(texto.charAt(i)));
            convert = equivalencia(caracter);
            resultado += convert;

            if (caracter.equals("A") || caracter.equals("E") ||
                    caracter.equals("I")
                    || caracter.equals("O") || caracter.equals("U")
                    || caracter.equals("È")
                    || caracter.equals("Õ") || caracter.equals("Ë")
                    || caracter.equals("À")
                    || caracter.equals("ì") || caracter.equals("Ä")
                    || caracter.equals("Ï")
                    || caracter.equals("Á") || caracter.equals("Í")
                    || caracter.equals("Ù")
                    || caracter.equals("Ê") || caracter.equals("Ü")
                    || caracter.equals("Û")
                    || caracter.equals("Ã") || caracter.equals("Ò")
                    || caracter.equals("Ô")
                    || caracter.equals("Ö") || caracter.equals("É")
                    || caracter.equals("Ú")
                    || caracter.equals("Â") || caracter.equals("Î")
                    || caracter.equals("Ó")) {
                vogal += convert;
            } else {
                consoante += convert;
            }
        }


        // ((TextView)findViewById
        // (R.id.tv_resultado)).setText(resultado);
        //  ((TextView) findViewById
        //  (R.id.tv_resultado_vogal)).setText(vogal);
        //  ((TextView) findViewById
        //  (R.id.tv_resultado_consoante)).setText(consoante);

        String calcNome, calcVogal, calcConsoante;

        calcNome = calcular
                (resultado.replace(" ", ""),
                        true);
        calcVogal = calcular
                (vogal.replace(" ", ""),
                        true);
        calcConsoante = calcular
                (consoante.replace(" ", ""),
                        false);

        //((TextView) findViewById(R.id.tv_calc)).
        // setText(String.valueOf(soma));
        //   ((TextView) findViewById(R.id.tv_calc)).
        //   setText(calcNome);
        //   ((TextView) findViewById(R.id.tv_calc_vogal)).
        //   setText("VOGAL: " + calcVogal);
        //  ((TextView) findViewById(R.id.tv_calc_consoante)).
        //  setText("CONSOANTE: " + calcConsoante);

    }

    //private void calcular(String calc) {

    private String calcular
            (String calc, boolean valida) {
        int soma = somaTudo(calc);

        if (valida) {

            while (soma >= 10 && soma !=
                    11 && soma != 22) {

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
            somar = somar + Integer.parseInt
                    (String.valueOf(valor.charAt(i)));
        }

        return somar;

    }

    private String equivalencia(String caracter) {

        String troca;

        switch (caracter) {
            case "A": case "I": case "J": case "Q":
            case "Y": case "È": case "Õ": case "Ë":
            case "1":
                troca = "1";
                break;

            case "B": case "K": case "R":
            case "À": case "ì": case "Ä":
            case "Ï": case "Ÿ": case "2":
                troca = "2";
                break;

            case "C": case "G": case "L":
            case "S": case "Á": case "Í":
            case "Ù": case "Ê": case "Ü":
            case "Ý": case "3":
                troca = "3";
                break;

            case "D": case "M": case "T":
            case "Û": case "Ã": case "4":
                troca = "4";
                break;

            case "E": case "N": case "H":
            case "Ò": case "Ô": case "Ö":
            case "5":
                troca = "5";
                break;

            case "U": case "V": case "W":
            case "X": case "Ç": case "6":
                troca = "6";
                break;

            case "O": case "Z": case "É":
            case "7":
                troca = "7";
                break;

            case "F": case "P": case "Ñ":
            case "Ú": case "Â": case "Î":
            case "8":
                troca = "8";
                break;

            case "Ó": case "9":
                troca = "9";
                break;

            default:
                troca = " ";
                break;

        }

        return troca;
    }

    public static boolean
    ValidacaoData(String mDia, String mMes,
                  String mAno) {
        String data = mDia + mMes + mAno;
        if (data.length() == 10) {
            int dia, mes, ano, limiteDia;

            dia = Integer.parseInt(mDia);
            mes = Integer.parseInt(mMes);
            ano = Integer.parseInt(mAno);

            if (mes <= 12) {

                switch (mes) {

                    case 2:

                        limiteDia = (((ano % 4 == 0)
                                && (ano % 100 != 0)) ||
                                (ano % 400 == 0)) ? 29 : 28;
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




