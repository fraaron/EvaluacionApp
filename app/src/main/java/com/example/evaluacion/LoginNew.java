package com.example.evaluacion; // Cambia esto por tu paquete

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginNew extends AppCompatActivity {
    private EditText editTextEmail;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);

        Button loginButton = findViewById(R.id.btnLogin);
        loginButton.setOnClickListener(v -> loginUser());
    }

    private void loginUser() {
        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();

        // Cambia las credenciales aquí
        if (email.equals("franco.aburto18@gmail.com") && password.equals("123456")) {
            Intent intent = new Intent(LoginNew.this, MainActivity.class);
            startActivity(intent);
            finish(); // Finaliza LoginActivity
        } else {
            Toast.makeText(LoginNew.this, "Credenciales incorrectas.", Toast.LENGTH_SHORT).show();
        }
    }
}