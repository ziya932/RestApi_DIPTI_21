package com.example.RestApi_DIPTI_21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity_21 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_21)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, ProductActivity_21::class.java))
            finish()
        }, 3000)
    }
}