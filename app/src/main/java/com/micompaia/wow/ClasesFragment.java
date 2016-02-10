package com.micompaia.wow;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.micompaia.wow.GsonClase.Class;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class ClasesFragment extends Fragment {
    AdaptadorClases adapter;
    public ClasesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmenClases =  inflater.inflate(R.layout.fragment_clases, container, false);


        LlamadasData llamada = new LlamadasData();

        final GridView clases = (GridView)fragmenClases.findViewById(R.id.gridClases);

        ArrayList<Class> claseList = new ArrayList<>();


        adapter=new AdaptadorClases(
                getContext(),
                R.layout.clase_fila,
                claseList);

        llamada.Clases(adapter);
        clases.setAdapter(adapter);

        return fragmenClases;
    }
}
