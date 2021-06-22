package com.nwanneka.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    private lateinit var usernamedisplay: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        usernamedisplay= findViewById(R.id.usernamedisplay)
        usernamedisplay.text=intent.getStringExtra("username")

    }

}