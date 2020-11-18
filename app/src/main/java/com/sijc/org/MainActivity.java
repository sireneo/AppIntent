package com.sijc.org;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText ed1,ed2,ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText)findViewById(R.id.txt_valor);
        ed2 = (EditText)findViewById(R.id.txt_otro);
        ed3 = (EditText)findViewById(R.id.txt_edad);


    }
    // metodo para enviar los datos
    public void Enviar(View view){
        Intent primero = new Intent(this, MainActivity2.class);
        primero.putExtra("dato", ed1.getText().toString());
        primero.putExtra("dato1", ed2.getText().toString());
        primero.putExtra("dato2", ed3.getText().toString());


        startActivity(primero);
    }
}