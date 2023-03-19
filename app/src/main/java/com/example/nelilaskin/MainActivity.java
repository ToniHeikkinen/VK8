package com.example.nelilaskin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText textInput;
    private EditText textInput2;
    private TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInput=findViewById(R.id.editTextInput);
        textInput2=findViewById(R.id.editSecondText);
        textOutput=findViewById(R.id.textViewOutput);

    }

    public void sumNumbers(View view){
        try {
            String value1 = textInput.getText().toString();
            int finalValue1 = Integer.parseInt(value1);
            String value2 = textInput2.getText().toString();
            int finalValue2 = Integer.parseInt(value2);
            int sum = finalValue1 + finalValue2;
            textOutput.setText(Integer.toString(sum));
        }
        catch(Exception e) {
            textOutput.setText("Missing inputs!");
        }
    }

    public void substractNumbers(View view){
        try {
            String value1= textInput.getText().toString();
            int finalValue1=Integer.parseInt(value1);
            String value2= textInput2.getText().toString();
            int finalValue2=Integer.parseInt(value2);
            int substraction=finalValue1-finalValue2;
            textOutput.setText(Integer.toString(substraction));
        }
        catch(Exception e) {
            textOutput.setText("Missing inputs!");
        }
    }

    public void multiplyNumbers(View view){
        try {
            String value1= textInput.getText().toString();
            int finalValue1=Integer.parseInt(value1);
            String value2= textInput2.getText().toString();
            int finalValue2=Integer.parseInt(value2);
            int multiplication=finalValue1*finalValue2;
            textOutput.setText(Integer.toString(multiplication));
        }
        catch(Exception e) {
            textOutput.setText("Missing inputs!");
        }
    }

    public void divideNumbers(View view){
        try {
            String value1= textInput.getText().toString();
            int finalValue1=Integer.parseInt(value1);
            String value2= textInput2.getText().toString();
            int finalValue2=Integer.parseInt(value2);
            if(finalValue2==0){
                textOutput.setText("Division by zero!");
            }else{
                int division=finalValue1/finalValue2;
                textOutput.setText(Integer.toString(division));
            }
        }
        catch(Exception e) {
            textOutput.setText("Missing inputs!");
        }
    }
}