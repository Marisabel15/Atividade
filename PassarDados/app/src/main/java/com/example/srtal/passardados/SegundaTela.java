package com.example.srtal.passardados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaTela extends AppCompatActivity {

    TextView tvRecebe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        tvRecebe = findViewById(R.id.tvRecebe);
        String valor = getIntent().getStringExtra("Chave");
        tvRecebe.setText(valor);
    }
}
