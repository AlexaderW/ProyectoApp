package com.chacombo.chacomboapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class Carrito extends AppCompatActivity {


    Button btnPagar;
    ImageButton imgBtnBackCompras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);

        asignarReferencias();
    }

    private void asignarReferencias(){

        imgBtnBackCompras=findViewById(R.id.imgBtnBackCompras);
        btnPagar=findViewById(R.id.btnPagar);

        imgBtnBackCompras.setOnClickListener(view -> {

         Intent intent = new Intent(Carrito.this, Menu.class);
            startActivity(intent);
        });


        btnPagar.setOnClickListener(view -> {

            Intent intent = new Intent(Carrito.this, PasarelaPago.class);
            startActivity(intent);

        });


    }
}