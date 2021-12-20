package com.example.threebuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class SecondActivity : AppCompatActivity() {

    private lateinit var tvShow: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        tvShow= findViewById(R.id.tvShow)
        tvShow.text= intent.extras!!.getString("Message")
    }
}