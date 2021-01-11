package com.saurav.cessini_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.saurav.cessini_task.adapter.ParentRecyclerAdapter
import com.saurav.cessini_task.model.Parent

class MainActivity : AppCompatActivity() {
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: ParentRecyclerAdapter
    lateinit var recyclerViewParent: RecyclerView

    var parentList= mutableListOf<Parent>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewParent=findViewById(R.id.recyclerViewParent)

        recyclerAdapter=ParentRecyclerAdapter(this,parentList)
        layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerViewParent.layoutManager=layoutManager
        recyclerViewParent.adapter=recyclerAdapter
    }
}