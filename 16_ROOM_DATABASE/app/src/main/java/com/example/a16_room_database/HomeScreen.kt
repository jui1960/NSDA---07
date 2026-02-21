package com.example.a16_room_database

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a16_room_database.databinding.ActivityHomeScreenBinding
import com.example.a16_room_database.databinding.ActivityMainBinding

class HomeScreen : AppCompatActivity() {

    private lateinit var binding: ActivityHomeScreenBinding
    private lateinit var db: AppDatabse


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityHomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnAdd.setOnClickListener {
            startActivity(Intent(this, AddActivity::class.java))
        }

        db = AppDatabse.getdatabse(this)
        loadData()

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }

    override fun onResume() {
        super.onResume()
        loadData()
    }

    private fun loadData() {
        val list = db.notedao().getallNotes()

        val adapter = NoteAdapter(
            list,
            onedit = { note ->
                val intent = Intent(this@HomeScreen, AddActivity::class.java)
                intent.putExtra("id", note.id)
                intent.putExtra("name", note.name)
                intent.putExtra("address", note.address)
                intent.putExtra("email",note.email)
                intent.putExtra("phone",note.phone)
                startActivity(intent)
            },
            ondelete = { note ->
                db.notedao().delete(note)
                loadData()
            }
        )
        binding.recyclerView.adapter = adapter
    }
}