package com.supreeta.dsgalpalli.calc;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.fathzer.soft.javaluator.DoubleEvaluator;

public class TrignometryFragment extends Fragment {

    Communicator comm;
    String value="";
    Button BtnSine, BtnCos, BtnTan, BtnLn, BtnLog, BtnE, BtnSlideBack;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(
                R.layout.fragment_trignometry, container, false);
        BtnSine=(Button) view.findViewById(R.id.btnSine);
        BtnCos=(Button) view.findViewById(R.id.btnCos);
        BtnTan=(Button) view.findViewById(R.id.btnTan);
        BtnLn=(Button) view.findViewById(R.id.btnLN);
        BtnLog=(Button) view.findViewById(R.id.btnLog);
        BtnE=(Button) view.findViewById(R.id.btnE);
        BtnSlideBack=(Button) view.findViewById(R.id.btnSlideBack);

        return view;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comm = (Communicator) getActivity();
        //   BtnOne= (Button) getActivity().findViewById(R.id.btnOne);
        BtnSine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value = value + "sin30";
                comm.respond(value);
            }
        });

        BtnCos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                value = value + "cos";
//                comm.respond(value);
                Double result = new DoubleEvaluator().evaluate(value);
                comm.respond(String.valueOf(result));

            }
        });

        BtnSlideBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new SimpleCalFragment();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayoutId, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }




}
