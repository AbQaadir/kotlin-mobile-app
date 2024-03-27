package com.example.androidapi.viewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidapi.config.APIService
import com.example.androidapi.model.Game
import kotlinx.coroutines.launch

class GamesViewModel : ViewModel() {

    private val _games = mutableStateListOf<List<Game>>()

    var error : String by mutableStateOf("")

    val games : SnapshotStateList<List<Game>>
        get() = _games

    fun getGames(){
        viewModelScope.launch {
            val response = APIService.getInstance().getGames()
            try {
                _games.clear()
                _games.addAll(listOf(response))
            } catch (e: Exception) {
                error = e.message.toString()
            }
        }
    }

}