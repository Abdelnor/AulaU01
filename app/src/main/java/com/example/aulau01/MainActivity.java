package com.example.aulau01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickJogar(View view) {

        TextView texto = findViewById(R.id.txtResultado);

        int n1 = new Random().nextInt(11);

        texto.setText("Número: " + n1);

    }
}