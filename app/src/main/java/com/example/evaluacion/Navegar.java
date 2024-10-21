package com.example.evaluacion; // Cambia esto por tu paquete

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class Navegar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otra);

        TextView textView = findViewById(R.id.textViewMessage);
        textView.setText("¡Bienvenido a otra actividad!");
    }
}