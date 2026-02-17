package org.freedu.basicroomdbb7
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a16_roomdatabase.AppDatabase
import com.example.a16_roomdatabase.databinding.ActivityHomeScreenBinding


class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeScreenBinding

    private lateinit var db: AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityHomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btnAdd.setOnClickListener {
            startActivity(Intent(this, AddActivity::class.java))
        }
        db = AppDatabase.getDatabase(this)
        loadData()

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

    }

    override fun onResume() {
        super.onResume()
        loadData()
    }

    private fun loadData() {

        val list = db.noteDao().getAllNote()

        val adapter = NoteAdapter(list)

        binding.recyclerView.adapter = adapter

    }

}