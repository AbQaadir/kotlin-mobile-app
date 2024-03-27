package com.example.androidapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.androidapi.viewModels.GamesViewModel
import com.example.androidapi.ui.components.GameList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val gamesViewModel = GamesViewModel()
        super.onCreate(savedInstanceState)
        setContent {
            GameList(gamesViewModel)
        }
    }
}



