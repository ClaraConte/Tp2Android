package com.example.tp_2_android.view;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.tp_2_android.model.Provincia;
import com.example.tp_2_android.model.Resultado;
import com.example.tp_2_android.request.ApiClient;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel extends ViewModel {


    private MutableLiveData <List<Provincia>> lista;

    public LiveData<List<Provincia>> getLista(){
        if(lista == null){
            lista = new MutableLiveData<>();
        }
        return lista;
    }

    public void mostrar(){
        Call<Resultado> datos = ApiClient.getMyApiClient().leer();
        datos.enqueue(new Callback<Resultado>() {
            @Override
            public void onResponse(Call<Resultado> call, Response<Resultado> response) {
                if(response.isSuccessful()){
                    Resultado resultado=response.body();
                    ArrayList<Provincia> provincias=new ArrayList<>();
                    for(Provincia it: resultado.getProvincia()){
                        provincias.add(it);
                        Log.d("nn",it.getNombre());
                    }
                    lista.postValue(provincias);
                }
            }

            @Override
            public void onFailure(Call<Resultado> call, Throwable t) {

            }
        });

    }


}
