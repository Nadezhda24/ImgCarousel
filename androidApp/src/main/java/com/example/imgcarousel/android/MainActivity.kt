package com.example.imgcarousel.android

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.imgcarousel.Greeting
import android.widget.TextView
import androidx.constraintlayout.helper.widget.Carousel
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    var CarouselLayout: ConstraintLayout? = null
    var viewPager: ViewPager2? = null
    var IndicatorsLinearLayout: LinearLayout? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        CarouselLayout = findViewById(R.id.Carousel)
        viewPager = CarouselLayout?.findViewById(R.id.viewPager)
        IndicatorsLinearLayout = CarouselLayout?.findViewById(R.id.IndicatorsLinearLayout)

        val Img: ArrayList<Int> = arrayListOf(R.drawable.cat1, R.drawable.cat2, R.drawable.cat3, R.drawable.cat4)
        val IndicatorsImg: ArrayList<ImageView> = ArrayList()

        for (i in 0 until Img.size){
            val imageView = ImageView(this)
            imageView.setImageResource(R.drawable.circle)
            imageView.setPadding(15,5,15,5)
            IndicatorsImg.add(imageView)
            IndicatorsLinearLayout?.addView(imageView)
        }

        viewPager?.currentItem = Int.MAX_VALUE / 2 + 1
        viewPager?.adapter = CarouselPageAdapter(this,Img)

        viewPager?.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                for (item in IndicatorsImg) item.setImageResource(R.drawable.circle)
                IndicatorsImg[position % IndicatorsImg.size ].setImageResource(R.drawable.circle_choice)
            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
            }

            override fun onPageScrolled(position: Int,
                                        positionOffset: Float,
                                        positionOffsetPixels: Int) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }
        })




    }
}
