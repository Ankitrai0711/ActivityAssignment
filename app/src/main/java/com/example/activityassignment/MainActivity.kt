package com.example.activityassignment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.d("TAG","Screen 1 onCreate is Starting")
        val btn = findViewById<Button>(R.id.btnScreen1)
        val data = findViewById<EditText>(R.id.edittextScreen1)
        btn.setOnClickListener{
            val intent = Intent(this,Activity2::class.java)
            val data1 = data.text.toString()
            intent.putExtra("String",data1)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG","Screen 1 onStart Is Starting....")
    }

    override fun onResume() {
        super.onResume()

        Log.d("TAG","Screen 1 onResume Is Starting....")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG","Screen 1 onPause Is Starting....")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Tag","Screen 1 onStop is running")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Tag","Screen 1 onDestroy is running")
    }
}