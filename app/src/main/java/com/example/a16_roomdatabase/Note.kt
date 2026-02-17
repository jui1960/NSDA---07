package com.example.a16_roomdatabase

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class Note(
    @PrimaryKey(autoGenerate = true) //autogenarate hbe id ta,, 0 ase,,erpor  1,2,3 ...hote thakbe
    val id : Int = 0,
    val name : String,
    val address : String
)