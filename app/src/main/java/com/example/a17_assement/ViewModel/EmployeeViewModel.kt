package com.example.a17_assement.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.room.Query
import com.example.a17_assement.Model.Data
import com.example.a17_assement.Model.EmployeeDatabase
import com.example.a17_assement.Model.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class EmployeeViewModel(application: Application) : AndroidViewModel(application) {

    private val repoViewModel: Repository

    val liveData = MutableLiveData<List<Data>>()

    init {
        val data = EmployeeDatabase.getdatabse(application).employDao()
        repoViewModel = Repository(data)
        loadViewModel()
    }

    fun loadViewModel() {
        viewModelScope.launch(Dispatchers.IO) {
            val data = repoViewModel.getAllRepo()
            withContext(Dispatchers.Main) {
                liveData.value = data
            }

        }
    }

    fun insertView(data: Data) {
        viewModelScope.launch(Dispatchers.IO) {
            repoViewModel.insertRepo(data)
            loadViewModel()


        }
    }

    fun updateView(data: Data) {
        viewModelScope.launch(Dispatchers.IO) {

            repoViewModel.updateRepo(data)
            loadViewModel()
        }
    }

    fun deleteView(data: Data) {
        viewModelScope.launch(Dispatchers.IO) {
            repoViewModel.deleteRepo(data)
            loadViewModel()
        }

    }

    fun searchView(query: String){
        viewModelScope.launch(Dispatchers.IO){
            val result = repoViewModel.searchRepo(query)
            withContext(Dispatchers.Main){
                liveData.value = result
            }
        }
    }

}

