package com.example.xxx.betwars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView englandText = findViewById(R.id.england_text);

        englandText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent openEngland = new Intent(MainActivity.this, EnglandActivity.class);
                startActivity(openEngland);

            }
        });

        TextView italyText = findViewById(R.id.italy_text);

        italyText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent openItaly = new Intent(MainActivity.this, ItalyActivity.class);
                startActivity(openItaly);
            }
        });

        TextView germanyText = findViewById(R.id.germany_text);

        germanyText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent openGermany = new Intent(MainActivity.this, GermanyActivity.class);
                startActivity(openGermany);
            }
        });

        TextView spainText = findViewById(R.id.spain_text);

        spainText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent openSpain = new Intent(MainActivity.this, SpainActivity.class);
                startActivity(openSpain);
            }
        });

        TextView franceText = findViewById(R.id.france_text);

        franceText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent openFrance = new Intent(MainActivity.this, FranceActivity.class);
                startActivity(openFrance);
            }
        });

    }
}
