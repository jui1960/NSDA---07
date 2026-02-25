package com.example.a16_room_database

import androidx.lifecycle.LiveData

class NoteRepository(private val notedaorepo : NoteDao) {

    fun getallnotrepo(): List<Note>{
        return notedaorepo.getallNotes()
    }
    fun insertrepo(note: Note){
        return notedaorepo.insert(note)
    }
    fun updaterepo(note: Note){
        return notedaorepo.update(note)
    }
    fun deleterepo(note: Note){
        return notedaorepo.delete(note)
    }
}