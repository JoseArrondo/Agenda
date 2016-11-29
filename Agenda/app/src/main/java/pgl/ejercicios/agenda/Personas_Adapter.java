package pgl.ejercicios.agenda;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by alumno on 17/11/2016.
 */

public class Personas_Adapter extends ArrayAdapter<Persona> {

    public Personas_Adapter (Context context, Persona[]datos){
        super(context, R.layout.items_layout, datos);
    }

    public View getView(int position, View converView, ViewGroup parent){

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.items_layout, null);

        ImageView fotoID = (ImageView) item.findViewById(R.id.fotoPersona);
        if(fotoID != null) {
            fotoID.setImageResource(getItem(position).getFotoID());
        }

        TextView nombreText = (TextView) item.findViewById(R.id.nombreView);
        if(nombreText != null) {
            nombreText.setText(getItem(position).getNombre());
        }

        TextView apellidoText = (TextView) item.findViewById(R.id.apellidoView);
        if(apellidoText != null) {
            apellidoText.setText(getItem(position).getApellido());
        }

        TextView edadText = (TextView) item.findViewById(R.id.edadView);
        if(edadText != null) {
            edadText.setText(getItem(position).getEdad()+"");
        }

        TextView dniText = (TextView) item.findViewById(R.id.dniView);
        if(dniText != null) {
            dniText.setText(getItem(position).getDNI());
        }

        return item;
    }
}
