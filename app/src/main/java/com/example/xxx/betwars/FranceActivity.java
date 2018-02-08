package com.example.xxx.betwars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FranceActivity extends AppCompatActivity {

    double assosFrance;
    double chiFrance;
    double diploFrance;

    final double assosStatFrance = 45.469308;
    final double chiStatFrance = 28.429892;
    final double diploStatFrance = 26.184225;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_france);


    }

    public void submit(View view) {

        EditText franceAssos = findViewById(R.id.france_assos);
        double assos = Double.parseDouble(franceAssos.getText().toString());

        assosFrance = (assos / 100);

        EditText franceChi = findViewById(R.id.france_chi);
        double chi = Double.parseDouble(franceChi.getText().toString());

        chiFrance = (chi / 100);

        EditText franceDiplo = findViewById(R.id.france_diplo);
        double diplo = Double.parseDouble(franceDiplo.getText().toString());

        diploFrance = (diplo / 100);

        double sumFrance = (1 / assosFrance) + (1 / chiFrance) + (1 / diploFrance);

        double assosBetFrance = ((100 / assosFrance) / sumFrance);

        double chiBetFrance = ((100 / chiFrance) / sumFrance);

        double diploBetFrance = ((100 / diploFrance) / sumFrance);


        double differenceAssos = (assosBetFrance - assosStatFrance);
        String assosFinal = Double.toString(differenceAssos);
        TextView difAssos = findViewById(R.id.difference_assos);
        difAssos.setText("1:  " + assosFinal);

        double differenceChi = (chiBetFrance - chiStatFrance);
        String chiFinal = Double.toString(differenceChi);
        TextView difChi = findViewById(R.id.difference_chi);
        difChi.setText("Χ:  " + chiFinal);

        double differenceDiplo = (diploBetFrance - diploStatFrance);
        String diploFinal = Double.toString(differenceDiplo);
        TextView difDiplo = findViewById(R.id.difference_diplo);
        difDiplo.setText("2:  " + diploFinal);


    }

    public void reset(View view) {

        EditText franceAssos = findViewById(R.id.france_assos);
        franceAssos.setText("");

        EditText franceChi = findViewById(R.id.france_chi);
        franceChi.setText("");

        EditText franceDiplo = findViewById(R.id.france_diplo);
        franceDiplo.setText("");

        assosFrance = 0;
        chiFrance = 0;
        diploFrance = 0;

    }


}
