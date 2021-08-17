package com.example.kotlinfivewidgetsandtoastonclick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var iv:ImageView
    lateinit var button: Button
    lateinit var fbtn: FloatingActionButton
    lateinit var  tv:TextView
    lateinit var rbtn:RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iv=findViewById(R.id.iv)
        button =findViewById(R.id.btn)
        fbtn=findViewById(R.id.fbtn)
        tv = findViewById(R.id.fbtn)
        rbtn=findViewById(R.id.rbtn)
        iv.setOnClickListener { Toast.makeText(this,"ImageView is clicked",Toast.LENGTH_SHORT).show() }
        button.setOnClickListener { Toast.makeText(this,"Button is clicked",Toast.LENGTH_SHORT).show() }
        fbtn.setOnClickListener { Toast.makeText(this,"FloatingActonButton is clicked",Toast.LENGTH_SHORT).show() }
        tv.setOnClickListener { Toast.makeText(this,"TextView is clicked",Toast.LENGTH_SHORT).show() }
        rbtn.setOnClickListener { Toast.makeText(this,"Radio Button is clicked",Toast.LENGTH_SHORT).show() }

    }
}