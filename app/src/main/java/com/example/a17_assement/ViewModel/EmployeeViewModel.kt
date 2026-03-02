package com.example.a17_assement.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.a17_assement.Model.Data
import com.example.a17_assement.Model.EmployeeDatabase
import com.example.a17_assement.Model.Repository

class EmployeeViewModel(application: Application) : AndroidViewModel(application) {

    private val repoViewModel: Repository

    val liveData = MutableLiveData<List<Data>>()

    init {
        val data = EmployeeDatabase.getdatabse(application).employDao()
        repoViewModel = Repository(data)
        loadViewModel()
    }

    fun loadViewModel() {
        liveData.value = repoViewModel.getAllRepo()
    }

    fun insertView(data: Data){
        repoViewModel.insertRepo(data)
        loadViewModel()
    }

    fun updateView(data: Data){
        repoViewModel.updateRepo(data)
        loadViewModel()
    }

    fun deleteView(data: Data){
        repoViewModel.deleteRepo(data)
        loadViewModel()
    }

}

