package com.example.qaidaah;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myRecyclerViewAdapter extends RecyclerView.Adapter<myRecyclerViewAdapter.myViewHandler>{
    List<ayatView> records;
    public myRecyclerViewAdapter(List<ayatView> Record) {
        this.records = Record;
    }
    @NonNull
    @Override
    public myViewHandler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.ayat, parent, false);
        return new myViewHandler(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull myRecyclerViewAdapter.myViewHandler holder, int position) {
        holder.ayat = records.get(position);
        holder.arabic.setText(holder.ayat.text);
        holder.trans.setText(holder.ayat.trans);
    }

    @Override
    public int getItemCount() {
        return records.size();
    }
    public class myViewHandler extends RecyclerView.ViewHolder {
        TextView arabic, trans;
        ayatView ayat;
        public myViewHandler(@NonNull View itemView) {
            super(itemView);
            arabic = itemView.findViewById(R.id.arabic);
            trans = itemView.findViewById(R.id.textView);
        }
    }
}
