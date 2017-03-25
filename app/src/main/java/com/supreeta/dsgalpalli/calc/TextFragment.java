package com.supreeta.dsgalpalli.calc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.fathzer.soft.javaluator.DoubleEvaluator;


public class TextFragment extends Fragment {

    TextView textView, textResult;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_text, container, false);

        return view;
    }

    public void changeText(String data){
        textView.setText(data);
    }
    public void changeResult(String data){
       // data+=data;
        Double result = new DoubleEvaluator().evaluate(data);
        textResult.setText(String.valueOf(result));
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView= (TextView) getActivity().findViewById(R.id.displayText);
        textResult= (TextView) getActivity().findViewById(R.id.displayResult);

    }
}
