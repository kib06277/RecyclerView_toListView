package com.order.mostgreen.relativelayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listData = ArrayList<String>()
        for (i in 0..99) {
            listData.add(i.toString())
        }
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        val dataList = findViewById<RecyclerView>(R.id.data_list)
        dataList.layoutManager = layoutManager
        dataList.adapter = DataAdapter(listData)
    }
}