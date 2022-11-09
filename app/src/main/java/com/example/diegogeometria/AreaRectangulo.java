package com.example.diegogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AreaRectangulo extends AppCompatActivity {

    EditText base1,altura1;
    TextView resultado1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_rectangulo);
        base1 = (EditText) findViewById(R.id.base2);
        altura1 = (EditText) findViewById(R.id.altura2);
        resultado1 = findViewById(R.id.resultado2);
    }

    public void btnguardar(View v){
        Intent next = new Intent(this, CalcularArea.class);
        startActivities(new Intent[]{next});
    }

    public void calcularRectangulo(View view)
    {
        String ladoPrin = base1.getText().toString();
        String ladoSec = altura1.getText().toString();

        double lado1double = Double.parseDouble(ladoPrin);
        double lado2double = Double.parseDouble(ladoSec);
        double area;

        area = lado1double * lado2double;

        resultado1.setText(area + "");
    }
}