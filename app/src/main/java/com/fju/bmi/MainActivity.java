package com.fju.bmi;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bmi(View view){
        EditText edWeight =(EditText)findViewById(R.id.ed_weight);
        EditText edHeight =(EditText)findViewById(R.id.ed_height);
        float weight =Float.parseFloat(edWeight.getText().toString());
        float height =Float.parseFloat(edHeight.getText().toString());
        float bmi = weight/(height*height);
if(bmi<20){
        new AlertDialog.Builder(this)
                .setMessage("您的BMI"+bmi)
                .setTitle("結果")
                .setNeutralButton("OK",null)
                .show();
    Toast.makeText(this,"請多吃點",Toast
    .LENGTH_SHORT).show();


    }
    if(bmi>=20){
        new AlertDialog.Builder(this)
                .setMessage("您的BMI"+bmi)
                .setTitle("結果")
                .setNeutralButton("OK",null)
                .show();
    }

    }}

