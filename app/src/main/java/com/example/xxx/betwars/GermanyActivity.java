package com.example.xxx.betwars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GermanyActivity extends AppCompatActivity {

    double assosGermany;
    double chiGermany;
    double diploGermany;

    final double assosStatGermany = 45.34315;
    final double chiStatGermany = 25.163392;
    final double diploStatGermany = 29.494308;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_germany);


    }

    public void submit(View view) {

        EditText germanyAssos = findViewById(R.id.germany_assos);
        double assos = Double.parseDouble(germanyAssos.getText().toString());

        assosGermany = (assos / 100);

        EditText germanyChi = findViewById(R.id.germany_chi);
        double chi = Double.parseDouble(germanyChi.getText().toString());

        chiGermany = (chi / 100);

        EditText germanyDiplo = findViewById(R.id.germany_diplo);
        double diplo = Double.parseDouble(germanyDiplo.getText().toString());

        diploGermany = (diplo / 100);

        double sumGermany = (1 / assosGermany) + (1 / chiGermany) + (1 / diploGermany);

        double assosBetGermany = ((100 / assosGermany) / sumGermany);

        double chiBetGermany = ((100 / chiGermany) / sumGermany);

        double diploBetGermany = ((100 / diploGermany) / sumGermany);


        double differenceAssos = (assosBetGermany - assosStatGermany);
        String assosFinal = Double.toString(differenceAssos);
        TextView difAssos = findViewById(R.id.difference_assos);
        difAssos.setText("1:  " + assosFinal);

        double differenceChi = (chiBetGermany - chiStatGermany);
        String chiFinal = Double.toString(differenceChi);
        TextView difChi = findViewById(R.id.difference_chi);
        difChi.setText("Χ:  " + chiFinal);

        double differenceDiplo = (diploBetGermany - diploStatGermany);
        String diploFinal = Double.toString(differenceDiplo);
        TextView difDiplo = findViewById(R.id.difference_diplo);
        difDiplo.setText("2:  " + diploFinal);


    }

    public void reset(View view) {

        EditText germanyAssos = findViewById(R.id.germany_assos);
        germanyAssos.setText("");

        EditText germanyChi = findViewById(R.id.germany_chi);
        germanyChi.setText("");

        EditText germanyDiplo = findViewById(R.id.germany_diplo);
        germanyDiplo.setText("");

        assosGermany = 0;
        chiGermany = 0;
        diploGermany = 0;

    }


}
