package com.example.a2vistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();
        String inputnombre=extras.getString("nombrestring");
        String inputapellidos=extras.getString("apellidosstring");

        TextView vernombres=(TextView) findViewById(R.id.vernombres);
        TextView verapellidos=(TextView) findViewById(R.id.verapellidos);


        vernombres.setText(inputnombre);
        verapellidos.setText(inputapellidos);
    }

}