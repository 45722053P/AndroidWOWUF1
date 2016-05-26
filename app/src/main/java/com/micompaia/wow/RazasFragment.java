package com.micompaia.wow;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.micompaia.wow.provider.razas.RazasColumns;

/**
 * A placeholder fragment containing a simple view.
 */
public class RazasFragment extends Fragment  implements android.support.v4.app.LoaderManager.LoaderCallbacks<Cursor>{


    AdaptadorRazas adapter;
    GridView razas;

    public RazasFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmenrazas = inflater.inflate(R.layout.fragment_razas, container, false);

        getLoaderManager().initLoader(0, null, this);

        razas = (GridView)fragmenrazas.findViewById(R.id.gridRazas);


        adapter=new AdaptadorRazas(getContext(),
                R.layout.razas_fila,
                null,
                new String[]{},
                new int[]{},
                0);


        razas.setAdapter(adapter);

        razas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              Intent i = new Intent(getContext(), DetallesRaza.class);
                i.putExtra("raza_id", id);
                startActivity(i);
            }
        });



    return fragmenrazas;
    }


    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return new CursorLoader(getContext(),
                RazasColumns.CONTENT_URI,
                null,
                null,
                null,
                null);
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {
        adapter.swapCursor(data);
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {
        adapter.swapCursor(null);
    }

}

