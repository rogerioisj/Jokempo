package com.rogerioisj.jokempo;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public Jogadas jogada = new Jogadas();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void configuraOpcaoSelecionada(String opcaoSelecionada) {
        ImageView imagemJogadaApp = findViewById(R.id.imagem_jogada_app);
        System.out.println("A opcao " + opcaoSelecionada + " foi selecionada!");
        jogada.alteraImagemRespostaSelecaoApp(imagemJogadaApp);
    }

    public void identificaJogadaPedraJogador(View view) {
        this.configuraOpcaoSelecionada("Pedra");
        this.configuraOpcaoSelecionada(jogada.definirJogadaApp());
    }

    public void identificaJogadaPapelJogador(View view) {
        this.configuraOpcaoSelecionada("Papel");
        this.configuraOpcaoSelecionada(jogada.definirJogadaApp());
    }

    public void identificaJogadaTesouraJogador(View view) {
        this.configuraOpcaoSelecionada("Tesoura");
        this.configuraOpcaoSelecionada(jogada.definirJogadaApp());
    }
}