package com.micompaia.wow;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.micompaia.wow.provider.razas.RazasColumns;
import com.micompaia.wow.provider.razas.RazasCursor;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetallesRazaFragment extends Fragment {

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


        mask.setText("Mask: "+razasCursor.getMask());
        side.setText("Faccion: " +razasCursor.getSide());
        nombre.setText("Nombre: " + razasCursor.getName());


        return fragmentoDetalles;

    }
}
