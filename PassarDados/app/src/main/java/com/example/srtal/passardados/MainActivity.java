package com.example.srtal.passardados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etEnvia;
    Button btEnvia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEnvia = findViewById(R.id.etEnvia);
        btEnvia = findViewById(R.id.btEnvia);

        btEnvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SegundaTela.class);
                intent.putExtra("Chave", etEnvia.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }
}
