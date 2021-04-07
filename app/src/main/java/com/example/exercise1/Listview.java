package com.example.exercise1;

import android.os.Bundle;
import android.os.strictmode.ImplicitDirectBootViolation;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Listview extends AppCompatActivity {

    String Nama;
    TextView tvnama, tvnomor;
    SearchView search;
    Listview listview;
    String[] nama = new String[] { "Inayah", "Ilham", "Eris","Fikri", "Maul",
            "Intan", "Vina", "Gita","Vian", "Luthfi"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        tvnama = (TextView) findViewById(R.id.namakontak);
        tvnomor = (TextView) findViewById(R.id.nomortelphone);
        search =  (SearchView) findViewById(R.id.cari);
        ListView listView = (ListView) findViewById(R.id.listkontak);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {








            }
        });



    }
}