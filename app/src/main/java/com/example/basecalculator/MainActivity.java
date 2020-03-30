package com.example.basecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button pls;
    Button min;
    Button mul;
    Button div;
    Button pow;
    EditText basenumber1;
    EditText basenumber2;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        pls = (Button)findViewById(R.id.button_plus);
        min = (Button) findViewById(R.id.button_minus);
        mul =  (Button)findViewById(R.id.button_mul);
        div = (Button) findViewById(R.id.button_div);
        pow =  (Button)findViewById(R.id.button_pow);
        answer= (TextView) findViewById(R.id.a2);
        basenumber1= (EditText) findViewById(R.id.a0);
        basenumber2= (EditText) findViewById(R.id.a1);


        pls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(basenumber1.getText().toString());
                float num2 = Float.parseFloat(basenumber2.getText().toString());
                float Ans = num1+num2;
                answer.setText(String.valueOf(Ans));

            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(basenumber1.getText().toString());
                float num2 = Float.parseFloat(basenumber2.getText().toString());
                float Ans = num1-num2;
                answer.setText(String.valueOf(Ans));

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(basenumber1.getText().toString());
                float num2 = Float.parseFloat(basenumber2.getText().toString());
                float Ans = num1*num2;
                answer.setText(String.valueOf(Ans));

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(basenumber1.getText().toString());
                float num2 = Float.parseFloat(basenumber2.getText().toString());
                float Ans = num1/num2;
                answer.setText(String.valueOf(Ans));

            }
        });

        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(basenumber1.getText().toString());
                float num2 = Float.parseFloat(basenumber2.getText().toString());
                float Ans = (float) Math.pow(num1,num2);
                answer.setText(String.valueOf(Ans));

            }
        });


    }
}
