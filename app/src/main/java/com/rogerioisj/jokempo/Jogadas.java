package com.rogerioisj.jokempo;


import android.widget.ImageView;

import java.util.Random;

public class Jogadas {
    private String[] opcoes = {
            "Pedra",
            "Papel",
            "Tesoura"
    };
    private String opcaoApp = "default";
    private String opcaoJogador = "default";

    public String definirJogadaApp() {
        int jogada = new Random().nextInt(3); //Retorna a posição do array
        opcaoApp = opcoes[jogada];
        return opcoes[jogada];
    }

    public void alteraImagemRespostaSelecaoApp(ImageView imageView) {
        switch (opcaoApp) {
            case "Pedra":
                imageView.setImageResource(R.drawable.pedra);
                break;
            case "Papel":
                imageView.setImageResource(R.drawable.papel);
                break;
            case "Tesoura":
                imageView.setImageResource(R.drawable.tesoura);
                break;
            default:
                imageView.setImageResource(R.drawable.padrao);
                break;

        }
    }
}
