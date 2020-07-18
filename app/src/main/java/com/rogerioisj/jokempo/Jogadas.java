package com.rogerioisj.jokempo;

import java.util.Random;

public class Jogadas {
    private String[] opcoes = {
            "Pedra",
            "Papel",
            "Tesoura"
    };

    public String definirJogada(){
        int jogada = new Random().nextInt(3); //Retorna a posição do array
        return opcoes[jogada];
    }
}
