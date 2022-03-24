package com.example.ejercicio22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnlista = (Button) findViewById(R.id.btnlista);
        Button btnbusqueda = (Button) findViewById(R.id.btnbusqueda);

        btnlista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), ListaActivity.class);
                startActivity(intent);
            }
        });

        btnbusqueda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), BusquedaActivity.class);
                startActivity(intent);
            }
        });
    }
}