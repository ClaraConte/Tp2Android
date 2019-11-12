package com.example.tp_2_android.request;

import com.example.tp_2_android.model.Provincia;
import com.example.tp_2_android.model.Resultado;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class ApiClient {
    private static final String PATH ="https://apis.datos.gob.ar/georef/api/";
    private static  MyApiInterface myApiInterface;


    public static MyApiInterface getMyApiClient(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PATH)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        myApiInterface = retrofit.create(MyApiInterface.class);
        return myApiInterface ;
    }


    public interface MyApiInterface  {
        //String prov = "74";
       /* @GET("municipios?provincia="+prov)
        Call<Resultado> leer();*/


        @GET("provincias?campos=id,nombre")
        Call<Resultado> leer();
    }

}
