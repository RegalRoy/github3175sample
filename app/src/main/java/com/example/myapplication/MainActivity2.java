package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton, radioButton1;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        radioGroup = findViewById(R.id.radgrp);
        radioButton = findViewById(R.id.radioButton);
        radioButton1 = findViewById(R.id.radioButton2);
        txt = findViewById(R.id.textView3);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        int var = bundle.getInt("INTKEY");
        String str = bundle.getString("STRINGKEY");

        txt.setText("No of Tix is " + str + "\n" + "Total is "+ var);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radioButton:
                        Toast.makeText(MainActivity2.this, radioButton.getText().toString(), Toast.LENGTH_SHORT).show();break;
                    case R.id.radioButton2:
                        Toast.makeText(MainActivity2.this, radioButton1.getText().toString(), Toast.LENGTH_SHORT).show();break;
                    default:break;
                }
            }
        });


    }
}