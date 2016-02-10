package com.micompaia.wow;

import android.content.Context;
import android.util.Log;
import android.widget.ArrayAdapter;

import com.micompaia.wow.GsonClase.Class;
import com.micompaia.wow.GsonRaza.Example;
import com.micompaia.wow.GsonRaza.Race;
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
                            valoresrazas.putImagen((fotoRaza(list.getName())));
                            System.out.println("==============================================================================="+fotoRaza(list.getName()));
                            context.getContentResolver().insert(RazasColumns.CONTENT_URI,valoresrazas.values());

                    }
                }
            }

            @Override
            public void onFailure(Throwable t) {
                Log.w(null, Arrays.toString(t.getStackTrace()));
            }
        });
    }

    public String fotoRaza(String name ){

        if (name.equals("Humano")){
            return "http://www.freakygaming.com/gallery/game_wallpapers/world_of_warcraft/human_racial_shield.jpg";
        }
        if(name.equals("Orco")){
            return "http://www.freakygaming.com/gallery/game_wallpapers/world_of_warcraft/orc_racial_shield.jpg";

        }  if(name.equals("Enano")){
            return "http://images2.wikia.nocookie.net/__cb20090518235050/wow/es/images/d/d3/DwarfHunter.jpg";
        }  if(name.equals("Elfo de la noche")){
            return "http://www.freakygaming.com/gallery/game_wallpapers/world_of_warcraft/night_elf_racial_shield.jpg";

        }  if(name.equals("No-muerto")){
            return "http://4.bp.blogspot.com/_6y05ZAYQAL0/SDU3-Bb4DtI/AAAAAAAAAAY/upqX7Vs-pO8/S1600-R/20070613141119-wow%5B1%5D.jpg";

        }  if(name.equals("Tauren")){
            return "http://www.freakygaming.com/gallery/game_wallpapers/world_of_warcraft/tauren_icon.jpg";

        }  if(name.equals("Gnomo")){
            return "http://www.linkmesh.com/imagenes/temas/warcraft/gnomos.jpg";

        }  if(name.equals("Trol")){
            return "http://www.freakygaming.com/gallery/game_wallpapers/world_of_warcraft/troll_artwork.jpg";

        }  if(name.equals("Goblin")){
            return "http://imagenes.es.sftcdn.net/es/scrn/86000/86428/world-of-warcraft-goblins-wallpaper-2.jpg";
        }  if(name.equals("Elfo de sangre")){
            return "http://blog.espol.edu.ec/tvillama/files/2015/11/2830471_640px.jpg";

        }  if(name.equals("Draenei")){
            return "http://wallpapercave.com/wp/R3GyJr7.jpg";

        }  if(name.equals("Huargen")){
            return "http://bnetcmsus-a.akamaihd.net/cms/blog_header/9NHP8CYPJ3ME1290766867130.jpg";

        }  if(name.equals("Pandaren")){
            return "http://i11c.3djuegos.com/juegos/8163/world_of_warcraft_mists_of_pandaria/fotos/videos/world_of_warcraft_mists_of_pandaria-2074130.jpg";

        }
        return "https://bneteu-a.akamaihd.net/shop/static/images/logos/logo-family-wow.1xPNu.png";
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
                        list.setImage(fotoClase(list.getName()));
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
    public String fotoClase(String name ){

        if (name.equals("Cazador")){
            return "http://www.ecured.cu/images/thumb/2/20/Hunter_crest.png/260px-Hunter_crest.png";
        }if(name.equals("Picaro")){
            return "https://s-media-cache-ak0.pinimg.com/236x/ba/5a/76/ba5a76b219003fc879ea60581e12e6f5.jpg";

        }  if(name.equals("Guerrero")){
            return "http://circulodelvalor.com/wp-content/uploads/2013/02/Warrior_crest.png";

        } if(name.equals("Paladin")){
            return "http://hydra-media.cursecdn.com/wow.gamepedia.com/thumb/8/82/Paladin_Crest.png/260px-Paladin_Crest.png";

        }if(name.equals("Chaman")){
            return "http://evilgenius.ru/sites/default/files/shaman_logo.png";

        }  if(name.equals("Mago")){
            return "http://vignette3.wikia.nocookie.net/wow/images/6/67/180px-Mage_crest.png/revision/latest?cb=20120723143605&path-prefix=es";

        }  if(name.equals("Sacerdote")){
            return "http://circulodelvalor.com/wp-content/uploads/2013/03/Priest_crest.png";

        }if(name.equals("Caballero de la muerte")){
            return "http://i45.servimg.com/u/f45/17/55/64/86/death_10.png";

        }  if(name.equals("Druida")){
            return "http://vignette2.wikia.nocookie.net/wowwiki/images/5/55/Druid_crest.png/revision/latest?cb=20130813094831";

        }  if(name.equals("Brujo")){
            return "http://circulodelvalor.com/wp-content/uploads/2013/03/Warlock_crest.png";

        }  if(name.equals("Monje")){
            return "http://1.bp.blogspot.com/-QjBffMHToks/VkzVgF2NURI/AAAAAAAAFVc/sN2huFzA6B0/s1600/logo.png";

        }
        return "https://bneteu-a.akamaihd.net/shop/static/images/logos/logo-family-wow.1xPNu.png";
    }

}




