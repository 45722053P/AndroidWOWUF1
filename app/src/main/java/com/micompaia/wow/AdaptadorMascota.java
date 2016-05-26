package com.micompaia.wow;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.micompaia.wow.GsonMascotas.PetType;
import com.micompaia.wow.provider.mascotas.MascotasCursor;

import java.util.ArrayList;

/**
 * Created by alex on 16/04/2016.
 */
public class AdaptadorMascota extends android.widget.SimpleCursorAdapter {
    Context context;

    public AdaptadorMascota(Context context, int mascota_fila, ArrayList<PetType> mascotaList, String[] from, int[] to, int flags) {
        super(context, mascota_fila, (Cursor) mascotaList, from, to, flags);
        this.context = context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        System.out.println("holiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");

        Cursor myCursor = getCursor();

        MascotasCursor mascotasCursor = new MascotasCursor(myCursor);
        mascotasCursor.moveToPosition(position);

        //Miramos si la View la esta reusando, sino es asi hinchamos la vista
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.mascota_fila, parent, false);

        }
        TextView key = (TextView) convertView.findViewById(R.id.Key_Pet);
        TextView namePet = (TextView) convertView.findViewById(R.id.name_Pet);
        TextView strong = (TextView) convertView.findViewById(R.id.Strong_Pet);
        TextView weak = (TextView) convertView.findViewById(R.id.Weak_Pet);
        TextView hability = (TextView) convertView.findViewById(R.id.Hability_Pet);

        key.setText(mascotasCursor.getKey());
        namePet.setText(mascotasCursor.getName());
        strong.setText(mascotasCursor.getStrongagainstid());
        weak.setText(mascotasCursor.getWeakagainstid());
        hability.setText(mascotasCursor.getTypeabilityid());

        return convertView;
    }
}
