package com.example.contabasket;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pontuacaoEquipaA = 0;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_01);
    }
        public void displayDaEquipaA ( int pontuacao){
            TextView aPontuacao = (TextView) findViewById(R.id.pontuacao_equipa_a);
            aPontuacao.setText(String.valueOf(pontuacao));
        }
        public void adicionaTresPontosEquipaA (View v){
            displayDaEquipaA(3);
        }

        public void adicionaDoisPontosEquipaA(View v){
            displayDaEquipaA(2);

        }

        public void adicionaUmPontoEquipaA(View v){
            displayDaEquipaA(1);
        }
        
    }

