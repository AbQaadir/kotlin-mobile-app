package com.example.preparation_01.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.preparation_01.R
import com.example.preparation_01.models.Game


@Composable
fun GameRow(game: Game) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        // Jetpack Compose Image default.
//        Image(
//            painter = painterResource(id = R.drawable.ic_launcher_background),
//            contentDescription = game.name,
//            modifier = Modifier.size(64.dp) // Adjust the size as per your requirement
//        )

        // Third-party library Coil Image to load image from URL.
        AsyncImage(
            model = game.imageUrl,
            contentDescription = game.name,
            modifier = Modifier.size(64.dp)
        )

        Column(
            modifier = Modifier.padding(start = 8.dp) // Add some padding between the image and text
        ) {
            Text(
                text = game.name,
                style = TextStyle(fontWeight = FontWeight.Bold)
            )

            Text(
                text = game.releaseDate,
                style = TextStyle(fontSize = 12.sp) // Adjust font size as needed
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
            "https://img.freepik.com/premium-vector/vector-phone-icon_141130-3871.jpg"
        )
    )
}