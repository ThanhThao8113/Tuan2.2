package com.example.test.tuan22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.test.R

class Tuan22MainActivity : AppCompatActivity() {
    var Txt1:EditText?= null
    var Txt2:EditText? = null
    var Btn1:Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_main)
        Txt1= findViewById(R.id.tuan22Txt1)
        Txt2= findViewById(R.id.tuan22Txt2)
        Btn1=findViewById(R.id.tuan22Btn1)
        Btn1!!.setOnClickListener(View.OnClickListener {
            var i = Intent(this@Tuan22MainActivity,
                Tuan22SecondActivity::class.java)
            i.putExtra("so1",Txt1!!.text.toString())
            i.putExtra("so2",Txt2!!.text.toString())
            startActivity(i)
        })
    }
}