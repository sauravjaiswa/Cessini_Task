package com.saurav.cessini_task.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.saurav.cessini_task.R
import com.saurav.cessini_task.model.Parent

class ParentRecyclerAdapter(private val context: Context,private val parentList: MutableList<Parent>): RecyclerView.Adapter<ParentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.child_recycler, parent, false)
        return ParentViewHolder(view)
    }

    override fun onBindViewHolder(holder: ParentViewHolder, position: Int) {
        holder.layoutManager= LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        holder.childRecyclerAdapter=ChildRecyclerAdapter(context,parentList,position)
        holder.recyclerViewChild.adapter=holder.childRecyclerAdapter
        holder.recyclerViewChild.layoutManager=holder.layoutManager
    }

    override fun getItemCount(): Int {
        return 10
    }

}