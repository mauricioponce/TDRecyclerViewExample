package com.example.recyclerviewexample;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewexample.databinding.ItemBinding;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<Person> persons;

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("MyAdapter", "onCreateViewHolder ----");
        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Log.d("MyAdapter", "onBindViewHolder ----");
        Person person = persons.get(position);

        holder.bind(person);
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ItemBinding binding;

        public MyViewHolder(ItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }

        public void bind(Person person) {
            //Log.d("MyAdapter - MyViewHolder", "bind ----");
            binding.tvName.setText(person.getName());
            binding.tvLastname.setText(person.getLastname());
            binding.tvAge.setText(String.valueOf(person.getAge()));
        }
    }
}
