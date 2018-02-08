package com.example.xxx.betwars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ItalyActivity extends AppCompatActivity {

    double assosItaly;
    double chiItaly;
    double diploItaly;

    final double assosStatItaly = 46.557017;
    final double chiStatItaly = 26.754375;
    final double diploStatItaly = 26.688608;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italy);


    }

    public void submit(View view) {

        EditText italyAssos = findViewById(R.id.italy_assos);
        double assos = Double.parseDouble(italyAssos.getText().toString());

        assosItaly = (assos / 100);

        EditText italyChi = findViewById(R.id.italy_chi);
        double chi = Double.parseDouble(italyChi.getText().toString());

        chiItaly = (chi / 100);

        EditText italyDiplo = findViewById(R.id.italy_diplo);
        double diplo = Double.parseDouble(italyDiplo.getText().toString());

        diploItaly = (diplo / 100);

        double sumItaly = (1 / assosItaly) + (1 / chiItaly) + (1 / diploItaly);

        double assosBetItaly = ((100 / assosItaly) / sumItaly);

        double chiBetItaly = ((100 / chiItaly) / sumItaly);

        double diploBetItaly = ((100 / diploItaly) / sumItaly);


        double differenceAssos = (assosBetItaly - assosStatItaly);
        String assosFinal = Double.toString(differenceAssos);
        TextView difAssos = findViewById(R.id.difference_assos);
        difAssos.setText("1:  " + assosFinal);

        double differenceChi = (chiBetItaly - chiStatItaly);
        String chiFinal = Double.toString(differenceChi);
        TextView difChi = findViewById(R.id.difference_chi);
        difChi.setText("Χ:  " + chiFinal);

        double differenceDiplo = (diploBetItaly - diploStatItaly);
        String diploFinal = Double.toString(differenceDiplo);
        TextView difDiplo = findViewById(R.id.difference_diplo);
        difDiplo.setText("2:  " + diploFinal);


    }

    public void reset(View view) {

        EditText italyAssos = findViewById(R.id.italy_assos);
        italyAssos.setText("");

        EditText italyChi = findViewById(R.id.italy_chi);
        italyChi.setText("");

        EditText italyDiplo = findViewById(R.id.italy_diplo);
        italyDiplo.setText("");

        assosItaly = 0;
        chiItaly = 0;
        diploItaly = 0;

    }


}
