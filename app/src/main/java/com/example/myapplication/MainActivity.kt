package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(tag,"onCreate")

        var button = findViewById<Button>(R.id.button);
        button.setOnClickListener(){
           intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e(tag,"Onstart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(tag,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e(tag,"onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(tag,"onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.e(tag,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(tag,"onDestroy")
    }
}