package com.example.primass.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.primass.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ResultadoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ResultadoFragment extends Fragment {


    private ImageView im_fundo_ex, im_fundo_im, im_fundo_des,
            im_fundo_mis, im_fundo_arc;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ResultadoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ResultadoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ResultadoFragment newInstance(String param1, String param2) {
        ResultadoFragment fragment = new ResultadoFragment();
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
        View view = inflater.inflate(R.layout.fragment_resultado, container, false);

        im_fundo_ex = view.findViewById(R.id.im_fundo_ex);
        im_fundo_arc = view.findViewById(R.id.im_fundo_arc);
        im_fundo_des = view.findViewById(R.id.im_fundo_des);
        im_fundo_im = view.findViewById(R.id.im_fundo_im);
        im_fundo_mis = view.findViewById(R.id.im_fundo_mis);

        public void resultadoExp (String resultadoExp);

        ImageView imagemExp = view.findViewById(R.id.im_fundo_ex);

        switch (resultadoExp) {
            case "1":
                im_fundo_ex.setImageResource(R.drawable.numero_1);
                break;
            case "2":
                im_fundo_ex.setImageResource(R.drawable.numero_2);
                break;
            case "3":
                im_fundo_ex.setImageResource(R.drawable.numero_3);
                break;
            case "4":
                im_fundo_ex.setImageResource(R.drawable.numero_4);
                break;
            case "5":
                im_fundo_ex.setImageResource(R.drawable.numero_5);
                break;
            case "6":
                im_fundo_ex.setImageResource(R.drawable.numero_6);
                break;
            case "7":
                im_fundo_ex.setImageResource(R.drawable.numero_7);
                break;
            case "8":
                im_fundo_ex.setImageResource(R.drawable.numero_8);
                break;
            case "9":
                im_fundo_ex.setImageResource(R.drawable.numero_9);
                break;
            case "11":
                im_fundo_ex.setImageResource(R.drawable.numero_11);
                break;
            case "22":
                im_fundo_ex.setImageResource(R.drawable.numero_22);
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

        }

        return view;
    }

}