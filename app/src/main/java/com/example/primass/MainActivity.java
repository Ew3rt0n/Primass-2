package com.example.primass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


import com.example.primass.Fragments.ArcanosFragment;
import com.example.primass.Fragments.CompatibilidadeFragment;
import com.example.primass.Fragments.DescricaoFragment;
import com.example.primass.Fragments.HomeFragment;
import com.example.primass.Fragments.ResultadoFragment;
import com.example.primass.Fragments.TrianguloFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private ImageButton bt_Home, bt_Resultado, bt_Compatibilidade,
            bt_Triangulo, bt_Arcanos, bt_Descricao;
    private HomeFragment homeFragment;
    private ResultadoFragment resultadoFragment;
    private CompatibilidadeFragment compatibilidadeFragment;
    private TrianguloFragment trianguloFragment;
    private ArcanosFragment arcanosFragment;
    private DescricaoFragment descricaoFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt_Home = findViewById(R.id.bt_Home);
        bt_Resultado = findViewById(R.id.bt_Resultado);
        bt_Compatibilidade = findViewById(R.id.bt_Compatibilidade);
        bt_Triangulo = findViewById(R.id.bt_Triangulo);
        bt_Arcanos = findViewById(R.id.bt_Arcanos);
        bt_Descricao = findViewById(R.id.bt_Descricao);

        homeFragment = new HomeFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.viewPage, homeFragment);
        transaction.commit();

        trocaCor(bt_Home.getId());


        bt_Home.setOnClickListener(this);
        bt_Resultado.setOnClickListener(this);
        bt_Triangulo.setOnClickListener(this);
        bt_Compatibilidade.setOnClickListener(this);
        bt_Arcanos.setOnClickListener(this);
        bt_Descricao.setOnClickListener(this);
        bt_Home.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_Home:

                homeFragment = new HomeFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.viewPage, homeFragment);
                transaction.commit();

                trocaCor(view.getId());

                break;

            case R.id.bt_Resultado:

                resultadoFragment = new ResultadoFragment();

                transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.viewPage, resultadoFragment);
                transaction.commit();

                trocaCor(view.getId());

                break;

            case R.id.bt_Compatibilidade:

                compatibilidadeFragment = new CompatibilidadeFragment();

                transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.viewPage, compatibilidadeFragment);
                transaction.commit();

                trocaCor(view.getId());

                break;

            case R.id.bt_Triangulo:

                trianguloFragment = new TrianguloFragment();

                transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.viewPage, trianguloFragment);
                transaction.commit();

                trocaCor(view.getId());

                break;

            case R.id.bt_Arcanos:

                arcanosFragment = new ArcanosFragment();

                transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.viewPage, arcanosFragment);
                transaction.commit();

                trocaCor(view.getId());

                break;

            case R.id.bt_Descricao:

                descricaoFragment = new DescricaoFragment();

                transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.viewPage, descricaoFragment);
                transaction.commit();

                trocaCor(view.getId());

                break;
        }
    }

    private void trocaCor(int btn) {
        bt_Home.setColorFilter(getResources().getColor(R.color.white)); // COR PARA PRAGMENTO DESATIVO
        bt_Resultado.setColorFilter(getResources().getColor(R.color.white)); // COR PARA PRAGMENTO DESATIVO
        bt_Triangulo.setColorFilter(getResources().getColor(R.color.white)); // COR PARA PRAGMENTO DESATIVO
        bt_Compatibilidade.setColorFilter(getResources().getColor(R.color.white)); // COR PARA PRAGMENTO DESATIVO
        bt_Arcanos.setColorFilter(getResources().getColor(R.color.white)); // COR PARA PRAGMENTO DESATIVO
        bt_Descricao.setColorFilter(getResources().getColor(R.color.white)); // COR PARA PRAGMENTO DESATIVO
        bt_Home.setColorFilter(getResources().getColor(R.color.white)); // COR PARA PRAGMENTO DESATIVO

        ImageButton bt = findViewById(btn);
        bt.setColorFilter(getResources().getColor(R.color.TODO)); // COR PARA FRAGMENTO ATIVO
    }
}