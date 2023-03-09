package com.example.ujian

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val room = findViewById<ImageView>(R.id.roomBtn)
        room.setOnClickListener {
            val intent = Intent(this, RoomActivity::class.java)
            startActivity(intent)
        }
        val facilities = findViewById<ImageView>(R.id.FacilitiesBtn)
        facilities.setOnClickListener {
            val intent = Intent(this, FacilitiesActivity::class.java)
            startActivity(intent)
        }
        val gallery = findViewById<ImageView>(R.id.galleryBtn)
        gallery.setOnClickListener {
            val intent = Intent(this, GalleryActivity::class.java)
            startActivity(intent)
        }
    }
}