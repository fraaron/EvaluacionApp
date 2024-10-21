package com.example.evaluacion; // Cambia esto por tu paquete

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button dashboardButton = findViewById(R.id.btnDashboard);
        dashboardButton.setOnClickListener(v -> navigateToDashboard());

        Button mapButton = findViewById(R.id.btnOpenMap);
        mapButton.setOnClickListener(v -> navigateToMap());
    }

    private void navigateToDashboard() {
        Intent intent = new Intent(this, DashboardActivity.class);
        startActivity(intent);
    }

    private void navigateToMap() {
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }
}