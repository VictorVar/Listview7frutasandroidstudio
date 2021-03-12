package com.example.mostrar7frutaslistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    ArrayList<String> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista= findViewById(R.id.Lista);
        datos= new ArrayList<>();
        datos.add("Manzana");
        datos.add("Pera");
        datos.add("Mango");
        datos.add("Melocoton");
        datos.add("Piña");
        datos.add("Aguacate");
        datos.add("Naranja");
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        lista.setAdapter(adapter);
    }
}