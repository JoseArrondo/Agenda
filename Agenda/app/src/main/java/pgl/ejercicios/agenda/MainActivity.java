package pgl.ejercicios.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    Persona [] datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       datos = new Persona [] {
               new Persona(R.mipmap.foto1, "Pedro", "Rodríguez", 25, "123456789Z"),
               new Persona(R.mipmap.foto2, "Antonio", "Puertas", 24, "9999999B"),
               new Persona(R.mipmap.foto3, "Drink", "Coffee", 41, "000000001A"),
               new Persona(R.mipmap.foto4, "Armando", "Escándalo", 23, "98765431N"),
               new Persona(R.mipmap.foto5, "Persona", "Apellido", 55, "959878984H"),
               new Persona(R.mipmap.foto6, "User", "Surname", 22, "AD25415414")
       };

        Personas_Adapter adapter = new Personas_Adapter(this, datos);

        ListView listado = (ListView) findViewById(R.id.listView);
        listado.setAdapter(adapter);

        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {

                Intent intent = new Intent(MainActivity.this, FichaActivity.class);

                Bundle bundle = new Bundle();
                bundle.putSerializable("PERSONA",(Persona)a.getItemAtPosition(position));
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
