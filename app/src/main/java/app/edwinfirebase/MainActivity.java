package app.edwinfirebase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnMore3PointTeamA, btnMore2PointTeamA, btnMore1PointTeamA; // Boton equipo A
    private TextView tvScoreTeamA;  // Marcador del equipo A
    private TextView tvNameTeamA, tvNameTeamB;

    int valorMarcadorActual =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar my_ToolBar = (Toolbar) findViewById(R.id.myToolbar);
        setSupportActionBar(my_ToolBar); // se da soporte para todas las versiones

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnMore3PointTeamA = (Button) findViewById(R.id.btnMore3PointTeamA);
        btnMore3PointTeamA.setOnClickListener(this);

        btnMore2PointTeamA = (Button) findViewById(R.id.btnMore2PointTeamA);
        btnMore2PointTeamA.setOnClickListener(this);

        btnMore1PointTeamA = (Button) findViewById(R.id.btnMore1PointTeamA);
        btnMore1PointTeamA.setOnClickListener(this);

        tvScoreTeamA = (TextView) findViewById(R.id.tvScoreTeamA);

        tvNameTeamA = (TextView) findViewById(R.id.tvNameTeamA);
        tvNameTeamB = (TextView) findViewById(R.id.tvNameTeamB);


        String equipoA = getIntent().getExtras().getString("nameEquipoA");
        String equipoB = getIntent().getExtras().getString("nameEquipoB");


        tvNameTeamA.setText(equipoA);
        tvNameTeamB.setText(equipoB);










    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){ //numero de estudiantes

            case R.id.btnMore3PointTeamA:

                valorMarcadorActual = Integer.parseInt(tvScoreTeamA.getText().toString()); // obtengo el marcador actual

                valorMarcadorActual = valorMarcadorActual + 3;

                tvScoreTeamA.setText(String.valueOf(valorMarcadorActual));

                break;


            case R.id.btnMore2PointTeamA:


                valorMarcadorActual = Integer.parseInt(tvScoreTeamA.getText().toString()); // obtengo el marcador actual

                valorMarcadorActual = valorMarcadorActual + 2;

                tvScoreTeamA.setText(String.valueOf(valorMarcadorActual));


                break;














        }
    }
}