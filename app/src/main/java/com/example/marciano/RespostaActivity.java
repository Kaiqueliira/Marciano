package com.example.marciano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RespostaActivity extends AppCompatActivity {

    TextView resposta;
    Button btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta);


        resposta = (TextView) findViewById(R.id.resposta);
        btnVoltar = (Button) findViewById(R.id.voltar);

        String valor =  getIntent().getStringExtra("resposta");

        resposta.setText(valor);

        btnVoltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(RespostaActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}