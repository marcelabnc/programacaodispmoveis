package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SobreActivity extends AppCompatActivity {

    private Integer contador;

    private TextView textContador;

    private ImageView imageViewParImpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_sobre);
        this.contador = intent.getIntExtra("contador", 0);
        textContador = findViewById(R.id.textContadorSobre);
        textContador.setText(String.valueOf(this.contador));
        imageViewParImpar = findViewById(R.id.imageViewParImpar);
        if (contador % 2 == 0) {
            imageViewParImpar.setImageResource(R.drawable.joelma);

        } else {
            imageViewParImpar.setImageResource(R.drawable.rbd);

        }
    }
}