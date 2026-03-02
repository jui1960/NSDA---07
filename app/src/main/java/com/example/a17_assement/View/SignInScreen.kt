package com.example.a17_assement.View

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a17_assement.R
import com.example.a17_assement.databinding.ActivitySignInScreenBinding

class SignInScreen : AppCompatActivity() {
    private lateinit var binding : ActivitySignInScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySignInScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this, HomeScreen::class.java))

        }
        binding.tvSignUp.setOnClickListener {
            startActivity(Intent(this, SignUpScreen::class.java))

        }


    }
}