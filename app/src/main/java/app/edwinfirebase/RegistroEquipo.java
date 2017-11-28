package app.edwinfirebase;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroEquipo extends AppCompatActivity implements View.OnClickListener {

    private Button btnRegistrarEquipo;
    private EditText etNameTeamA, etNameTeamB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_equipo);

        Toolbar my_ToolBar = (Toolbar) findViewById(R.id.myToolbar);
        setSupportActionBar(my_ToolBar); // se da soporte para todas las versiones

        btnRegistrarEquipo = (Button) findViewById(R.id.btnRegistrarEquipo);
        btnRegistrarEquipo.setOnClickListener(this);

        etNameTeamA = (EditText) findViewById(R.id.etNameTeamA);
        etNameTeamB = (EditText) findViewById(R.id.etNameTeamB);

    }

    @Override
    public void onClick(View v) {

        //startActivity(new Intent(this, MainActivity.class));

        String equipoA = etNameTeamA.getText().toString();
        String equipoB = etNameTeamB.getText().toString();

        Toast.makeText(this, "Nombre equipo a " + equipoA, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Nombre equipo b " + equipoB, Toast.LENGTH_SHORT).show();

        Intent load = new Intent(this, MainActivity.class);

        load.putExtra("nameEquipoA", equipoA);
        load.putExtra("nameEquipoB", equipoB);

        startActivity(load);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_toolbar, menu);

        return super.onCreateOptionsMenu(menu);

    }









}
