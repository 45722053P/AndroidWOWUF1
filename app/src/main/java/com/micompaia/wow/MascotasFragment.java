package com.micompaia.wow;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.micompaia.wow.provider.mascotas.MascotasColumns;

/**
 * A placeholder fragment containing a simple view.
 */
public class MascotasFragment extends Fragment implements android.support.v4.app.LoaderManager.LoaderCallbacks<Cursor> {

    AdaptadorMascota adapter;
    ListView mascotas;
    public MascotasFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmenMascotas =  inflater.inflate(R.layout.fragment_mascotas, container, false);

        getLoaderManager().initLoader(0, null, this);

       mascotas = (ListView)fragmenMascotas.findViewById(R.id.listaMascotas);

        adapter=new AdaptadorMascota(getContext(),
                R.layout.mascota_fila,
                null,
                new String[]{},
                new int[]{},
                0);

        mascotas.setAdapter(adapter);

        return fragmenMascotas;
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return new CursorLoader(getContext(),
                MascotasColumns.CONTENT_URI,
                null,
                null,
                null,
                null);
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {

    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

    }


}
