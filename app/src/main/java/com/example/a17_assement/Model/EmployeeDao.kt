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
    suspend fun insert(data: Data)

    @Update
    suspend fun update(data: Data)

    @Delete
    suspend fun delete(data: Data)

    @Query("select * from employees_data order by id DESC")
    suspend fun getAllData(): List<Data>

    @Query("select * from employees_data where name like '%' || :query || '%'")
    suspend fun searchData(query: String): List<Data>


}