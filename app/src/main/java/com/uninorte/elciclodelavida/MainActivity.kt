package com.uninorte.elciclodelavida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("elcicloDeLaVida", "MainActivity1: onCreate()");
    }

    override fun onStart() {
        super.onStart()
        Log.e("elcicloDeLaVida","MainActivity1: onStart()");
    }

    override fun onResume() {
        super.onResume()
        Log.e("elcicloDeLaVida","MainActivity1: onResume()");
    }

    override fun onPause() {
        super.onPause()
        Log.e("elcicloDeLaVida","MainActivity1: onPause()");
    }

    override fun onStop() {
        super.onStop()
        Log.e("elcicloDeLaVida","MainActivity1: onStop()");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("elcicloDeLaVida","MainActivity1: onDestroy()");
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("elcicloDeLaVida","MainActivity1: onRestart()");
    }

    fun onClickIrADos(view: View) {
        val i = Intent(this,MainActivity2::class.java)
        startActivity(i)
    }


}