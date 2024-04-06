package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button carrera1;
    Button carrera2;
    Button carrera3;
    Button carrera4;

    EditText nombre;
    EditText apellido;
    EditText cedula;
    EditText nacimiento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.Nombre);
        apellido = findViewById(R.id.Apellido);
        cedula = findViewById(R.id.Cedula);
        nacimiento = findViewById(R.id.Nacimiento);


        carrera1 =(Button)findViewById(R.id.carrera1);
        carrera1.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {

                Bundle objetos1 = new Bundle();
                objetos1.putString("obj1",nombre.getText().toString());
                Bundle objetos2 = new Bundle();
                objetos2.putString("obj2",apellido.getText().toString());
                Bundle objetos3 = new Bundle();
                objetos3.putString("obj3",cedula.getText().toString());
                Bundle objetos4 = new Bundle();
                objetos4.putString("obj4",nacimiento.getText().toString());

                Intent i = new Intent ( MainActivity.this, MainActivity2.class);

                i.putExtras(objetos1);
                i.putExtras(objetos2);
                i.putExtras(objetos3);
                i.putExtras(objetos4);
                startActivity(i);
                finish();

            }

        });

    }


}