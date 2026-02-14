package com.example.a12_bmi_calculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a12_bmi_calculator.databinding.ActivityCalculateScreenBinding

class CalculateScreen : AppCompatActivity() {
    private lateinit var binding: ActivityCalculateScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCalculateScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val username = intent.getStringExtra("USER_NAME")

        binding.welcNICal.text = "Hello, $username"

    }
}