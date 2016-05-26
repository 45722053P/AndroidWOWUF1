package com.micompaia.wow;

import android.content.Context;
import android.util.Log;
import android.widget.ArrayAdapter;

import com.micompaia.wow.GsonClase.Class;
import com.micompaia.wow.GsonMascotas.PetType;
import com.micompaia.wow.GsonRaza.Example;
import com.micompaia.wow.GsonRaza.Race;
import com.micompaia.wow.provider.mascotas.MascotasColumns;
import com.micompaia.wow.provider.mascotas.MascotasContentValues;
import com.micompaia.wow.provider.razas.RazasColumns;
import com.micompaia.wow.provider.razas.RazasContentValues;

import java.util.Arrays;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Query;
/**
 * Created by 45722053p on 11/01/16.
 */


//6ekvdsbpaxm5j6wea6fxwbguge7j9af2



//https://eu.api.battle.net/wow/data/

interface llamadas{

    @GET("character/races")
    Call<com.micompaia.wow.GsonRaza.Example> Razas(
            @Query("apikey") String api_key,
            @Query("locale") String LOCALE);

    @GET("character/classes")
    Call<com.micompaia.wow.GsonClase.Example> Clases(
            @Query("apikey") String api_key,
            @Query("locale") String LOCALE);

    @GET("pet/types")
    Call<com.micompaia.wow.GsonMascotas.Example> Mascotas(
            @Query("apikey") String api_key,
            @Query("locale") String LOCALE);
}

public class LlamadasData {

    private final String BASE_URL = "https://eu.api.battle.net/wow/data/";          //Constante URL parte que no cambia
    final String APPID = "6ekvdsbpaxm5j6wea6fxwbguge7j9af2";                        //Api Key de la API de Moviedb
    final  String LOCALE = "es_ES";


    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    llamadas service = retrofit.create(llamadas.class);

    public LlamadasData() {
        super();

    }

    public void Razas(final Context context){

        //Hacemos una llamada
        Call<Example> RaceCall=service.Razas(APPID,LOCALE);
        RaceCall.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Response<Example> response, Retrofit retrofit) {
                if (response.isSuccess()) {
                    Example race = response.body();
                    for (Race list : race.getRaces()) {
                        RazasContentValues valoresrazas = new RazasContentValues();

                        valoresrazas.putMask(String.valueOf(list.getMask()));
                        valoresrazas.putSide(list.getSide());
                        valoresrazas.putName(list.getName());
                        context.getContentResolver().insert(RazasColumns.CONTENT_URI, valoresrazas.values());

                    }
                }
            }

            @Override
            public void onFailure(Throwable t) {
                Log.w(null, Arrays.toString(t.getStackTrace()));
            }
        });
    }


    public void Clases (final ArrayAdapter listClase){

        //Hacemos una llamada
        Call<com.micompaia.wow.GsonClase.Example> ClaseCall=service.Clases(APPID,LOCALE);
        ClaseCall.enqueue(new Callback<com.micompaia.wow.GsonClase.Example>() {
            @Override
            public void onResponse(Response<com.micompaia.wow.GsonClase.Example> response, Retrofit retrofit) {

                listClase.clear();
                if (response.isSuccess()) {
                    com.micompaia.wow.GsonClase.Example clase = response.body();
                    for (Class list : clase.getClasses()) {
                        listClase.add(list);

                    }
                }
            }

            @Override
            public void onFailure(Throwable t) {
                Log.w(null, Arrays.toString(t.getStackTrace()));
            }
        });
    }

    public void Mascotas(final Context context) {
        //Hacemos una llamada
        Call<com.micompaia.wow.GsonMascotas.Example> PetsCall=service.Mascotas(APPID, LOCALE);
        PetsCall.enqueue(new Callback<com.micompaia.wow.GsonMascotas.Example>() {

            @Override
            public void onResponse(Response<com.micompaia.wow.GsonMascotas.Example> response, Retrofit retrofit) {

                if (response.isSuccess()) {
                    com.micompaia.wow.GsonMascotas.Example pets = response.body();
                    for (PetType list : pets.getPetTypes()) {

                        MascotasContentValues valoresMascotas = new MascotasContentValues();

                        valoresMascotas.putKey(list.getKey());
                        valoresMascotas.putName(list.getName());
                        valoresMascotas.putStrongagainstid(String.valueOf(list.getStrongAgainstId()));
                        valoresMascotas.putTypeabilityid(String.valueOf(list.getTypeAbilityId()));
                        valoresMascotas.putWeakagainstid(String.valueOf(list.getWeakAgainstId()));

                        context.getContentResolver().insert(MascotasColumns.CONTENT_URI, valoresMascotas.values());

                    }
                }
            }

            @Override
            public void onFailure(Throwable t) {
                Log.w(null, Arrays.toString(t.getStackTrace()));
            }
        });
    }
}




