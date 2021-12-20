package com.example.threebuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var kotlinButton: Button
    private lateinit var etItem1: EditText
    private lateinit var etItem2: EditText
    private lateinit var etItem3: EditText
    private lateinit var tvSHow: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kotlinButton= findViewById(R.id.displayButton)
        etItem1= findViewById(R.id.entryET)
        etItem2= findViewById(R.id.entry2ET)
        etItem3= findViewById(R.id.entry3ET)
        tvSHow= findViewById(R.id.tvShow)

        kotlinButton.setOnClickListener{
            if (etItem1.text.isNotBlank())
                tvSHow.text= etItem1.text
            else
                Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show()
        }
    }

    fun xmlClick(view: View) {
        if (etItem2.text.isNotBlank())
            Toast.makeText(this,etItem2.text.toString(),Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show()
    }

    fun goClick(view: View) {
        if (etItem3.text.isNotBlank()){
            val intent= Intent(this,SecondActivity::class.java)
            intent.putExtra("Message",etItem3.text.toString())
            startActivity(intent)
        }
        else
            Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show()
    }
}