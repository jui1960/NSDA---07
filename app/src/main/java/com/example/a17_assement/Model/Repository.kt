package com.example.a17_assement.Model

import androidx.lifecycle.LiveData

class Repository(private val employRepo: EmployeeDao) {

    fun insertRepo(data: Data) {
        return employRepo.insert(data)
    }


    fun updateRepo(data: Data) {
        return employRepo.update(data)
    }

    fun deleteRepo(data: Data) {
        return employRepo.delete(data)
    }

    fun getAllRepo(): List<Data> {
        return employRepo.getAllData()
    }


}