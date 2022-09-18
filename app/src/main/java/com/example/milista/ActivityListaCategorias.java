package com.example.milista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityListaCategorias extends AppCompatActivity {
    private ListView lista;
    private ArrayList<String> arrayList = new ArrayList<>();
    private String[] Categoria = {"Abarrotes", "Frutas y verduras", "Panadería", "Vinos y licores", "Dulcería"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_categorias);

        lista = (ListView) findViewById(R.id.lvCategorias);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item, Categoria);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(view.getContext(), ActivityCrearLista.class);
                startActivity(intent);
                Toast.makeText(ActivityListaCategorias.this, "Click en " + lista.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
            }
        });
    }
}