package com.example.diegogeometria;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn3=(Button) findViewById(R.id.btn3);

    }


    public void btn3(View v){
        Intent next = new Intent(this, AreaRectangulo.class);
        startActivities(new Intent[]{next});
    }

    public void btn2(View v){
        Intent next = new Intent(this, AreaCirculo.class);
        startActivities(new Intent[]{next});
    }

    public void btn1(View v){
        Intent next = new Intent(this, areatriangulo.class);
        startActivities(new Intent[]{next});
    }


}