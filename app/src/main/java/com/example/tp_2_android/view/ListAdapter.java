package com.example.tp_2_android.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.tp_2_android.R;

import com.example.tp_2_android.model.Provincia;

import java.util.List;

public class ListAdapter extends ArrayAdapter<Provincia> {
    private Context context;
    private List<Provincia> lista;
    private LayoutInflater li;

    public ListAdapter(@NonNull Context context, int resource, @NonNull List<Provincia> objects, LayoutInflater li) {
        super(context, resource, objects);
        this.context = context;
        this.lista = objects;
        this.li = li;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if(itemView == null){
            itemView = li.inflate(R.layout.item,parent,false);
        }
        Provincia item=lista.get(position);
        TextView nombreProvincia = itemView.findViewById(R.id.nombre);
        TextView idProvincia = itemView.findViewById(R.id.id);

        nombreProvincia.setText(item.getNombre());
        idProvincia.setText(item.getId());

        return itemView;
    }
}