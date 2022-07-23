package com.erenkaradana.smplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 =findViewById(R.id.num1);
        number2 =findViewById(R.id.num2);
        result =findViewById(R.id.resultText);
    }
    public void topla(View view){
        if(number1.getText().toString().matches("")||number2.getText().toString().matches("")){
            result.setText("Enter Number !");
        }

        else{
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());

            int result1 = num1 + num2;
            result.setText("Result :" + result1);
        }


    }
    public void cikar(View view){
        if(number1.getText().toString().matches("")||number2.getText().toString().matches("")){
            result.setText("Enter Number !");
        }

        else{
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());

            int result1 = num1 - num2;
            result.setText("Result :" + result1);
        }

    }
    public void carp(View view){
        if(number1.getText().toString().matches("")||number2.getText().toString().matches("")){
            result.setText("Enter Number !");
        }

        else{
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());

            int result1 = num1 * num2;
            result.setText("Result :" + result1);
        }

    }
    public void bol(View view){
        if(number1.getText().toString().matches("")||number2.getText().toString().matches("")){
            result.setText("Enter Number !");
        }

        else{
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());

            int result1 = num1 / num2;
            result.setText("Result :" + result1);
        }

    }

}