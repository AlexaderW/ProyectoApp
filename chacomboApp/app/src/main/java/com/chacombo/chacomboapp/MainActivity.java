package com.chacombo.chacomboapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnIniciar ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asignarReferencias();
    }

    private void asignarReferencias(){
        btnIniciar=findViewById(R.id.btnIniciar);
        btnIniciar.setOnClickListener(view -> {
            Intent intent =new Intent(MainActivity.this, Login.class);
            startActivity(intent);
        });

    }
}