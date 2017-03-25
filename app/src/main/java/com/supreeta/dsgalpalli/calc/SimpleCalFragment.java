package com.supreeta.dsgalpalli.calc;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class
        SimpleCalFragment extends Fragment {

    boolean add,sub,div,mul;
    Button BtnSeven, BtnEight, BtnNine, BtnFour, BtnFive,BtnSix, BtnOne, BtnTwo,BtnThree, BtnZero, BtnDot, BtnClear, BtnAdd, BtnMultiply, BtnDivide, BtnSubtract, BtnBracket, BtnDoubleZero, BtnPercent, BtnEqual, BtnSlide ;
    Communicator comm;
    String value="";
    boolean flag=true;
    int count=0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(
                R.layout.fragment_cal_simple, container, false);
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
        BtnMultiply=(Button)view.findViewById(R.id.btnMultiply);
        BtnAdd=(Button)view.findViewById(R.id.btnAdd);
        BtnSubtract=(Button)view.findViewById(R.id.btnSubtract);
        BtnDot=(Button)view.findViewById(R.id.btnDot);
        BtnClear=(Button)view.findViewById(R.id.btnClear);
        BtnDoubleZero=(Button)view.findViewById(R.id.btnDoubleZero);
        BtnPercent=(Button)view.findViewById(R.id.btnPercent);
        BtnEqual=(Button)view.findViewById(R.id.btnEqual);
        BtnBracket=(Button)view.findViewById(R.id.btnBracket);
        BtnSlide=(Button) view.findViewById(R.id.btnSlide);

        return view;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comm= (Communicator) getActivity();
     //   BtnOne= (Button) getActivity().findViewById(R.id.btnOne);
        BtnOne.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                value=value+"1";
                comm.respond(value);
            }
        });

        BtnSeven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value = value + "7";
                comm.respond(value);
            }
        });



        BtnTwo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value=value+"2";
                comm.respond(value);
            }
        });

        BtnThree.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value = value + "3";
                comm.respond(value);
            }
        });

        BtnFour.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value=value+"4";
                comm.respond(value);
            }
        });

        BtnFive.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value=value+"5";
                comm.respond(value);
            }
        });

        BtnSix.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value=value+"6";
                comm.respond(value);
            }
        });



        BtnEight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value = value + "8";
                comm.respond(value);
            }
        });

        BtnNine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value=value+"9";
                comm.respond(value);
            }
        });

        BtnDoubleZero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value=value+"00";
                comm.respond(value);
            }
        });

        BtnBracket.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value=value+"(";
                comm.respond(value);
            }
        });

            BtnPercent.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    //   value=value+"(";
                    flag = false;
                    comm.respond(value);
                }
            });

        BtnZero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value=value+"0";
                comm.respond(value);
            }
        });

        BtnDivide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (value != null) {
                    value = value + "/";
                    comm.respond(value);
                }
                div=true;
            }
        });

        BtnMultiply.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                value=value+"*";
                comm.respond(value);
                mul=true;
            }
        });


            BtnAdd.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    String lastDigit = value.substring(value.length()-1);
                    if (value != null && value.length()>0 && lastDigit != "+") {
                        value = value + "+";
                        count=0;
                        comm.respond(value);
                        add = true;
                    }
                }
            });
        
        BtnSubtract.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value=value+"-";
                comm.respond(value);
                sub=true;
            }
        });

        BtnDot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (count==0 && value!=null) {
                    value = value + ".";
                    count++;
                    comm.respond(value);
                }
            }
        });


        BtnSlide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

               Fragment fragment = new TrignometryFragment();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayoutId, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        BtnClear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (value != null && value.length() > 0) {
                    value = value.substring(0, value.length()-1);
                }
                comm.respond(value);
            }
        });
        BtnEqual.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                comm.result(value);
            }
        });

    }
}
