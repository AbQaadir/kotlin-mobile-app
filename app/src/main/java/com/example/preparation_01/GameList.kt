package com.example.preparation_01

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.preparation_01.models.Game
import com.example.preparation_01.ui.components.GameRow
import com.example.preparation_01.models.gameList


@Composable
fun GameList(gameList: List<Game> = emptyList()) {
    LazyColumn {
        items(gameList.size) { index ->
            GameRow(game = gameList[index])
        }
    }


}

@Preview(showBackground = true)
@Composable
fun GameListPreview() {
    GameList(gameList = gameList)
}