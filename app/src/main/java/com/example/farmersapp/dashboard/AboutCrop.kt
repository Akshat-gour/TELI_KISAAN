
package com.example.farmersapp.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.farmersapp.R
import com.example.farmersapp.adapters.AboutCropAdapter
import com.example.farmersapp.models.CropItem
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class AboutCrop : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_crop)
            val recyclerview = findViewById<RecyclerView>(R.id.recyclerView2)

            recyclerview.layoutManager = LinearLayoutManager(this)

            val db = Firebase.firestore
            val data = ArrayList<CropItem>()
            db.collection("crops")
                .get()
                .addOnSuccessListener { result ->
                    for (document in result) {
                        data.add(CropItem(R.drawable.bot_icon,document.data.get("name").toString() ,document.data.get("N").toString(),document.data.get("P").toString(),document.data.get("K").toString()))
//                        Toast.makeText(this, "${document.id}=> ${document.data}", Toast.LENGTH_SHORT).show()
                    }
                    val adapter = AboutCropAdapter(data)
                    recyclerview.adapter = adapter
                }
                .addOnFailureListener { exception ->
                    Toast.makeText(this, "$exception", Toast.LENGTH_LONG).show()
                }




    }
}