package br.com.treino.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.List;
import java.util.Random;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView resultado;
    private Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        resultado = findViewById(R.id.resultado);

        voltar = findViewById(R.id.buttonVoltar);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Bundle dados = getIntent().getExtras();
        int number = dados.getInt("numero");

        if(number == 0){
            resultado.setImageResource(R.drawable.moeda_cara);
        } else {
            resultado.setImageResource(R.drawable.moeda_coroa);
        }



    }

}