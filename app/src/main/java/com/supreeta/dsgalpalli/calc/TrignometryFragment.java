package com.supreeta.dsgalpalli.calc;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class TrignometryFragment extends Fragment {

    Communicator comm;
    String value="";
    Button BtnSine, BtnCos, BtnTan, BtnLn, BtnLog, BtnE, BtnSlideBack,BtnSineInverse, BtnCosInverse, BtnTanInverse, BtnOpenBrac, BtnCloseBrac;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(
                R.layout.fragment_trignometry, container, false);
        BtnSine=(Button) view.findViewById(R.id.btnSine);
        BtnCos=(Button) view.findViewById(R.id.btnCos);
        BtnTan=(Button) view.findViewById(R.id.btnTan);
        BtnSineInverse=(Button) view.findViewById(R.id.btnSinInverse);
        BtnCosInverse=(Button) view.findViewById(R.id.btnCosInverse);
        BtnTanInverse=(Button) view.findViewById(R.id.btnTanInverse);
        BtnOpenBrac=(Button) view.findViewById(R.id.btnOpenBrac);
        BtnCloseBrac=(Button) view.findViewById(R.id.btnCloseBrac);
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
                value = "sin";
                comm.respond(value);
            }
        });

        BtnCos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value = "cos";
                comm.respond(value);
            }
        });

        BtnTan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value = "tan";
                comm.respond(value);
            }
        });

        BtnSineInverse.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value = "sin-1";
                comm.respond(value);
            }
        });

        BtnCosInverse.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value = "cos-1";
                comm.respond(value);
            }
        });

        BtnTanInverse.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value = "tan-1";
                comm.respond(value);
            }
        });
        BtnLn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value = "ln";
                comm.respond(value);
            }
        });

        BtnLog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value = "log";
                comm.respond(value);
            }
        });

        BtnE.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value = "e";
                comm.respond(value);
            }
        });

        BtnOpenBrac.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value = "(";
                comm.respond(value);
            }
        });

        BtnCloseBrac.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value = ")";
                comm.respond(value);
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
