package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.recyclerviewexample.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        initRecycler();

        setContentView(binding.getRoot());
    }

    public void initRecycler() {
        // data
        List<String> data = getData();

        // Adapter
        MyAdapter countriesAdapter = new MyAdapter();
        countriesAdapter.setCountries(data);

        // enlaza el adapter con el recyclerview
        binding.recyclerView.setAdapter(countriesAdapter);
    }

    public List<String> getOtherData() {
        List<String> countries = new ArrayList<>();
        countries.add("Chile");
        return countries;
    }

    public List<String> getData() {
        ArrayList<String> paises = new ArrayList<>();
        paises.add("Alemania");
        paises.add("Argentina");
        paises.add("Australia");
        paises.add("Brasil");
        paises.add("Canadá");
        paises.add("Chile");
        paises.add("Colombia");
        paises.add("Corea del Sur");
        paises.add("Egipto");
        paises.add("España");
        paises.add("Estados Unidos");
        paises.add("Francia");
        paises.add("India");
        paises.add("Indonesia");
        paises.add("Italia");
        paises.add("Japón");
        paises.add("Malasia");
        paises.add("México");
        paises.add("Nigeria");
        paises.add("Países Bajos");
        paises.add("Perú");
        paises.add("Reino Unido");
        paises.add("Rusia");
        paises.add("Singapur");
        paises.add("Sudáfrica");
        paises.add("Suecia");
        paises.add("Suiza");
        paises.add("Tailandia");
        paises.add("Turquía");
        paises.add("Vietnam");

        return paises;
    }
}