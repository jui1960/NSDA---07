package com.example.a17_assement.View

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, WelcomeScreen::class.java))
            finish()
        }, 2000)


    }
}