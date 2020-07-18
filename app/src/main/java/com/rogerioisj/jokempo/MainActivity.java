package com.rogerioisj.jokempo;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.rogerioisj.jokempo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void identificaJogadaPedra(View view) {
        configuraOpcaoSelecionada("Pedra");
    }

    public void identificaJogadaPapel(View view) {
        configuraOpcaoSelecionada("Papel");

    }

    public void identificaJogadaTesoura(View view) {
        configuraOpcaoSelecionada("Tesoura");

    }

    public void configuraOpcaoSelecionada(String opcao){
        System.out.println("A opcao "+opcao+" foi selecionada!");

    }
}