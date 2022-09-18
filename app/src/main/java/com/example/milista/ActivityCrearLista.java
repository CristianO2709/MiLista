package com.example.milista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ActivityCrearLista extends AppCompatActivity {
    private EditText etProducto;
    private Button btnAgregar;
    private ListView lvProductos;
    private List<String> arrayProductos = new ArrayList<>();
    private ArrayAdapter<String> adapterProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_lista);
        etProducto = (EditText) findViewById(R.id.etNombreProducto);
        btnAgregar = (Button) findViewById(R.id.btnAgregar);
        lvProductos = (ListView) findViewById(R.id.lvProductos);
        adapterProductos = new ArrayAdapter<String>(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item, arrayProductos);
        lvProductos.setAdapter(adapterProductos);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = etProducto.getText().toString().trim();
                arrayProductos.add(texto);
                etProducto.getText().clear();
            }
        });
    }
}