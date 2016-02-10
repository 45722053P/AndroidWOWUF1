package com.micompaia.wow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.micompaia.wow.GsonClase.Class;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by alex on 10/01/2016.
 */
public class AdaptadorClases extends ArrayAdapter<Class> {
    /*
    Creem constructor amb el super.
     */
    public AdaptadorClases(Context context, int resource, List<Class> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Class clase =getItem(position);

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.clase_fila, parent, false);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imagenClase);
        TextView textView = (TextView) convertView.findViewById(R.id.nombreClase);


        textView.setText(clase.getName());

        Picasso.with(getContext())
                .load(clase.getImage())
                .fit()
                .into(imageView);

        /*
        Tornem la View plena
         */
        return convertView;
    }
}