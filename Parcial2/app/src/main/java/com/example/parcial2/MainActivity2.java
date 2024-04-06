package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView objetosa;
    TextView objetosa1;
    TextView objetosa2;
    TextView objetosa3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        objetosa=findViewById(R.id.objetosa);
        objetosa1=findViewById(R.id.objetosa1);
        objetosa2=findViewById(R.id.objetosa2);
        objetosa3=findViewById(R.id.objetosa3);

        Bundle RecibirObj = getIntent().getExtras();
        String objetos = RecibirObj.getString("obj1");
        String objetos1 = RecibirObj.getString("obj2");
        String objetos2 = RecibirObj.getString("obj3");
        String objetos3 = RecibirObj.getString("obj4");

        objetosa.setText(String.valueOf(objetos));
        objetosa1.setText(String.valueOf(objetos1));
        objetosa2.setText(String.valueOf(objetos2));
        objetosa3.setText(String.valueOf(objetos3));
    }
}