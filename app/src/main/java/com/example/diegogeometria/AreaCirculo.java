package com.example.diegogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaCirculo extends AppCompatActivity {

    EditText radio;
    Button calcular;
    TextView resultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_circulo);

        radio = (EditText) findViewById(R.id.base2);
        calcular = findViewById(R.id.btncalcular1);
        resultado2 = findViewById(R.id.resultado2);

        calcular.setOnClickListener((View.OnClickListener) this);

    }

    public void onClick(View v) {

        String radio1 = radio.getText().toString();
        double radioent = Double.parseDouble(radio1);
        double rta=0;
        double pi = 3.1415;

        rta = (radioent * radioent) * pi;


        resultado2.setText(rta+"");

    }
}