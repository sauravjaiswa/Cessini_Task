package com.saurav.cessini_task.adapter

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.saurav.cessini_task.R

class ChildViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val imageView: ImageView=view.findViewById(R.id.imageView)
}