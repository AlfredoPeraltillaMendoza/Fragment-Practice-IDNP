package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private LinearLayout layoutFlechas;
    private int numFlechas = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutFlechas = findViewById(R.id.layoutFlechas);
        Button btnAvanzar = findViewById(R.id.btnAvanzar);
        Button btnReiniciar = findViewById(R.id.btnReiniciar);

        btnAvanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarFlecha();
            }
        });

        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reiniciarFlechas();
            }
        });
    }

    private void agregarFlecha() {
        FlechaView flecha = new FlechaView(this);
        layoutFlechas.addView(flecha);
        numFlechas++;
    }

    private void reiniciarFlechas() {
        layoutFlechas.removeAllViews();
        numFlechas = 0;
    }
}