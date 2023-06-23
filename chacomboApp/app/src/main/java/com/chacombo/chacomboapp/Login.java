package com.chacombo.chacomboapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Login extends AppCompatActivity {

    Button btnIniciarSesion,btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
     asignarReferencias();

    }

    private void asignarReferencias(){
        btnRegistrar=findViewById(R.id.bntRegistrar);
        btnRegistrar.setOnClickListener(view -> {
            Intent intent =new Intent(Login.this, NewAcount.class);
            startActivity(intent);
        });

    }
}