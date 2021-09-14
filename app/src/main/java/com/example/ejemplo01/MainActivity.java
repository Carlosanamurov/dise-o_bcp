package com.example.ejemplo01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText txtnombre;
private Button botonenviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*
        txtnombre = (EditText) findViewById(R.id.txtnombre);
        botonenviar = (Button) findViewById(R.id.botonenviar);

        botonenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = txtnombre.getText().toString();
               txtnombre.setText(  "Bienvenido: "+nombre);
            }
        });*/
    }
    public  void mensaje(View view){
        String nombre = txtnombre.getText().toString();
        txtnombre.setText(  "Bienvenido: "+nombre);

    }
}