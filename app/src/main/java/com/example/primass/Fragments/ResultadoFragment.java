package com.example.primass.Fragments;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.example.primass.Definicoes;
import com.example.primass.R;

public class ResultadoFragment extends Fragment implements View.OnClickListener {

    private Definicoes def;

    private ImageView im_fundo_ex, im_fundo_im, im_fundo_des,
            im_fundo_mis, im_fundo_arc, im_fundo_per, im_fundo_ori,
            im_fundo_lic, iv_customdialog_close;

    private static final String ARG_NOME = "paramNome";
    private static final String ARG_CONSOANTE = "paramConsoante";
    private static final String ARG_DATA = "paramData";
    private static final String ARG_NOME_DATA = "paramNomeComData";
    private static final String ARG_DIA = "paramDia";

    private String mNome, mConsoante, mData, mNomeData, mDia;

    public ResultadoFragment() {
        // Required empty public constructor
    }

    public static ResultadoFragment newInstance(String paramNome, String paramConsoante, String paramData, String paramNomeComData, String paramDia) {
        ResultadoFragment fragment = new ResultadoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_NOME, paramNome);
        args.putString(ARG_CONSOANTE, paramConsoante);
        args.putString(ARG_DATA, paramData);
        args.putString(ARG_NOME_DATA, paramNomeComData);
        args.putString(ARG_DIA, paramDia);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mNome = getArguments().getString(ARG_NOME);
            mConsoante = getArguments().getString(ARG_CONSOANTE);
            mData = getArguments().getString(ARG_DATA);
            mNomeData = getArguments().getString(ARG_NOME_DATA);
            mDia = getArguments().getString(ARG_DIA);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_resultado, container, false);

        view.findViewById(R.id.im_fundo_ex).setOnClickListener(this);
        view.findViewById(R.id.im_fundo_arc).setOnClickListener(this);
        view.findViewById(R.id.im_fundo_des).setOnClickListener(this);
        view.findViewById(R.id.im_fundo_im).setOnClickListener(this);
        view.findViewById(R.id.im_fundo_mis).setOnClickListener(this);
        view.findViewById(R.id.im_fundo_per).setOnClickListener(this);
        view.findViewById(R.id.im_fundo_ori).setOnClickListener(this);
        view.findViewById(R.id.im_fundo_lic).setOnClickListener(this);


