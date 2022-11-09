package com.example.diegogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class CalcularArea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_area);

    }

    Context context = getApplicationContext();

    Toast toast = Toast.makeText(this, "Complete los campos",Toast.LENGTH_LONG);
}