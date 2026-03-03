package com.example.a17_assement.View

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.DialogTitle
import androidx.appcompat.widget.SearchView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Query
import com.example.a17_assement.R
import com.example.a17_assement.ViewModel.EmployeeAdapter
import com.example.a17_assement.ViewModel.EmployeeViewModel
import com.example.a17_assement.databinding.ActivityAddScreenBinding
import com.example.a17_assement.databinding.ActivityHomeScreenBinding
import com.example.a17_assement.databinding.DialogBinding
import org.w3c.dom.Text

class HomeScreen : AppCompatActivity() {
    private lateinit var binding: ActivityHomeScreenBinding
    private lateinit var employViewModel: EmployeeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityHomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabAddEmployee.setOnClickListener {
            startActivity(Intent(this, AddScreen::class.java))
        }

        binding.rvEmployees.layoutManager = LinearLayoutManager(this)

        employViewModel = ViewModelProvider(this)[EmployeeViewModel::class]
        employViewModel.liveData.observe(this) { list ->
            binding.tvEmployeeCount.text = "${list.size}"
            val adapter = EmployeeAdapter(
                list,
                onEdit = { data ->
                    val intent = Intent(this@HomeScreen, AddScreen::class.java)
                    intent.putExtra("id", data.id)
                    intent.putExtra("name", data.name)
                    intent.putExtra("position", data.position)
                    intent.putExtra("salary", data.salary)
                    intent.putExtra("Education", data.education)
                    intent.putExtra("experience", data.experience)
                    startActivity(intent)

                },
                onDelete = { data ->
                    val dialogBinding = DialogBinding.inflate(layoutInflater)
                    val dialog = AlertDialog.Builder(this)
                        .setView(dialogBinding.root)
                        .create()

                    dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

                    dialogBinding.btnConfirm.setOnClickListener {
                        employViewModel.deleteView(data)
                        dialog.dismiss()

                    }
                    dialogBinding.btnCancel.setOnClickListener {
                        dialog.dismiss()
                    }
                    dialog.show()

                },
                onItem = { data ->

                    val intent = Intent(this@HomeScreen, SingleScreen::class.java)
                    intent.putExtra("name", data.name)
                    intent.putExtra("position", data.position)
                    intent.putExtra("salary", data.salary)
                    intent.putExtra("education", data.education)
                    intent.putExtra("experience", data.experience)
                    startActivity(intent)

                })
            binding.rvEmployees.adapter = adapter

        }
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (!newText.isNullOrEmpty()) {
                    employViewModel.searchView(newText)
                } else {
                    employViewModel.loadViewModel()
                }
                return true
            }
        })


    }

    override fun onResume() {
        super.onResume()
        employViewModel.loadViewModel()

    }

}