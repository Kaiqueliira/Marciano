package com.example.marciano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class CalculosActivity extends AppCompatActivity {


    TextView operacao;
    EditText number1;
    EditText number2;
    Button btnCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos);

        number1 = (EditText) findViewById( R.id.number1);
        number2 = (EditText) findViewById( R.id.number2);
        operacao = (TextView) findViewById(R.id.operacao);
        btnCalcular = (Button) findViewById(R.id.calcular);

        String tipo =  getIntent().getStringExtra("operacao").toString();

        operacao.setText(tipo);

        btnCalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            RoboAvancado robo = new RoboAvancado();
            String res;
            res =  robo.calculo(tipo,Double.parseDouble(String.valueOf(number1.getText())), Double.parseDouble(String.valueOf(number2.getText())));

                Intent intent = new Intent(CalculosActivity.this, RespostaActivity.class);
                intent.putExtra("resposta", res);
                startActivity(intent);
                finish();


            }
        });



    }
}