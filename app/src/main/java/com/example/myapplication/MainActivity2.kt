package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    val tag = "MainActivity2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
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