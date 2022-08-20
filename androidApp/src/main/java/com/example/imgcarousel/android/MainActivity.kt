package com.example.imgcarousel.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.imgcarousel.Greeting
import android.widget.TextView
import androidx.constraintlayout.helper.widget.Carousel
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    var CarouselLayout: ConstraintLayout? = null
    var viewPager: ViewPager2? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Img: ArrayList<Int> = arrayListOf(R.drawable.cat1, R.drawable.cat2, R.drawable.cat3, R.drawable.cat4)

        CarouselLayout = findViewById(R.id.Carousel)
        viewPager = CarouselLayout?.findViewById(R.id.viewPager)
        viewPager?.adapter = CarouselPageAdapter(this,Img)

    }
}
