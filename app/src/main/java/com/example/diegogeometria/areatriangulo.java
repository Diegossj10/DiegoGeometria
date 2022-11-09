package com.example.diegogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class areatriangulo extends AppCompatActivity {

    EditText ladoB, ladoA;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areatriangulo);
        ladoB = (EditText) findViewById(R.id.base3);
        ladoA = (EditText) findViewById(R.id.altura3);
        result = findViewById(R.id.resultado3);

    }

    public void calcularTriangulo(View v) {

        String base = ladoB.getText().toString();
        Double num2 = Double.parseDouble(base);
        String altura = ladoA.getText().toString();
        Double num1 = Double.parseDouble(altura);


        double rta=0;
        rta = (num2 * num1) / 2;


        result.setText(rta+"");

    }
}