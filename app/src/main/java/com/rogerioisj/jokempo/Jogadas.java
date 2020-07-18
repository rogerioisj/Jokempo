package com.rogerioisj.jokempo;


import android.widget.ImageView;

import java.util.Random;

public class Jogadas {
    private String[] opcoes = {
            "Pedra",
            "Papel",
            "Tesoura"
    };

    private String opcaoApp = "";
    private String opcaoJogador = "";
    private int vitoriasJogador = 0;
    private int vitoriasApp = 0;

    public int getVitoriasJogador() {
        return vitoriasJogador;
    }

    public int getVitoriasApp() {
        return vitoriasApp;
    }

    public String appJoga() {
        int jogada = new Random().nextInt(3); //Retorna a posição do array
        return opcaoApp = opcoes[jogada];
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
        }
    }
    public void capturaJogadaHumano(String jogada){
        opcaoJogador = jogada;
    }

    public String validaRodada(){
        if(opcaoApp == "Pedra" && opcaoJogador == "Tesoura" || opcaoApp == "Papel" && opcaoJogador == "Pedra" || opcaoApp == "Tesoura" && opcaoJogador == "Papel"){
            System.out.println("Humano: " + opcaoJogador + ", App: " + opcaoApp);
            vitoriasApp++;
            return "App ganhou!";
        }
        else if(opcaoJogador == "Pedra" && opcaoApp == "Tesoura" || opcaoJogador == "Papel" && opcaoApp == "Pedra" || opcaoJogador == "Tesoura" && opcaoApp == "Papel" ){
            System.out.println("Humano: " + opcaoJogador + ", App: " + opcaoApp);
            vitoriasJogador++;
            return "Voce ganhou!";
        }
        else /*if(opcaoJogador == "Pedra" && opcaoApp == "Pedra" || opcaoJogador == "Papel" && opcaoApp == "Papel" || opcaoJogador == "Tesoura" && opcaoApp == "Tesoura")*/{
            System.out.println("Humano: " + opcaoJogador + ", App: " + opcaoApp);
            return "Empate!";
        }
    }
}

