package com.micompaia.wow;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.micompaia.wow.provider.razas.RazasColumns;
import com.micompaia.wow.provider.razas.RazasCursor;
import com.squareup.picasso.Picasso;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetallesRazaFragment extends Fragment {
    ImageView imageView;

    public DetallesRazaFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentoDetalles =  inflater.inflate(R.layout.fragment_detalles_raza, container, false);

        Long raza_id = getActivity().getIntent().getLongExtra("raza_id", -1);

        Cursor cursor = getContext().getContentResolver().query(
                RazasColumns.CONTENT_URI,
                null,
                RazasColumns._ID + " = ?",
                new String[]{String.valueOf(raza_id)},
                null);

        RazasCursor razasCursor = new RazasCursor(cursor);
        cursor.moveToNext();


        TextView mask = (TextView)fragmentoDetalles.findViewById(R.id.maskraza);
        TextView side = (TextView)fragmentoDetalles.findViewById(R.id.sideraza);
        TextView nombre = (TextView) fragmentoDetalles.findViewById(R.id.nameraza);
        imageView =(ImageView) fragmentoDetalles.findViewById(R.id.razafoto) ;


        mask.setText("Mask: "+razasCursor.getMask());
        side.setText("Faccion: " +razasCursor.getSide());
        nombre.setText("Nombre: " + razasCursor.getName());
        putimage(razasCursor.getName());


        return fragmentoDetalles;

    }
    public void putimage(String name){
        if (name.equals("Humano")){
            Picasso.with(getContext())
                    .load(R.drawable.humano)
                    .fit()
                    .into(imageView);
        }
        else if(name.equals("Orco")){
            Picasso.with(getContext())
                    .load(R.drawable.orco)
                    .fit()
                    .into(imageView);
        } else if(name.equals("Enano")){
            Picasso.with(getContext())
                    .load(R.drawable.enano)
                    .fit()
                    .into(imageView);
        } else if(name.equals("Elfo de la noche")){
            Picasso.with(getContext())
                    .load(R.drawable.elfodelanoche)
                    .fit()
                    .into(imageView);

        } else if(name.equals("No-muerto")){
            Picasso.with(getContext())
                    .load(R.drawable.nomuerto)
                    .fit()
                    .into(imageView);
        } else if(name.equals("Tauren")){
            Picasso.with(getContext())
                    .load(R.drawable.tauren)
                    .fit()
                    .into(imageView);
        } else if(name.equals("Gnomo")){
            Picasso.with(getContext())
                    .load(R.drawable.gnomo)
                    .fit()
                    .into(imageView);
        } else if(name.equals("Trol")){
            Picasso.with(getContext())
                    .load(R.drawable.trol)
                    .fit()
                    .into(imageView);
        } else if(name.equals("Goblin")){
            Picasso.with(getContext())
                    .load(R.drawable.goblin)
                    .fit()
                    .into(imageView);
        }else  if(name.equals("Elfo de sangre")){
            Picasso.with(getContext())
                    .load(R.drawable.elfodesangre)
                    .fit()
                    .into(imageView);

        }else  if(name.equals("Draenei")){
            Picasso.with(getContext())
                    .load(R.drawable.draenei)
                    .fit()
                    .into(imageView);

        } else if(name.equals("Huargen")){
            Picasso.with(getContext())
                    .load(R.drawable.huargen)
                    .fit()
                    .into(imageView);

        }else  if(name.equals("Pandaren")){
            Picasso.with(getContext())
                    .load(R.drawable.pandaren)
                    .fit()
                    .into(imageView);

        }else{
            Picasso.with(getContext())
                    .load(R.drawable.humano)
                    .fit()
                    .into(imageView);
        }

    }
}
