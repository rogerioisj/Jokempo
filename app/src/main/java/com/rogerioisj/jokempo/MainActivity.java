package com.rogerioisj.jokempo;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public Jogadas jogada = new Jogadas();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void configuraRodada() {
        ImageView imagemJogadaApp = findViewById(R.id.imagem_jogada_app);
        TextView informativoRodada = findViewById(R.id.informativo_rodada);
        TextView contador = findViewById(R.id.contador);
        jogada.appJoga();
        informativoRodada.setText(jogada.validaRodada());
        jogada.alteraImagemRespostaSelecaoApp(imagemJogadaApp);
        contador.setText("Voce: " + jogada.getVitoriasJogador() + " x " + jogada.getVitoriasApp() + ": App");
    }

    public void identificaJogadaPedraJogador(View view) {
        jogada.capturaJogadaHumano("Pedra");
        this.configuraRodada();
    }

    public void identificaJogadaPapelJogador(View view) {
        jogada.capturaJogadaHumano("Papel");
        this.configuraRodada();
    }

    public void identificaJogadaTesouraJogador(View view) {
        jogada.capturaJogadaHumano("Tesoura");
        this.configuraRodada();
    }
}