package com.example.xxx.betwars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SpainActivity extends AppCompatActivity {

    double assosSpain;
    double chiSpain;
    double diploSpain;

    final double assosStatSpain = 47.653492;
    final double chiStatSpain = 23.75;
    final double diploStatSpain = 28.571508;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spain);


    }

    public void submit(View view) {

        EditText spainAssos = findViewById(R.id.spain_assos);
        double assos = Double.parseDouble(spainAssos.getText().toString());

        assosSpain = (assos / 100);

        EditText spainChi = findViewById(R.id.spain_chi);
        double chi = Double.parseDouble(spainChi.getText().toString());

        chiSpain = (chi / 100);

        EditText spainDiplo = findViewById(R.id.spain_diplo);
        double diplo = Double.parseDouble(spainDiplo.getText().toString());

        diploSpain = (diplo / 100);

        double sumSpain = (1 / assosSpain) + (1 / chiSpain) + (1 / diploSpain);

        double assosBetSpain = ((100 / assosSpain) / sumSpain);

        double chiBetSpain = ((100 / chiSpain) / sumSpain);

        double diploBetSpain = ((100 / diploSpain) / sumSpain);


        double differenceAssos = (assosBetSpain - assosStatSpain);
        String assosFinal = Double.toString(differenceAssos);
        TextView difAssos = findViewById(R.id.difference_assos);
        difAssos.setText("1:  " + assosFinal);

        double differenceChi = (chiBetSpain - chiStatSpain);
        String chiFinal = Double.toString(differenceChi);
        TextView difChi = findViewById(R.id.difference_chi);
        difChi.setText("Χ:  " + chiFinal);

        double differenceDiplo = (diploBetSpain - diploStatSpain);
        String diploFinal = Double.toString(differenceDiplo);
        TextView difDiplo = findViewById(R.id.difference_diplo);
        difDiplo.setText("2:  " + diploFinal);


    }

    public void reset(View view) {

        EditText spainAssos = findViewById(R.id.spain_assos);
        spainAssos.setText("");

        EditText spainChi = findViewById(R.id.spain_chi);
        spainChi.setText("");

        EditText spainDiplo = findViewById(R.id.spain_diplo);
        spainDiplo.setText("");

        assosSpain = 0;
        chiSpain = 0;
        diploSpain = 0;

    }


}
