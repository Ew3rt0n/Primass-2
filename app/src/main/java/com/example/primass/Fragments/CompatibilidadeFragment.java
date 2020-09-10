package com.example.primass.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.example.primass.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CompatibilidadeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CompatibilidadeFragment extends Fragment {

    private Button bt_compatibilidade;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CompatibilidadeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CompatibilidadeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CompatibilidadeFragment
    newInstance(String param1, String param2) {
        CompatibilidadeFragment fragment =
                new CompatibilidadeFragment();
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
    public View onCreateView(LayoutInflater inflater,
            ViewGroup container,
             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate
                (R.layout.fragment_compatibilidade,
                        container, false);

        bt_compatibilidade = view.findViewById
                (R.id.bt_compatibilidade);

        bt_compatibilidade.setOnClickListener
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


    return view;
    }
}