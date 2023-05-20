package com.malkinfo.addinformationfirebase.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.malkinfo.addinformationfirebase.R
import com.malkinfo.addinformationfirebase.uitel.loadImage
import kotlinx.android.synthetic.main.activity_details.*


class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val intss = intent
        var nameT = intss.getStringExtra("NAMET")
        var priceT = intss.getStringExtra("PRICET")
        var desT = intss.getStringExtra("DESCRIT")
        var imgT = intss.getStringExtra("IMGURI")

        val nameDetailTextView=findViewById<TextView>(R.id.nameDetailTextView)
        val priceDetailTextView=findViewById<TextView>(R.id.priceDetailTextView)
        val descriptionDetailTextView=findViewById<TextView>(R.id.descriptionDetailTextView)
        val productDetailImageView=findViewById<ImageView>(R.id.teacherDetailImageView)
        nameDetailTextView.text = nameT
        priceDetailTextView.text = priceT
        descriptionDetailTextView.text = desT
      productDetailImageView.loadImage(imgT)


    }
}