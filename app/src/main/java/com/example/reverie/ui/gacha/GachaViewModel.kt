package com.example.reverie.ui.gacha

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GachaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is gacha Fragment"
    }
    val text: LiveData<String> = _text
}