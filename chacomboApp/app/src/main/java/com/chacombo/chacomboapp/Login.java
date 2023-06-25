package com.chacombo.chacomboapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class Login extends AppCompatActivity {

    Button btnIniciarSesion,btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
     asignarReferencias();

    }

    private void asignarReferencias(){
        btnIniciarSesion=findViewById(R.id.btnIniciarSesion);
        btnIniciarSesion.setOnClickListener(view -> {
            Intent intent =new Intent(Login.this, Menu.class);
            startActivity(intent);
        });

        btnRegistrar=findViewById(R.id.bntRegistrar);
        btnRegistrar.setOnClickListener(view -> {
            Intent intent =new Intent(Login.this, NewAcount.class);
            startActivity(intent);
        });

    }
}