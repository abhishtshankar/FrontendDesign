package com.abhisht28.gridrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import model.home

class RecyclerAdapter(val context: Context, val itemList: ArrayList<home>):
    RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_single_row, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {

        val home =itemList[position]
        holder.imgBookImage.setImageResource(home.Image)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }




    class RecyclerViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imgBookImage: ImageView = view.findViewById(R.id.image)
    }

}

