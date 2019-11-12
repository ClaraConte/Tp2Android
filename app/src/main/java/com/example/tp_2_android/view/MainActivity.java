package com.example.tp_2_android.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.tp_2_android.R;
import com.example.tp_2_android.model.Provincia;

import java.util.List;


public class MainActivity extends AppCompatActivity {
Button boton;
    //private ArrayList<Inmueble> lista = new ArrayList<Inmueble>();
    private MainViewModel mainViewModel;
    private ArrayAdapter<Provincia> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton=findViewById(R.id.boton);
        generarListView();
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainViewModel.mostrar();
            }
        });


    }

    public void generarListView (){


        mainViewModel= ViewModelProviders.of(this).get(MainViewModel.class);
        mainViewModel.getLista().observe(this, new Observer<List<Provincia>>() {
            @Override
            public void onChanged(List<Provincia> provincias) {
                adapter=new ListAdapter(getApplicationContext(),R.layout.item,provincias,getLayoutInflater());
                ListView lv = findViewById(R.id.myList);
                lv.setAdapter(adapter);
            }
        });

    }

}
