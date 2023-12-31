package com.chacombo.chacomboapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class chicharron1k extends AppCompatActivity {

//una vez implementado los DAO esto quedara como una plantilla
    Button menosBtn,masBtn,pagarBtn;
    TextView ceroTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicharron1k);
        asignarReferencias();
    }

    private void asignarReferencias(){

        pagarBtn=findViewById(R.id.pagarBtn);
        menosBtn = findViewById(R.id.menosBtn);
        masBtn=findViewById(R.id.masBtn);
        ceroTxt=findViewById(R.id.ceroTxt);


        pagarBtn.setOnClickListener(view -> {
            Intent intent =new Intent(chicharron1k.this, PasarelaPago.class);
            startActivity(intent);

        });

        //accion de decremento
        menosBtn.setOnClickListener(view0 -> {
            String valorString0 = ceroTxt.getText().toString();
            int valorInt0 = Integer.parseInt(valorString0);
            if(valorInt0>0){
                valorInt0--;
            }else{
                valorInt0=0;
            }

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