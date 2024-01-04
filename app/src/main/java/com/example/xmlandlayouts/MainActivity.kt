package com.example.xmlandlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.text)
        val edt = findViewById<EditText>(R.id.edt)
        val btn = findViewById<Button>(R.id.btn)


        btn.setOnClickListener(){
            val edtInfo = edt.text.toString()
            text.text = edtInfo
        }
    }
}