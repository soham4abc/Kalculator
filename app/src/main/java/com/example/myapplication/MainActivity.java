package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText calculation,result;
    private String curr,res;
    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnMul,btnDiv,btnSub,btnAdd,btnDec,btnDel,btnAC;
    private  boolean dot_inserted,operator_inserted;
    private Button btnEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculation=(EditText) findViewById(R.id.calculation);
        result = (EditText) findViewById(R.id.result);
        curr ="";
        res ="";
        dot_inserted=false;
        operator_inserted=false;
        btn0=(Button) findViewById(R.id.btn0);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btnMul=(Button) findViewById(R.id.btnMul);
        btnDiv=(Button) findViewById(R.id.btnDiv);
        btnSub=(Button) findViewById(R.id.btnSub);
        btnAdd=(Button) findViewById(R.id.btnAdd);
        btnDel=(Button) findViewById(R.id.btnDel);
        btnAC=(Button) findViewById(R.id.btnAC);
        btnDec=(Button) findViewById(R.id.btnDec);
        btnEqual=(Button) findViewById(R.id.btnEqual);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "0";
                displayOne();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "1";
                displayOne();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "2";
                displayOne();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "3";
                displayOne();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "4";
                displayOne();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "5";
                displayOne();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "6";
                displayOne();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "7";
                displayOne();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "8";
                displayOne();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "9";
                displayOne();
            }
        });

        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(curr.isEmpty()){
                    curr="0.";
                    dot_inserted=true;
                }
                if(dot_inserted==false){
                    curr = curr + ".";
                    dot_inserted=true;
                }



                displayOne();


            }
        });



        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                displayOne();
                displayTwo();
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backspace();
                displayOne();
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_inserted=false;
                if(!curr.isEmpty()){
                   if(curr.substring(curr.length()-1,curr.length()).equals(("."))){
                       backspace();
                   }
                   if(operator_inserted==false){
                       curr=curr+" / ";
                       operator_inserted=true;

                   }
                   displayOne();
                }

            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_inserted=false;
                if(!curr.isEmpty()){
                    if(curr.substring(curr.length()-1,curr.length()).equals(("."))){
                        backspace();
                    }
                    if(operator_inserted==false){
                        curr=curr+" * ";
                        operator_inserted=true;

                    }
                    displayOne();
                }

            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_inserted=false;
                if(!curr.isEmpty()){
                    if(curr.substring(curr.length()-1,curr.length()).equals(("."))){
                        backspace();
                    }
                    if(operator_inserted==false){
                        curr=curr+" - ";
                        operator_inserted=true;

                    }
                    displayOne();
                }

            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_inserted=false;
                if(!curr.isEmpty()){
                    if(curr.substring(curr.length()-1,curr.length()).equals(("."))){
                        backspace();
                    }
                    if(operator_inserted==false){
                        curr=curr+" + ";
                        operator_inserted=true;

                    }
                    displayOne();
                }

            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(curr.substring(curr.length()-1,curr.length()).equals(" "))&&(operator_inserted=true)){

                    String[] tokens =curr.split(" ");
                    switch (tokens[1].charAt(0)){
                        case '+':
                            res=Double.toString (Double.parseDouble(tokens[0])+ Double.parseDouble(tokens[2]));
                            break;
                        case '-':
                            res=Double.toString (Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]));
                            break;
                        case '/':
                            res=Double.toString (Double.parseDouble(tokens[0])/ Double.parseDouble(tokens[2]));
                            break;
                        case '*':
                            res=Double.toString (Double.parseDouble(tokens[0])* Double.parseDouble(tokens[2]));
                            break;
                    }
                    displayTwo();
                }

            }
        });



    }
    public void displayOne(){

        calculation.setText(curr);

    }
    public void displayTwo(){

        result.setText(res);

    }
    public void clear (){
        curr="";
        res="";
        dot_inserted=false;
        operator_inserted=false;
    }
    public void backspace(){
        if(!curr.isEmpty()){
            if(curr.substring(curr.length()-1,curr.length()).equals("."))
                dot_inserted=false;
            if((curr.substring(curr.length()-1,curr.length()).equals(" "))) {
                operator_inserted = false;
                curr=curr.substring(0,curr.length()-2);
            }
            }
            curr=curr.substring(0,curr.length()-1);

        }

    }
