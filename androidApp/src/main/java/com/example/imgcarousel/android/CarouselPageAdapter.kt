package com.example.imgcarousel.android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView


class CarouselPageAdapter(
    private val data: ArrayList<Int>
): RecyclerView.Adapter<CarouselPageAdapter.ViewHolder>(){

    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
       val Img: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.carousel_item, parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.Img.setImageResource(data[position])
    }

    override fun getItemCount() = data.size



}