package com.example.test.tuan22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.test.R

class Tuan22SecondActivity : AppCompatActivity() {
    var Tv1: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_second)
        Tv1=findViewById(R.id.tuan22Tv1)
        var i1= intent
        val chuoi1=i1.extras!!.getString("so1")
        val chuoi2=i1.extras!!.getString("so2")
        val so1=chuoi1!!.toFloat()
        val so2=chuoi2!!.toFloat()
        val tong=so1+so2
        Tv1!!.text=tong.toString()
    }
}