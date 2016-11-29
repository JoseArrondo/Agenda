package pgl.ejercicios.agenda;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Josito on 27/11/2016.
 */

public class FichaActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ficha_activity);

        Intent intent = this.getIntent();
        Persona persona = (Persona) intent.getSerializableExtra("PERSONA");

        ImageView fotoID = (ImageView)findViewById(R.id.fotoPersona);
        TextView nombreText = (TextView)findViewById(R.id.nombreView);
        TextView apellidoText = (TextView)findViewById(R.id.apellidoView);
        TextView edadText = (TextView)findViewById(R.id.edadView);
        TextView dniText = (TextView)findViewById(R.id.dniView);

        nombreText.setText(persona.getNombre());
        apellidoText.setText(persona.getApellido());
        edadText.setText(persona.getEdad()+"");
        dniText.setText(persona.getDNI());
        fotoID.setImageResource(persona.getFotoID());
    }
}
