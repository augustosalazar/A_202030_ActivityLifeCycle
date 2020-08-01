package com.uninorte.elciclodelavida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.e("elcicloDeLaVida","MainActivity2: onCreate()");
    }

    override fun onStart() {
        super.onStart()
        Log.e("elcicloDeLaVida","MainActivity2: onStart()");
    }

    override fun onResume() {
        super.onResume()
        Log.e("elcicloDeLaVida","MainActivity2: onResume()");
    }

    override fun onPause() {
        super.onPause()
        Log.e("elcicloDeLaVida","MainActivity2: onPause()");
    }

    override fun onStop() {
        super.onStop()
        Log.e("elcicloDeLaVida","MainActivity2: onStop()");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("elcicloDeLaVida","MainActivity2: onDestroy()");
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("elcicloDeLaVida","MainActivity2: onRestart()");
    }
}