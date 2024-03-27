package com.example.androidapi

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidapi.model.Game
import com.example.androidapi.ui.components.GameRow


@Composable
fun GameList(gamesViewModel: GamesViewModel) {
    LazyColumn {
        items(gamesViewModel.gameList.size) { index ->
            GameRow(game = gamesViewModel.gameList[index])
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GameListPreview() {
    GameList(gamesViewModel = GamesViewModel())
}