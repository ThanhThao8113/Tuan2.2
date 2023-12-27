package com.example.test.tuan22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.test.R

class Tuan222MainActivity : AppCompatActivity() {
    var lv:ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan222_main)
        //nguon du lieu
        val arr = arrayOf("item1","item2","itme3","item4","item5","itme6","item7")
        //adapter
        val ad= ArrayAdapter(this,
            android.R.layout.simple_list_item_1, arr)
        //hien thi len ListView
        lv!!.adapter=ad
    }
}