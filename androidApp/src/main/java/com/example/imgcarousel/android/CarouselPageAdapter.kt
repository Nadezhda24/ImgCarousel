package com.example.imgcarousel.android

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter

class CarouselPageAdapter(
    private val context: Context,
    private val data: ArrayList<Int>
): RecyclerView.Adapter<CarouselPageAdapter.ViewHolder>(){

    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
       val Img: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.carousel_item, parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.Img.setImageResource(data[position % data.size])
    }

    override fun getItemCount(): Int {
        return if (data.size > 0){
            Int.MAX_VALUE
        }else{
            0
        }

    }



}