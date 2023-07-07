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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasarela_pago_);

        asignarReferencias();
    }
    private  void asignarReferencias(){



        //spinner
        opcionPspinner = findViewById(R.id.opcionPspinner);
        ArrayAdapter adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,tipoPago);
        opcionPspinner.setAdapter(adaptador);


    }
}