package org.freedu.basicroomdbb7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a16_roomdatabase.ItemNote
import com.example.a16_roomdatabase.Note
import com.example.a16_roomdatabase.databinding.ActivityItemNoteBinding

class NoteAdapter(private val list: List<Note>) : RecyclerView.Adapter<NoteAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ActivityItemNoteBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val binding = ActivityItemNoteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val note = list[position]

        holder.binding.name.text = note.name
        holder.binding.address.text = note.address
    }

    override fun getItemCount(): Int = list.size


}