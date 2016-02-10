package com.micompaia.wow;

/**
 * Created by 45722053p on 13/01/16.
 */

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import com.micompaia.wow.GsonRaza.Race;
import com.micompaia.wow.provider.razas.RazasCursor;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdaptadorRazas extends SimpleCursorAdapter {
    Context context;

    public AdaptadorRazas(Context context, int razas_fila, ArrayList<Race> razasList, String[] from, int[] to, int flags) {
        super(context, razas_fila, (Cursor) razasList, from, to, flags);
        this.context = context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Cursor myCursor = getCursor();

        RazasCursor razasCursor = new RazasCursor(myCursor);
        razasCursor.moveToPosition(position);

        //Miramos si la View la esta reusando, sino es asi hinchamos la vista
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.razas_fila, parent, false);

            ImageView imageView = (ImageView) convertView.findViewById(R.id.imagenRaza);
            TextView textView = (TextView) convertView.findViewById(R.id.nombreraza);

            textView.setText(razasCursor.getName());



            Picasso.with(context)
                    .load(razasCursor.getImagen())
                    .fit()
                    .into(imageView);

        }
            return convertView;
    }
}
