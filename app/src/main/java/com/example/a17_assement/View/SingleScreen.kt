package com.example.a17_assement.View

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a17_assement.R
import com.example.a17_assement.databinding.ActivitySingleScreenBinding

class SingleScreen : AppCompatActivity() {

    private lateinit var binding: ActivitySingleScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySingleScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val id = intent.getIntExtra("id", -1)
        val name = intent.getStringExtra("name")
        val position = intent.getStringExtra("position")
        val Educaiton = intent.getStringExtra("education")
        val salary = intent.getIntExtra("salary", 0)
        val experience = intent.getIntExtra("experience", 0)


        binding.apply {

            tvDetailName.text = name
            tvDetailSalary.text = position
            tvDetailEducation.text = Educaiton
            tvDetailSalary.text = salary.toString()
            tvDetailExperience.text = experience.toString()
        }
    }
}