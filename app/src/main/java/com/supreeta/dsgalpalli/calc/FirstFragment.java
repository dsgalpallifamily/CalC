package com.supreeta.dsgalpalli.calc;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FirstFragment extends Fragment {

    Button BtnSeven, BtnEight, BtnNine, BtnFour, BtnFive, BtnSix, BtnOne, BtnTwo,BtnThree, BtnZero, BtnDot, BtnClear, BtnAdd, BtnMultiply, BtnDivide, BtnSubtract;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(
                R.layout.fragment_first, container, false);
        BtnOne=(Button) view.findViewById(R.id.btnOne);
        BtnTwo=(Button)view.findViewById(R.id.btnTwo);
        BtnThree=(Button)view.findViewById(R.id.btnThree);
        BtnFour=(Button)view.findViewById(R.id.btnFour);
        BtnFive=(Button)view.findViewById(R.id.btnFive);
        BtnSix=(Button)view.findViewById(R.id.btnSix);
        BtnSeven=(Button)view.findViewById(R.id.btnSeven);
        BtnEight=(Button)view.findViewById(R.id.btnEight);
        BtnNine=(Button)view.findViewById(R.id.btnNine);
        BtnZero=(Button)view.findViewById(R.id.btnZero);
        BtnDivide=(Button)view.findViewById(R.id.btnDivide);
        BtnMultiply=(Button)view.findViewById(R.id.btnDivide);
        BtnAdd=(Button)view.findViewById(R.id.btnAdd);
        BtnSubtract=(Button)view.findViewById(R.id.btnSubtract);
        BtnDot=(Button)view.findViewById(R.id.btnDot);

        BtnOne.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            }
        });

        BtnTwo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            }
        });

        BtnThree.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            }
        });

        BtnFour.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            }
        });

        BtnFive.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            }
        });

        BtnSix.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            }
        });

        BtnSeven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            }
        });

        BtnEight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            }
        });

        BtnNine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            }
        });

        BtnZero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            }
        });

        BtnDivide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            }
        });

        BtnMultiply.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            }
        });

        BtnAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            }
        });

        BtnSubtract.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            }
        });

        BtnDot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            }
        });

        return view;

    }

}
