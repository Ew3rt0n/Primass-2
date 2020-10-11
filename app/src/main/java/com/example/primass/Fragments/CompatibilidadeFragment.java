package com.example.primass.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.example.primass.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CompatibilidadeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CompatibilidadeFragment extends Fragment {

    private ImageButton bt_compatib;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_NOME = "paramNome";
    private static final String ARG_DIA = "paramDia";
    private static final String ARG_MES = "paramMes";
    private static final String ARG_ANO = "paramAno";

    // TODO: Rename and change types of parameters
    private String mNome, mDia, mMes, mAno;


    public CompatibilidadeFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static CompatibilidadeFragment newInstance(String paramNome, String paramDia,String paramMes, String paramAno) {
        CompatibilidadeFragment fragment =
                new CompatibilidadeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_NOME, paramNome);
        args.putString(ARG_DIA, paramDia);
        args.putString(ARG_MES, paramMes);
        args.putString(ARG_ANO, paramAno);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mNome = getArguments().getString(ARG_NOME);
            mDia = getArguments().getString(ARG_DIA);
            mMes = getArguments().getString(ARG_MES);
            mAno = getArguments().getString(ARG_ANO);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
            ViewGroup container,
             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate
                (R.layout.fragment_compatibilidade,
                        container, false);

        ((EditText)view.findViewById(R.id.campoNome2)).setText(mNome);
        ((EditText)view.findViewById(R.id.tv_dia2)).setText(mDia);
        ((EditText)view.findViewById(R.id.tv_mes2)).setText(mMes);
        ((EditText)view.findViewById(R.id.tv_ano2)).setText(mAno);

        bt_compatib = view.findViewById
                (R.id.bt_compatib);

        bt_compatib.setOnClickListener
                (new View.OnClickListener() {
            @Override
            public void onClick(View view) {


         AlertDialog.Builder builder = new
                 AlertDialog.Builder(getContext());

         View viewdialog = getLayoutInflater().inflate
                 (R.layout.customdialog, null);

         builder.setView(viewdialog)
         .show();

            }
        });

        /*numero 1 vibra com: 9
                   Atrai: 4,8
                   Oposto: 6, 7
                   Compativel: 1
                   Passivo: 2, 3, 5

         numero 2 vibra com:8
                   Atrai: 7,9
                   Oposto: 5
                   Compativel: 2
                   Passivo: 1, 3, 4, 6

         numero 3 vibra com: 7
                   Atrai: 5, 6, 9
                   Oposto: 4, 8
                   Compativel: 3
                   Passivo: 1, 2

         numero 4 vibra com: 6
                   Atrai: 1,8
                   Oposto: 3, 5
                   Compativel: 4
                   Passivo: 2, 7, 9

         numero 5 vibra com: 5
                   Atrai: 3,9
                   Oposto: 2, 4, 6
                   Passivo: 1, 7, 8

          numero 6 vibra com: 4
                   Atrai: 3,7, 9
                   Oposto: 1, 8, 5
                   Compativel: 6
                   Passivo: 2

          numero 7 vibra com: 3
                   Atrai: 2,6
                   Oposto: 1, 9
                   Compativel: 7
                   Passivo: 4, 5, 8

         numero 8 vibra com: 2
                   Atrai: 1,4
                   Oposto: 3, 6
                   Compativel: 8
                   Passivo: 5, 7, 9

          numero 9 vibra com: 1
                   Atrai: 2,3, 5, 6
                   Oposto: 7
                   Compativel: 9
                   Passivo: 4, 8
         */



    return view;
    }
}