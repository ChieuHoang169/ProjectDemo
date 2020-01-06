package com.example.xdapp.ui.todo


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodoViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This isTo DO Fragment"
    }
    val text: LiveData<String> = _text
}