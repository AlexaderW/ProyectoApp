package com.chacombo.chacomboapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class chicharron1k extends AppCompatActivity {


    Button menosBtn,masBtn;
    TextView ceroTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicharron1k);
        asignarReferencias();
    }

    private void asignarReferencias(){
        menosBtn = findViewById(R.id.menosBtn);
        masBtn=findViewById(R.id.masBtn);
        ceroTxt=findViewById(R.id.ceroTxt);

        //accion de decremento
        menosBtn.setOnClickListener(view0 -> {
            String valorString0 = ceroTxt.getText().toString();
            int valorInt0 = Integer.parseInt(valorString0);
            valorInt0--;
            ceroTxt.setText(String.valueOf(valorInt0));
        });
            //accion de incremento
        masBtn.setOnClickListener(view1 -> {
            String valorString= ceroTxt.getText().toString();
            int valorInt=Integer.parseInt(valorString);
            valorInt++;
            ceroTxt.setText(String.valueOf(valorInt));

        });

    }
}