package com.chacombo.chacomboapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class PasarelaPago extends AppCompatActivity {

    Spinner opcionPspinner;
    String tipoPago[]={"Tarjeta","Efectivo"};
    ImageButton imgBtnBackCarrito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasarela_pago_);

        asignarReferencias();
    }
    private  void asignarReferencias(){
        //boton que te manda de vuelta al carro
        imgBtnBackCarrito = findViewById(R.id.imgBtnBackCarrito);

        imgBtnBackCarrito.setOnClickListener(view -> {

            Intent intent = new Intent(PasarelaPago.this, Carrito.class);
            startActivity(intent);
        });

        //spinner
        opcionPspinner = findViewById(R.id.opcionPspinner);
        ArrayAdapter adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,tipoPago);
        opcionPspinner.setAdapter(adaptador);


    }
}