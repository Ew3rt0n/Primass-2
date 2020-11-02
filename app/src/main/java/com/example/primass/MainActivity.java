package com.example.primass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


import com.example.primass.Fragments.ArcanosFragment;
import com.example.primass.Fragments.CompatibilidadeFragment;
import com.example.primass.Fragments.DescricaoFragment;
import com.example.primass.Fragments.ResultadoFragment;
import com.example.primass.Fragments.TrianguloFragment;
import com.example.primass.calculos.Calculos;
import com.example.primass.model.Convercoes;
import com.example.primass.utils.Constants;
import com.example.primass.utils.Validacao;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Convercoes valConvercoes;

    private ImageButton bt_Home, bt_Resultado, bt_Compatibilidade, bt_Triangulo, bt_Arcanos, bt_Descricao;

    private EditText campoNome, tv_dia, tv_mes, tv_ano;
    private ImageButton bt_calc;
    private String vogal, consoante;

    private FragmentManager fm;
    private FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.campoNome);
        tv_dia = findViewById(R.id.tv_dia);
        tv_mes = findViewById(R.id.tv_mes);
        tv_ano = findViewById(R.id.tv_ano);

        bt_Home = findViewById(R.id.bt_Home);
        bt_Resultado = findViewById(R.id.bt_Resultado);
        bt_Compatibilidade = findViewById(R.id.bt_Compatibilidade);
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
        findViewById(R.id.bt_calc).setOnClickListener(this);

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_calc:

                calcula();

                break;


            case R.id.bt_Home:

                fm.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);

                trocaCor(view.getId());

                break;

            case R.id.bt_Resultado:

                calcula();

                break;

            case R.id.bt_Compatibilidade:

                fm.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);

                ft = fm.beginTransaction();
                ft.replace(R.id.viewPage, CompatibilidadeFragment.newInstance
                        (campoNome.getText().toString(), tv_dia.getText().toString(),
                         tv_mes.getText().toString(), tv_ano.getText().toString()));
                ft.addToBackStack(null);
                ft.commit();

                trocaCor(view.getId());

                break;

            case R.id.bt_Triangulo:

                fm.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);

                ft = fm.beginTransaction();
                ft.replace(R.id.viewPage, TrianguloFragment.newInstance("", ""));
                ft.addToBackStack(null);
                ft.commit();

                trocaCor(view.getId());

                break;

            case R.id.bt_Arcanos:

                fm.popBackStack(null,
                        FragmentManager.POP_BACK_STACK_INCLUSIVE);

                ft = fm.beginTransaction();
                ft.replace(R.id.viewPage, ArcanosFragment.newInstance("", ""));
                ft.addToBackStack(null);
                ft.commit();

                trocaCor(view.getId());

                break;

            case R.id.bt_Descricao:

                fm.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);

                ft = fm.beginTransaction();
                ft.replace(R.id.viewPage, DescricaoFragment.newInstance("", ""));
                ft.addToBackStack(null);
                ft.commit();

                trocaCor(view.getId());

                break;
        }

        hideKeyBoard();
    }

    private void calcula() {

        valConvercoes = new Convercoes();

        Calculos calc = new Calculos();

        String mNome = campoNome.getText().toString();
        String mDia = tv_dia.getText().toString();
        String mMes = tv_mes.getText().toString();
        String mAno = tv_ano.getText().toString();

        if (Validacao.ValidacaoData(mDia, mMes, mAno)) {

            valConvercoes.setValNome(calc.calcNome(mNome, true));
            valConvercoes.setValVogal(calc.calcVogal(mNome, true));
            valConvercoes.setValConsoante(calc.calcConsoante(mNome, false));
            valConvercoes.setValData(calc.calcData(mDia + mMes + mAno, true));
            valConvercoes.setValNomeComData(calc.calcNomeComData(valConvercoes.getValNome(), valConvercoes.getValData(), true));
            valConvercoes.setNomeNum(calc.converter(mNome, Constants.NOME));
//teste
            resultado();

        } else {
            Toast.makeText(getApplicationContext(), getString(R.string.data_invalida), Toast.LENGTH_LONG).show();
        }

    }

    private void trocaCor(int btn) {
        // COR PARA PRAGMENTO DESATIVO
        bt_Home.setColorFilter(getResources().getColor(R.color.white));
        bt_Resultado.setColorFilter(getResources().getColor(R.color.white));
        bt_Triangulo.setColorFilter(getResources().getColor(R.color.white));
        bt_Compatibilidade.setColorFilter(getResources().getColor(R.color.white));
        bt_Arcanos.setColorFilter(getResources().getColor(R.color.white));
        bt_Descricao.setColorFilter(getResources().getColor(R.color.white));
        bt_Home.setColorFilter(getResources().getColor(R.color.white));
        // COR PARA PRAGMENTO DESATIVO

        // COR PARA FRAGMENTO ATIVO
        ImageButton bt = findViewById(btn);
        bt.setColorFilter(getResources().getColor(R.color.TODO));
        // COR PARA FRAGMENTO ATIVO
    }

    private void resultado() {

        fm.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);

        ft = fm.beginTransaction();
        ft.replace(R.id.viewPage, ResultadoFragment.newInstance(
                valConvercoes.getValNome(),
                valConvercoes.getValConsoante(),
                valConvercoes.getValVogal(),
                valConvercoes.getValData(),
                valConvercoes.getValNomeComData(),
                String.format("%02d", Integer.parseInt(tv_dia.getText().toString())),
                valConvercoes.getNomeNum()));
        ft.addToBackStack(null);
        ft.commit();

        trocaCor(R.id.bt_Resultado);

    }

    public void hideKeyBoard() {
        View view1 = this.getCurrentFocus();
        if(view1!= null){
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view1.getWindowToken(), 0);
        }
    }
}




