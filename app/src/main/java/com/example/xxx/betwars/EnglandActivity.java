package com.example.xxx.betwars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EnglandActivity extends AppCompatActivity {

    double assosEngland;
    double chiEngland;
    double diploEngland;

    final double assosStatEngland = 46.64733;
    final double chiStatEngland = 25.592125;
    final double diploStatEngland = 27.741217;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_england);


    }

    public void submit(View view) {

        EditText englandAssos = findViewById(R.id.england_assos);
        double assos = Double.parseDouble(englandAssos.getText().toString());

        assosEngland = (assos / 100);

        EditText englandChi = findViewById(R.id.england_chi);
        double chi = Double.parseDouble(englandChi.getText().toString());

        chiEngland = (chi / 100);

        EditText englandDiplo = findViewById(R.id.england_diplo);
        double diplo = Double.parseDouble(englandDiplo.getText().toString());

        diploEngland = (diplo / 100);

        double sumEngland = (1 / assosEngland) + (1 / chiEngland) + (1 / diploEngland);

        double assosBetEngland = ((100 / assosEngland) / sumEngland);

        double chiBetEngland = ((100 / chiEngland) / sumEngland);

        double diploBetEngland = ((100 / diploEngland) / sumEngland);


        double differenceAssos = (assosBetEngland - assosStatEngland);
        String assosFinal = Double.toString(differenceAssos);
        TextView difAssos = findViewById(R.id.difference_assos);
        difAssos.setText("1:  " + assosFinal);

        double differenceChi = (chiBetEngland - chiStatEngland);
        String chiFinal = Double.toString(differenceChi);
        TextView difChi = findViewById(R.id.difference_chi);
        difChi.setText("Χ:  " + chiFinal);

        double differenceDiplo = (diploBetEngland - diploStatEngland);
        String diploFinal = Double.toString(differenceDiplo);
        TextView difDiplo = findViewById(R.id.difference_diplo);
        difDiplo.setText("2:  " + diploFinal);


    }

    public void reset(View view) {

        EditText englandAssos = findViewById(R.id.england_assos);
        englandAssos.setText("");

        EditText englandChi = findViewById(R.id.england_chi);
        englandChi.setText("");

        EditText englandDiplo = findViewById(R.id.england_diplo);
        englandDiplo.setText("");

        assosEngland = 0;
        chiEngland = 0;
        diploEngland = 0;

    }

}
