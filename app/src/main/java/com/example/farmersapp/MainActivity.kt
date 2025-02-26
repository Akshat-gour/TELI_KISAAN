package com.example.farmersapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.farmersapp.dashboard.AboutCrop
import com.example.farmersapp.dashboard.ChatBot
import com.example.farmersapp.dashboard.CropPrediction
import com.example.farmersapp.dashboard.GovernmentSchemas
import com.example.farmersapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.aboutCropCard.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, AboutCrop::class.java))
        })
        binding.schemaCard.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, GovernmentSchemas::class.java))
        })
        binding.chatBotCard.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, ChatBot::class.java))
        })
        binding.prediction.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, CropPrediction::class.java))
        })
    }
}