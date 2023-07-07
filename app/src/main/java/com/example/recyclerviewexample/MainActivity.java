package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

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
        // datos
        //List<String> data = getData();
        List<Person> data = getDataPerson();

        // Adapter
        MyAdapter countriesAdapter = new MyAdapter();
        countriesAdapter.setPersons(data);

        // enlaza el adapter con el recyclerview
        binding.recyclerView.setAdapter(countriesAdapter);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        binding.recyclerView.addItemDecoration(new DividerItemDecoration(binding.recyclerView.getContext(), DividerItemDecoration.VERTICAL));
    }

    public List<String> getOtherData() {
        List<String> countries = new ArrayList<>();
        countries.add("Chile");
        return countries;
    }

    public List<Person> getDataPerson() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Juan", "Pérez", 25));
        persons.add(new Person("María", "Gómez", 32));
        persons.add(new Person("Pedro", "López", 40));
        persons.add(new Person("Laura", "Rodríguez", 28));
        persons.add(new Person("Carlos", "Fernández", 37));
        persons.add(new Person("Ana", "Martínez", 31));
        persons.add(new Person("Luis", "Sánchez", 42));
        persons.add(new Person("Sofía", "Hernández", 29));
        persons.add(new Person("Andrés", "González", 36));
        persons.add(new Person("Isabela", "Torres", 27));
        persons.add(new Person("Martín", "Rivera", 35));
        persons.add(new Person("Valentina", "Cruz", 30));
        persons.add(new Person("Diego", "Mendoza", 38));
        persons.add(new Person("Carolina", "Jiménez", 26));
        persons.add(new Person("Gabriel", "Silva", 33));
        persons.add(new Person("Paula", "Ortega", 39));
        return persons;
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