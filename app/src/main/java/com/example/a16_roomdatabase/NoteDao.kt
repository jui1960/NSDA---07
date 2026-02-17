package com.example.a16_roomdatabase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {
    @Insert
    fun insert(note: Note)


    @Query("SELECT * FROM notes") //notes table thake data anbe
    fun getAllNote(): List<Note>
}