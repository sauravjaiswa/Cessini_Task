package com.saurav.cessini_task.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saurav.cessini_task.R
import com.saurav.cessini_task.model.Parent

class ChildRecyclerAdapter(private val context: Context, private val parentList: MutableList<Parent>,private val pos: Int): RecyclerView.Adapter<ChildViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        return when (pos) {
            0 -> {
                val view= LayoutInflater.from(parent.context).inflate(R.layout.child_item_3, parent, false)
                ChildViewHolder(view)
            }
            1 -> {
                val view= LayoutInflater.from(parent.context).inflate(R.layout.child_item_1, parent, false)
                ChildViewHolder(view)
            }
            else -> {
                val view= LayoutInflater.from(parent.context).inflate(R.layout.child_item_2, parent, false)
                ChildViewHolder(view)
            }
        }
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        if(pos==0){
            if(position%2==0)
                holder.imageView.setImageResource(R.drawable.demo_pic2)
            else
                holder.imageView.setImageResource(R.drawable.demo_pic3)
        }

    }

    override fun getItemCount(): Int {
        return 6
    }
}