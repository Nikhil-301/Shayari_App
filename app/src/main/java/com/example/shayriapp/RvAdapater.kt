package com.example.shayriapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shayriapp.databinding.RvItemBinding

class RvAdapater( var context: Context , var shayariList: List<DataEntity>): RecyclerView.Adapter<RvAdapater.ViewHolder>() {


    class ViewHolder(val binding: RvItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val view = RvItemBinding.inflate(LayoutInflater.from(context),parent,false)
    return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.binding.textView.text= shayariList.get(position).shayari
    }

    override fun getItemCount(): Int {
        return shayariList.size
    }
}