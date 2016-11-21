package com.example.ian.practmocktestq1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    String name;
    String phone;
    String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = (Button) findViewById(R.id.submit);
        final EditText text1 = (EditText) findViewById(R.id.text1);
        final EditText text2 = (EditText) findViewById(R.id.textphone);
        final RadioGroup rad = (RadioGroup) findViewById(R.id.radiogrp);
        final TextView te = (TextView) findViewById(R.id.textreg);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = text1.getText().toString();
                phone = text2.getText().toString();


               if(rad.getCheckedRadioButtonId()!=-1){


                   gender = findViewById(rad.getCheckedRadioButtonId()).toString();




               }

                te.setText(name+" "+phone+" "+gender);

            }
        });




    }
}
