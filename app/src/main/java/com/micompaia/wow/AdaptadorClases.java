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
    ImageView imageView;
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

        imageView = (ImageView) convertView.findViewById(R.id.imagenClase);
        TextView textView = (TextView) convertView.findViewById(R.id.nombreClase);


        textView.setText(clase.getName());

       putImage(clase.getName());

        /*
        Tornem la View plena
         */
        return convertView;
    }

    public void putImage(String name){
        if (name.equals("Cazador")){
            Picasso.with(getContext())
                    .load(R.drawable.logohunter)
                    .fit()
                    .into(imageView);
        }else if(name.equals("Pícaro")){
            Picasso.with(getContext())
                    .load(R.drawable.rogue_crest)
                    .fit()
                    .into(imageView);
        } else if(name.equals("Guerrero")){
            Picasso.with(getContext())
                    .load(R.drawable.warrior_icono)
                    .fit()
                    .into(imageView);
        }else if(name.equals("Paladín")){
            Picasso.with(getContext())
                    .load(R.drawable.paladin_icono)
                    .fit()
                    .into(imageView);
        }else if(name.equals("Chamán")){
            Picasso.with(getContext())
                    .load(R.drawable.shaman)
                    .fit()
                    .into(imageView);

        } else if(name.equals("Mago")){
            Picasso.with(getContext())
                    .load(R.drawable.mage_crest)
                    .fit()
                    .into(imageView);

        }else  if(name.equals("Sacerdote")){
            Picasso.with(getContext())
                    .load(R.drawable.sacerdote_icono)
                    .fit()
                    .into(imageView);

        }else if(name.equals("Caballero de la Muerte")){
            Picasso.with(getContext())
                    .load(R.drawable.dkicono)
                    .fit()
                    .into(imageView);

        }else  if(name.equals("Druida")){
            Picasso.with(getContext())
                    .load(R.drawable.druid_crest)
                    .fit()
                    .into(imageView);

        }else  if(name.equals("Brujo")){
            Picasso.with(getContext())
                    .load(R.drawable.brujo)
                    .fit()
                    .into(imageView);

        }else  if(name.equals("Monje")){
            Picasso.with(getContext())
                    .load(R.drawable.monje)
                    .fit()
                    .into(imageView);
        }else{
            Picasso.with(getContext())
                    .load(R.drawable.rogue_crest)
                    .fit()
                    .into(imageView);
        }
    }
}