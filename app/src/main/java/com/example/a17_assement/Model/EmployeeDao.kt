package com.example.a17_assement.Model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface EmployeeDao {

    @Insert
    fun insert(data: Data)

    @Update
    fun update(data: Data)

    @Delete
    fun delete(data: Data)

    @Query("select * from employees_data order by id DESC")
    fun getAllData(): List<Data>


}