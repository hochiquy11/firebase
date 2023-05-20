package com.malkinfo.addinformationfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.malkinfo.addinformationfirebase.view.ItemsActivity
import com.malkinfo.addinformationfirebase.view.UploadActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnViewAll=findViewById<Button>(R.id.btnViewAll)
        val btnAddInfo=findViewById<Button>(R.id.btnAddInfo)
        btnViewAll.setOnClickListener {
            startActivity(Intent(this,ItemsActivity::class.java))
        }
        btnAddInfo.setOnClickListener {
            startActivity(Intent(this,UploadActivity::class.java))
        }

    }


}