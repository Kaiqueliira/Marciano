package com.example.marciano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    EditText pergunta;
    Button btnEnviar;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pergunta = (EditText) findViewById(R.id.pergunta);
        btnEnviar = (Button) findViewById(R.id.enviar);




        btnEnviar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(pergunta.getText().toString().toUpperCase().equals("SOME") || pergunta.getText().toString().toUpperCase().equals("SUBTRAIA") || pergunta.getText().toString().toUpperCase().equals("MULTIPLIQUE") || pergunta.getText().toString().toUpperCase().equals("DIVIDA")) {
                    Intent intent = new Intent(MainActivity.this, CalculosActivity.class);
                    intent.putExtra("operacao", pergunta.getText().toString());
                    startActivity(intent);
                    finish();
                }else{
                    Robo robo = new Robo();
                    result = robo.responda(pergunta.getText().toString());
                    Intent intent = new Intent(MainActivity.this, RespostaActivity.class);
                    intent.putExtra("resposta", result);
                    startActivity(intent);
                    finish();
                }


            }
        });


    }
}