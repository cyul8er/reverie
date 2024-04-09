package com.example.reverie.ui.task

import android.icu.text.IDNA.Info
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.reverie.databinding.FragmentTaskBinding

class Adapter(val list:ArrayList<Info>): RecyclerView.Adapter<Adapter.MyView>() {
    
    inner class MyView(val itemBinding: FragmentTaskBinding): RecyclerView.ViewHolder(itemBinding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        return MyView(FragmentTaskBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: MyView, position: Int) {
        holder.itemBinding.taskRecyclerView.
        holder.itemBinding.taskRecyclerView.text = list[position].name
    }


}