package com.example.test.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.test.R;

public class Tuan21MainActivity extends AppCompatActivity {
    EditText txt1, txt2;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan21_main);
        txt1=findViewById(R.id.tuan21txt1);
        txt2=findViewById(R.id.tuan21txt2);
        btn1=findViewById(R.id.tuan21Btn1);
        //su kien khi click button
        btn1.setOnClickListener(v->{
            //dinh huong di chuyen
            Intent i = new Intent(Tuan21MainActivity.this,
                    Tuan21SecondMainActivity.class);
            //dua du lieu vào
            i.putExtra("so 1", txt1.getText().toString());
            i.putExtra("so 2", txt2.getText().toString());
            //khoi hanh
            startActivity(i);
        });
    }
}