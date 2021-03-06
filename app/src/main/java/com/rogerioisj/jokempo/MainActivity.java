package com.rogerioisj.jokempo;


import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    public Jogadas jogada = new Jogadas();
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
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
        vibrator.vibrate(50);
        jogada.capturaJogadaHumano("Pedra");
        this.configuraRodada();
    }

    public void identificaJogadaPapelJogador(View view) {
        vibrator.vibrate(50);
        jogada.capturaJogadaHumano("Papel");
        this.configuraRodada();
    }

    public void identificaJogadaTesouraJogador(View view) {
        vibrator.vibrate(50);
        jogada.capturaJogadaHumano("Tesoura");
        this.configuraRodada();
    }
}