package com.example.farmersapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.farmersapp.R
import com.example.farmersapp.models.SchemeItem

class GovtSchemeAdapter(private val mList: List<SchemeItem>) : RecyclerView.Adapter<GovtSchemeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.scheme_card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]

        holder.imageView.setImageResource(ItemsViewModel.image)

        holder.textView.setText(ItemsViewModel.text)
        holder.description.setText(ItemsViewModel.description)

    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView3)
        val textView: TextView = itemView.findViewById(R.id.textView4)
        val description: TextView = itemView.findViewById(R.id.textView3)
    }
}