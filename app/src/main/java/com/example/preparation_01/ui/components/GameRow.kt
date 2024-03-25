package com.example.preparation_01.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.preparation_01.R
import com.example.preparation_01.models.Game

@Composable
fun GameRow(game : Game) {

    Row {
        // Jetpack Compose Image default.
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = game.name
        )

        Column {
            Text(
                text = game.name,
            )

            Text(
                text = game.releaseDate,
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun GameRowPreview() {
    GameRow(
        Game(
            "Call Of Duty: Worzon Mobile",
            "2021-01-01",
            "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRMzemGJTYpyHORha6PuONvh04Bjh0k-fhW-MdnciCF8Wa7H-Mf"
        )
    )
}