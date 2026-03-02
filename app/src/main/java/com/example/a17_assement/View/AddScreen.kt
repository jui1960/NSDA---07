package com.example.a17_assement.View

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.a17_assement.Model.Data
import com.example.a17_assement.ViewModel.EmployeeViewModel
import com.example.a17_assement.databinding.ActivityAddScreenBinding


class AddScreen : AppCompatActivity() {
    private lateinit var binding: ActivityAddScreenBinding

    private lateinit var employViewModel: EmployeeViewModel
    private var noteId = -1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAddScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        employViewModel = ViewModelProvider(this)[EmployeeViewModel::class.java]

        noteId = intent.getIntExtra("id", -1)

        if (noteId != -1) {
            binding.etName.setText(intent.getStringExtra("name"))
            binding.etPosition.setText(intent.getStringExtra("position"))
            binding.etEducation.setText(intent.getStringExtra("education"))
            binding.etSalary.setText("${intent.getIntExtra("Salary", 0)}")
            binding.etExperience.setText("${intent.getIntExtra("experience", 0)}")
        }


        binding.btnSave.setOnClickListener {
            val name = binding.etName.text.toString()
            val position = binding.etPosition.text.toString()
            val education = binding.etEducation.text.toString()
            val salary = binding.etSalary.text.toString().toIntOrNull() ?: 0
            val experience = binding.etExperience.text.toString().toIntOrNull() ?: 0




            if (noteId == -1) {
                val data = Data(
                    name = name,
                    position = position,
                    education = education,
                    salary = salary,
                    experience = experience
                )
                employViewModel.insertView(data)
            } else {
                val data = Data(
                    id = noteId,
                    name = name,
                    position = position,
                    education = education,
                    salary = salary,
                    experience = experience
                )
                employViewModel.updateView(data)
            }
            Toast.makeText(
                this@AddScreen, "data saved successfully",
                Toast.LENGTH_SHORT
            ).show()
            finish()

        }
    }

}
