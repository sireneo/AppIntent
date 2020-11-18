package com.sijc.org;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = (TextView)findViewById(R.id.txt_saludo);

        String valor = getIntent().getStringExtra("dato");
        String valor1 = getIntent().getStringExtra("dato1");
        String valor2 = getIntent().getStringExtra("dato2");


        tv1.setText("Hola bienvenido: " + valor + " " + valor1 + " Edad " + valor2);

    }
    // meotodo para volver haica la pantalla uno
    public void Voler (View view){
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
}