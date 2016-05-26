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
    ImageView imageView;

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

            imageView = (ImageView) convertView.findViewById(R.id.imagenRaza);
            TextView textView = (TextView) convertView.findViewById(R.id.nombreraza);
            textView.setText(razasCursor.getName());
            putimage(razasCursor.getName());

        }
            return convertView;
    }

    public void putimage(String name){
        if (name.equals("Humano")){
            Picasso.with(context)
                    .load(R.drawable.humano)
                    .fit()
                    .into(imageView);
        }
        else if(name.equals("Orco")){
            Picasso.with(context)
                    .load(R.drawable.orco)
                    .fit()
                    .into(imageView);
        } else if(name.equals("Enano")){
            Picasso.with(context)
                    .load(R.drawable.enano)
                    .fit()
                    .into(imageView);
        } else if(name.equals("Elfo de la noche")){
            Picasso.with(context)
                    .load(R.drawable.elfodelanoche)
                    .fit()
                    .into(imageView);

        } else if(name.equals("No-muerto")){
            Picasso.with(context)
                    .load(R.drawable.nomuerto)
                    .fit()
                    .into(imageView);
        } else if(name.equals("Tauren")){
            Picasso.with(context)
                    .load(R.drawable.tauren)
                    .fit()
                    .into(imageView);
        } else if(name.equals("Gnomo")){
            Picasso.with(context)
                    .load(R.drawable.gnomo)
                    .fit()
                    .into(imageView);
        } else if(name.equals("Trol")){
            Picasso.with(context)
                    .load(R.drawable.trol)
                    .fit()
                    .into(imageView);
        } else if(name.equals("Goblin")){
            Picasso.with(context)
                    .load(R.drawable.goblin)
                    .fit()
                    .into(imageView);
        }else  if(name.equals("Elfo de sangre")){
            Picasso.with(context)
                    .load(R.drawable.elfodesangre)
                    .fit()
                    .into(imageView);

        }else  if(name.equals("Draenei")){
            Picasso.with(context)
                    .load(R.drawable.draenei)
                    .fit()
                    .into(imageView);

        } else if(name.equals("Huargen")){
            Picasso.with(context)
                    .load(R.drawable.huargen)
                    .fit()
                    .into(imageView);

        }else  if(name.equals("Pandaren")){
            Picasso.with(context)
                    .load(R.drawable.pandaren)
                    .fit()
                    .into(imageView);

        }else{
            Picasso.with(context)
                    .load(R.drawable.humano)
                    .fit()
                    .into(imageView);
        }

    }
}
