package com.supreeta.dsgalpalli.calc;


import android.os.Bundle;
import android.app.Fragment;
import android.text.TextUtils;
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

//        String joined = TextUtils.join("",list);
//        textView.setText(joined);
//        String text="";
//        for (String details : list) {
//            textView.setText(details);
//        }
    //    textView.setText(text);

//        for(int i=0;i<list.size();i++){
//            textView.setText(""+list.get(i));
//        }

    }
    public void changeResult(){
        StringBuilder builder = new StringBuilder();
        for (String details : list) {
            builder.append(details);
        }
        String val=builder.toString();
        String lastDigit = val.substring(val.length()-1);
                if(lastDigit.equals("+")){
                    val = val.substring(0, val.length()-1);
                }
        Double result = new DoubleEvaluator().evaluate(val);
        textResult.setText(String.valueOf(result));
    }

    public void clearText(){
        list.remove(list.size()-1);

        StringBuilder builder = new StringBuilder();
        for (String details : list) {
            builder.append(details);
        }

        textView.setText(builder.toString());
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView= (TextView) getActivity().findViewById(R.id.displayText);
        textResult= (TextView) getActivity().findViewById(R.id.displayResult);

    }
}
