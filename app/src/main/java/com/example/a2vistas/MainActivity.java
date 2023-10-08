package com.example.a2vistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textContador = findViewById(R.id.textContador); // Agregado el punto y coma al final

        Button btnIrASecondActivity = findViewById(R.id.btnIrASecondActivity);

        btnIrASecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CountDownTimer contador = new CountDownTimer(10000, 1000) {
                    @Override
                    public void onTick(long l) {
                        textContador.setText("Tiempo:" + l / 1000);
                    }

                    @Override
                    public void onFinish() {
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                    }
                };

                contador.start(); // Olvidaste iniciar el contador con start()
            }
        });
    }
}
