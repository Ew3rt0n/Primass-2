package com.example.primass.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.example.primass.Definicoes;
import com.example.primass.R;
import com.example.primass.calculos.Calculos;
import com.example.primass.model.Convercoes;
import com.example.primass.utils.Constants;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CompatibilidadeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CompatibilidadeFragment extends Fragment implements View.OnClickListener {

    private ImageButton bt_compatib;

    private Convercoes valConvercoesPrimeiro;
    private Convercoes valConvercoesSecundario;

    private View view;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_NOME = "paramNome";
    private static final String ARG_DIA = "paramDia";
    private static final String ARG_MES = "paramMes";
    private static final String ARG_ANO = "paramAno";

    // TODO: Rename and change types of parameters
    private String mNome, mDia, mMes, mAno;

    private EditText primNome, primDia, primMes, primAno, secNome, secDia, secMes, secAno;

    public CompatibilidadeFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static CompatibilidadeFragment newInstance(String paramNome, String paramDia, String paramMes, String paramAno) {
        CompatibilidadeFragment fragment = new CompatibilidadeFragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_compatibilidade, container, false);

        primNome = ((EditText) view.findViewById(R.id.campoNome2));
        primDia = ((EditText) view.findViewById(R.id.tv_dia2));
        primMes = ((EditText) view.findViewById(R.id.tv_mes2));
        primAno = ((EditText) view.findViewById(R.id.tv_ano2));
        secNome = ((EditText) view.findViewById(R.id.campoNome3));
        secDia = ((EditText) view.findViewById(R.id.tv_dia3));
        secMes = ((EditText) view.findViewById(R.id.tv_mes3));
        secAno = ((EditText) view.findViewById(R.id.tv_ano3));
        primNome.setText(mNome);
        primDia.setText(mDia);
        primMes.setText(mMes);
        primAno.setText(mAno);

        bt_compatib = view.findViewById(R.id.bt_compatib);

        bt_compatib.setOnClickListener(this);

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
        //teste

        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.bt_compatib:
                calcular();
                break;
        }

        hideKeyBoard();
    }

    private void calcular() {

        valConvercoesPrimeiro = new Convercoes();
        valConvercoesSecundario = new Convercoes();

        Calculos calc = new Calculos();

        valConvercoesPrimeiro.setValNome(calc.calcNome(primNome.getText().toString(), false));
        valConvercoesPrimeiro.setValData(calc.calcData(primDia.getText().toString() + primMes.getText().toString() + primAno.getText().toString(), false));
        valConvercoesPrimeiro.setValNomeComData(calc.calcNomeComData(valConvercoesPrimeiro.getValNome(), valConvercoesPrimeiro.getValData(), false));

        calc = new Calculos();
        valConvercoesSecundario.setValNome(calc.calcNome(secNome.getText().toString(), false));
        valConvercoesSecundario.setValData(calc.calcData(secDia.getText().toString() + secMes.getText().toString() + secAno.getText().toString(), false));
        valConvercoesSecundario.setValNomeComData(calc.calcNomeComData(valConvercoesSecundario.getValNome(), valConvercoesSecundario.getValData(), false));

        comparacao(valConvercoesPrimeiro.getValNomeComData(), valConvercoesSecundario.getValNomeComData());

    }

    private void comparacao(String prim, String sec) {
        String def = "";
        switch (prim){
            case "1":
/*
                   numero 1 vibra com:
                   Atrai:
                   Oposto: ,
                   Compativel:
                   Passivo: , ,
*/
                if (sec.equals("9")) {
                    def = Constants.VIBRA;
                }else if (sec.equals("4")||sec.equals("8")){
                    def = Constants.ATRAI;
                }else if (sec.equals("6")||sec.equals("7")){
                    def = Constants.OPOSTO;
                }else if (sec.equals("1")){
                    def = Constants.COMPATIVEL;
                }else if (sec.equals("2")||sec.equals("3")||sec.equals("5")){
                    def = Constants.PASSIVO;
                }
                break;

            case "2":
/*
         numero 2 vibra com:
                   Atrai: ,
                   Oposto:
                   Compativel:
                   Passivo: , , ,
*/
                if (sec.equals("8")) {
                    def = Constants.VIBRA;
                }else if (sec.equals("7")||sec.equals("9")){
                    def = Constants.ATRAI;
                }else if (sec.equals("5")){
                    def = Constants.OPOSTO;
                }else if (sec.equals("2")){
                    def = Constants.COMPATIVEL;
                }else if (sec.equals("1")||sec.equals("3")||sec.equals("4")||sec.equals("6")){
                    def = Constants.PASSIVO;
                }
                break;

            case "3":
                /*
         numero 3 vibra com:
                   Atrai: , ,
                   Oposto: ,
                   Compativel:
                   Passivo: ,
                 */
                if (sec.equals("7")) {
                    def = Constants.VIBRA;
                }else if (sec.equals("5")||sec.equals("6")||sec.equals("9")){
                    def = Constants.ATRAI;
                }else if (sec.equals("4")||sec.equals("8")){
                    def = Constants.OPOSTO;
                }else if (sec.equals("3")){
                    def = Constants.COMPATIVEL;
                }else if (sec.equals("1")||sec.equals("2")){
                    def = Constants.PASSIVO;
                }
                break;

            case "4":
                /*
         numero 4 vibra com:
                   Atrai: ,
                   Oposto: ,
                   Compativel:
                   Passivo: , ,
                 */
                if (sec.equals("6")) {
                    def = Constants.VIBRA;
                }else if (sec.equals("1")||sec.equals("8")){
                    def = Constants.ATRAI;
                }else if (sec.equals("3")||sec.equals("5")){
                    def = Constants.OPOSTO;
                }else if (sec.equals("4")){
                    def = Constants.COMPATIVEL;
                }else if (sec.equals("2")||sec.equals("7")||sec.equals("9")){
                    def = Constants.PASSIVO;
                }
                break;

            case "5":
                /*
         numero 5 vibra com:
                   Atrai: ,
                   Oposto: , ,
                   Passivo: , ,
                 */
                if (sec.equals("5")) {
                    def = Constants.VIBRA;
                }else if (sec.equals("3")||sec.equals("9")){
                    def = Constants.ATRAI;
                }else if (sec.equals("2")||sec.equals("4")||sec.equals("6")){
                    def = Constants.OPOSTO;
                }else if (sec.equals("1")||sec.equals("7")||sec.equals("8")){
                    def = Constants.PASSIVO;
                }
                break;

            case "6":
                /*
          numero 6 vibra com:
                   Atrai: ,,
                   Oposto: , ,
                   Compativel:
                   Passivo:
                 */
                if (sec.equals("4")) {
                    def = Constants.VIBRA;
                }else if (sec.equals("3")||sec.equals("7")||sec.equals("9")){
                    def = Constants.ATRAI;
                }else if (sec.equals("1")||sec.equals("8")||sec.equals("5")){
                    def = Constants.OPOSTO;
                }else if (sec.equals("6")){
                    def = Constants.COMPATIVEL;
                }else if (sec.equals("2")){
                    def = Constants.PASSIVO;
                }
                break;

            case "7":
                /*
          numero 7 vibra com:
                   Atrai: ,
                   Oposto: ,
                   Compativel:
                   Passivo: , ,
                 */
                if (sec.equals("3")) {
                    def = Constants.VIBRA;
                }else if (sec.equals("2")||sec.equals("6")){
                    def = Constants.ATRAI;
                }else if (sec.equals("1")||sec.equals("9")){
                    def = Constants.OPOSTO;
                }else if (sec.equals("7")){
                    def = Constants.COMPATIVEL;
                }else if (sec.equals("4")||sec.equals("5")||sec.equals("8")){
                    def = Constants.PASSIVO;
                }
                break;

            case "8":
                /*
         numero 8 vibra com:
                   Atrai: ,
                   Oposto: ,
                   Compativel:
                   Passivo: , ,
                 */
                if (sec.equals("2")) {
                    def = Constants.VIBRA;
                }else if (sec.equals("1")||sec.equals("4")){
                    def = Constants.ATRAI;
                }else if (sec.equals("3")||sec.equals("6")){
                    def = Constants.OPOSTO;
                }else if (sec.equals("8")){
                    def = Constants.COMPATIVEL;
                }else if (sec.equals("5")||sec.equals("7")||sec.equals("9")){
                    def = Constants.PASSIVO;
                }
                break;

            case "9":
                /*
          numero 9 vibra com:
                   Atrai: ,, ,
                   Oposto:
                   Compativel:
                   Passivo: ,
                 */
                if (sec.equals("1")) {
                    def = Constants.VIBRA;
                }else if (sec.equals("2")||sec.equals("3")||sec.equals("5")||sec.equals("6")){
                    def = Constants.ATRAI;
                }else if (sec.equals("7")){
                    def = Constants.OPOSTO;
                }else if (sec.equals("9")){
                    def = Constants.COMPATIVEL;
                }else if (sec.equals("4")||sec.equals("8")){
                    def = Constants.PASSIVO;
                }
                break;

            default:
                break;
        }
        dialog(def);
    }

    private void dialog(String definicao){

        View viewdialog = getLayoutInflater().inflate(R.layout.customdialog, null);

        ((TextView) viewdialog.findViewById(R.id.tv_custom_titulo)).setText(definicao);
        ((TextView) viewdialog.findViewById(R.id.tv_custom_definicao)).setText(new Definicoes().compatibilidade(definicao));

        final AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setCancelable(true);

        builder.setView(viewdialog);
        builder.show();

    }

    public void hideKeyBoard() {
        View view1 = getActivity().getCurrentFocus();
        if(view1!= null){
            InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view1.getWindowToken(), 0);
        }
    }

}