package com.example.jenniferhott_leitsch.jhott_leitsch_finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewAll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all);

        Button buttonTomatoes = (Button)findViewById(R.id.btnTomato);
        Button buttonCarrots = (Button)findViewById(R.id.btnCarrots);
        Button buttonGreenBeans = (Button)findViewById(R.id.btnGreenBeans);
        Button buttonPeas = (Button)findViewById(R.id.btnPeas);
        Button buttonPeppers = (Button)findViewById(R.id.btnPeppers);

        buttonTomatoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewAll.this, Tomatoes.class));
            }
        });

        buttonCarrots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewAll.this, Carrots.class));
            }
        });

        buttonGreenBeans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewAll.this, GreenBeans.class));
            }
        });

        buttonPeas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewAll.this, Peas.class));
            }
        });

        buttonPeppers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewAll.this, Peppers.class));
            }
        });

    }
}
