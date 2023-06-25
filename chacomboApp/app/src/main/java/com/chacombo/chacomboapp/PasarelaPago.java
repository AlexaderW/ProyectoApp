package com.chacombo.chacomboapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class PasarelaPago extends AppCompatActivity {


    ImageButton imgBtnBackCarrito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasarela_pago_);

        asignarReferencias();
    }
    private  void asignarReferencias(){
        imgBtnBackCarrito = findViewById(R.id.imgBtnBackCarrito);

        imgBtnBackCarrito.setOnClickListener(view -> {

            Intent intent = new Intent(PasarelaPago.this, Carrito.class);
            startActivity(intent);
        });


    }
}