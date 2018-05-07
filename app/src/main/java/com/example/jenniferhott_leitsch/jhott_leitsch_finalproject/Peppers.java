package com.example.jenniferhott_leitsch.jhott_leitsch_finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Peppers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peppers);
        Button buttonBack = (Button)findViewById(R.id.btnBack);
        Button buttonNext = (Button)findViewById(R.id.btnNext);
        Button buttonMenu = (Button)findViewById(R.id.btnMenu);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Peppers.this,Peas.class));
            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Peppers.this,Tomatoes.class));
            }
        });

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Peppers.this,ViewAll.class));
            }
        });

    }
}
