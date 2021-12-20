package com.example.simplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var kotlinButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        kotlinButton= findViewById(R.id.kotlinButton)

        kotlinButton.setOnClickListener{
            Toast.makeText(this,"Button one",Toast.LENGTH_SHORT).show()
        }
    }

    fun xmlClick(view: View) {
        Toast.makeText(this,"Button two",Toast.LENGTH_SHORT).show()
    }
}