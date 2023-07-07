package com.example.recyclerviewexample;

import android.content.ClipData;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewexample.databinding.ItemBinding;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<String> countries;

    public void setCountries(List<String> countries) {
        this.countries = countries;
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
        String country = countries.get(position);

        holder.bind(country);
    }

    @Override
    public int getItemCount() {
       // Log.d("MyAdapter", "getItemCount ----");
        return countries.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ItemBinding binding;

        public MyViewHolder(ItemBinding binding) {

            super(binding.getRoot());
            this.binding = binding;

        }

        public void bind(String country) {
            //Log.d("MyAdapter - MyViewHolder", "bind ----");
            binding.textView.setText(country);
        }
    }
}
