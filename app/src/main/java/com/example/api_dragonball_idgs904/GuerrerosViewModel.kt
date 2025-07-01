package com.example.api_dragonball_idgs904

import kotlinx.coroutines.flow.MutableStateFlow
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class GuerrerosViewModel : ViewModel() {

    //
    private val _characters = MutableStateFlow<List<Character>>(emptyList())
    val characters: StateFlow<List<Character>> = _characters.asStateFlow()

    //
    private val api = DragonBallApi.create()

    //
    init {
        viewModelScope.launch {
            try {
                val response = api.getCharacterss()
                _characters.value = response.items
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}