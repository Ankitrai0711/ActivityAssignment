package com.example.activityassignment

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        Log.d("TAG","Screen 2 onCreate is Starting")
        setContentView(R.layout.activity_2)
        val btn = findViewById<Button>(R.id.btnScreen2)
        val msg = findViewById<TextView>(R.id.textviewScreen2)
        val textView = findViewById<TextView>(R.id.textview2Screen2)
        val msg2 = intent.getStringExtra("String")
        msg.text = msg2
        btn.setOnClickListener{
            val msg = findViewById<EditText>(R.id.edittextScreen2)
            val data = msg.text.toString()
            textView.text = data

        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("TAG","Activity 2 onStart Is Starting....")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG","Activity 2 onResume Is Starting....")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG","Activity 2 onPause Is Starting....")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Tag","Activity 2 onStop is running")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Tag","Activity 2 onDestroy is running")
    }
}