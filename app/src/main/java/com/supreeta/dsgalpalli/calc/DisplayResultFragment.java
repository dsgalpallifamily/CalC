package com.supreeta.dsgalpalli.calc;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fathzer.soft.javaluator.DoubleEvaluator;

import java.util.ArrayList;


public class DisplayResultFragment extends Fragment {

    TextView textView, textResult;
    ArrayList<String> list=new ArrayList<String>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result_display, container, false);

        return view;
    }

    public void changeText(String data){

        list.add(data);

        StringBuilder builder = new StringBuilder();
        for (String details : list) {
            builder.append(details);
        }

        textView.setText(builder.toString());
    }
    public void changeResult(String data){
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
