package com.example.a17_assement.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "employees_data")
data class Data(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val name : String,
    val position : String,
    val education : String,
    val salary : Int,
    val experience : Int
)
