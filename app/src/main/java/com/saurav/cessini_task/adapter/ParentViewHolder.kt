package com.saurav.cessini_task.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.saurav.cessini_task.R

class ParentViewHolder(view: View): RecyclerView.ViewHolder(view){
    val recyclerViewChild: RecyclerView=view.findViewById(R.id.recyclerViewChild)
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var childRecyclerAdapter: ChildRecyclerAdapter
}