package com.example.a16_room_database

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class NoteViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: NoteRepository

    val liveData = MutableLiveData<List<Note>>()

    init {
        val dao = AppDatabse.getdatabse(application).notedao()
        repository = NoteRepository(dao)
        loadnoteviewModel()
    }

    private fun loadnoteviewModel() {
        liveData.value = repository.getallnotrepo()

    }


    fun insertview(note: Note) {
        repository.insertrepo(note)
        loadnoteviewModel()
    }


    fun updatertview(note: Note) {
        repository.updaterepo(note)
        loadnoteviewModel()
    }

    fun deleteview(note: Note) {
        repository.deleterepo(note)
        loadnoteviewModel()
    }
}