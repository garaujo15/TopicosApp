package com.example.aluno.topicosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela2Activity extends AppCompatActivity {

    private Button btnvoltar;
    private Button btnCalcular;
    private EditText etValor;
    private EditText etCotacao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        btnvoltar = (Button) findViewById(R.id.buttonVoltar);
        btnCalcular = (Button) findViewById(R.id.buttonCalcular);
        etValor =(EditText) findViewById(R.id.editTextValor);
        etCotacao = (EditText)findViewById(R.id.editTextCotacao);

        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              startActivity(new Intent(Tela2Activity.this, MainActivity.class));


            }
        });
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String valor = etValor.getText().toString();
                Double.parseDouble(valor);
                

            }
        });


    }
}
