package com.example.a17_assement.Model

import androidx.lifecycle.LiveData
import androidx.room.Query

class Repository(private val employRepo: EmployeeDao) {

    suspend fun insertRepo(data: Data) {
        return employRepo.insert(data)
    }


    suspend fun updateRepo(data: Data) {
        return employRepo.update(data)
    }

    suspend fun deleteRepo(data: Data) {
        return employRepo.delete(data)
    }

    suspend fun getAllRepo(): List<Data> {
        return employRepo.getAllData()
    }
    suspend fun searchRepo(query: String): List<Data>{
        return employRepo.searchData(query)
    }


}