//        im_fundo_ex = view.findViewById(R.id.im_fundo_ex);
//        im_fundo_arc = view.findViewById(R.id.im_fundo_arc);
//        im_fundo_des = view.findViewById(R.id.im_fundo_des);
//        im_fundo_im = view.findViewById(R.id.im_fundo_im);
//        im_fundo_mis = view.findViewById(R.id.im_fundo_mis);
//        im_fundo_per = view.findViewById(R.id.im_fundo_per);
//        im_fundo_ori = view.findViewById(R.id.im_fundo_ori);
//        im_fundo_lic = view.findViewById(R.id.im_fundo_lic);



         /*public void resultadoExp (String resultadoExp){


        String resultadoExp = getString(calcNome)

        ImageView imagemExp = view.findViewById(R.id.im_fundo_ex);

        switch (resultadoExp) {
            case "1":
                imagemExp.setImageResource(R.drawable.numero_1);
                break;
            case "2":
                imagemExp.setImageResource(R.drawable.numero_2);
                break;
            case "3":
                imagemExp.setImageResource(R.drawable.numero_3);
                break;
            case "4":
                imagemExp.setImageResource(R.drawable.numero_4);
                break;
            case "5":
                imagemExp.setImageResource(R.drawable.numero_5);
                break;
            case "6":
                imagemExp.setImageResource(R.drawable.numero_6);
                break;
            case "7":
                imagemExp.setImageResource(R.drawable.numero_7);
                break;
            case "8":
                imagemExp.setImageResource(R.drawable.numero_8);
                break;
            case "9":
                imagemExp.setImageResource(R.drawable.numero_9);
                break;
            case "11":
                imagemExp.setImageResource(R.drawable.numero_11);
                break;
            case "22":
                imagemExp.setImageResource(R.drawable.numero_22);
                break;
            default:
                break;

        }
        public void resultadoDes (String resultadoDes);

        ImageView imagemDes = view.findViewById(R.id.im_fundo_des);

        switch (resultadoDes) {
            case "1":
                im_fundo_des.setImageResource(R.drawable.numero_1);
                break;
            case "2":
                im_fundo_des.setImageResource(R.drawable.numero_2);
                break;
            case "3":
                im_fundo_des.setImageResource(R.drawable.numero_3);
                break;
            case "4":
                im_fundo_des.setImageResource(R.drawable.numero_4);
                break;
            case "5":
                im_fundo_des.setImageResource(R.drawable.numero_5);
                break;
            case "6":
                im_fundo_des.setImageResource(R.drawable.numero_6);
                break;
            case "7":
                im_fundo_des.setImageResource(R.drawable.numero_7);
                break;
            case "8":
                im_fundo_des.setImageResource(R.drawable.numero_8);
                break;
            case "9":
                im_fundo_des.setImageResource(R.drawable.numero_9);
                break;
            case "11":
                im_fundo_des.setImageResource(R.drawable.numero_11);
                break;
            case "22":
                im_fundo_des.setImageResource(R.drawable.numero_22);
                break;
            default:
                break;

        }
        public void resultadoMis (String resultadoMis);

        ImageView imagemMis = view.findViewById(R.id.im_fundo_mis);

        switch (resultadoMis) {
            case "1":
                im_fundo_mis.setImageResource(R.drawable.numero_1);
                break;
            case "2":
                im_fundo_mis.setImageResource(R.drawable.numero_2);
                break;
            case "3":
                im_fundo_mis.setImageResource(R.drawable.numero_3);
                break;
            case "4":
                im_fundo_mis.setImageResource(R.drawable.numero_4);
                break;
            case "5":
                im_fundo_mis.setImageResource(R.drawable.numero_5);
                break;
            case "6":
                im_fundo_mis.setImageResource(R.drawable.numero_6);
                break;
            case "7":
                im_fundo_mis.setImageResource(R.drawable.numero_7);
                break;
            case "8":
                im_fundo_mis.setImageResource(R.drawable.numero_8);
                break;
            case "9":
                im_fundo_mis.setImageResource(R.drawable.numero_9);
                break;
            case "11":
                im_fundo_mis.setImageResource(R.drawable.numero_11);
                break;
            case "22":
                im_fundo_mis.setImageResource(R.drawable.numero_22);
                break;
            default:
                break;

        }

        public void resultadoImp (String resultadoImp);

        ImageView imagemImp = view.findViewById(R.id.im_fundo_im);

        switch (resultadoImp) {
            case "1":
                im_fundo_im.setImageResource(R.drawable.numero_1);
                break;
            case "2":
                im_fundo_im.setImageResource(R.drawable.numero_2);
                break;
            case "3":
                im_fundo_im.setImageResource(R.drawable.numero_3);
                break;
            case "4":
                im_fundo_im.setImageResource(R.drawable.numero_4);
                break;
            case "5":
                im_fundo_im.setImageResource(R.drawable.numero_5);
                break;
            case "6":
                im_fundo_im.setImageResource(R.drawable.numero_6);
                break;
            case "7":
                im_fundo_im.setImageResource(R.drawable.numero_7);
                break;
            case "8":
                im_fundo_im.setImageResource(R.drawable.numero_8);
                break;
            case "9":
                im_fundo_im.setImageResource(R.drawable.numero_9);
                break;

            default:
                break;

        }

        public void resultadoArc (String resultadoArc);

        ImageView imagemArc = view.findViewById(R.id.im_fundo_arc);

        switch (resultadoArc) {
            case "1":
                im_fundo_arc.setImageResource(R.drawable.numero_1);
                break;
            case "2":
                im_fundo_arc.setImageResource(R.drawable.numero_2);
                break;
            case "3":
                im_fundo_arc.setImageResource(R.drawable.numero_3);
                break;
            case "4":
                im_fundo_arc.setImageResource(R.drawable.numero_4);
                break;
            case "5":
                im_fundo_arc.setImageResource(R.drawable.numero_5);
                break;
            case "6":
                im_fundo_arc.setImageResource(R.drawable.numero_6);
                break;
            case "7":
                im_fundo_arc.setImageResource(R.drawable.numero_7);
                break;
            case "8":
                im_fundo_arc.setImageResource(R.drawable.numero_8);
                break;
            case "9":
                im_fundo_arc.setImageResource(R.drawable.numero_9);
                break;

            default:
                break;

        } */

        def = new Definicoes();


        return view;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.im_fundo_ex:
                dialog(def.tituloexp(mNome), def.expressao(mNome));
                break;

            case R.id.im_fundo_arc:
                dialog("Titulo ARC", "msg ARC");
                break;

            case R.id.im_fundo_des:
                dialog(def.titulodest(mData), def.destino(mData));
                break;

            case R.id.im_fundo_im:
                dialog(def.tituloimp(mConsoante),def.impressao(mConsoante));
                break;

            case R.id.im_fundo_mis:
                dialog(def.titulomissao(mNomeData), def.missao(mNomeData));
                break;

            case R.id.im_fundo_per:
                dialog(def.titulodia(mDia), def.dia(mDia));
                break;

            case R.id.im_fundo_ori:
                dialog("Orientações", "Orientações");
                break;

            case R.id.im_fundo_lic:
                dialog("Lições", "LIÇÕES");
                break;

            default:
                break;
        }
    }

    private void dialog(String title, String msg){

        View viewdialog = getLayoutInflater().inflate(R.layout.customdialog, null);

        ((TextView)viewdialog.findViewById(R.id.tv_custom_titulo)).setText(title);
        ((TextView)viewdialog.findViewById(R.id.tv_custom_definicao)).setText(msg);

        ImageView ivClose = viewdialog.findViewById(R.id.iv_customdialog_close);

        final AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setCancelable(true);

        ivClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialogInterface) {
                        dialogInterface.dismiss();
                    }
                });
            }



        });



        builder.setView(viewdialog);
        builder.show();
    }
}