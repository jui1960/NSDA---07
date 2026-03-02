package com.example.a17_assement.View

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a17_assement.R
import com.example.a17_assement.databinding.ActivitySignInScreenBinding
import com.example.a17_assement.databinding.ActivitySignUpScreenBinding

class SignUpScreen : AppCompatActivity() {
    private lateinit var binding : ActivitySignUpScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySignUpScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnSignUp.setOnClickListener {
            startActivity(Intent(this, HomeScreen::class.java))

        }
        binding.tvSignIn.setOnClickListener {
            startActivity(Intent(this, SignInScreen::class.java))

        }
    }
}