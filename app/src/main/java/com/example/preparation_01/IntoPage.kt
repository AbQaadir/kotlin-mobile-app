package com.example.preparation_01

import android.content.res.Configuration
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun IntroPage(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(
            text = "Hello",
            fontSize = 50.sp,
            color = Color.Black,
        )

        Text(
            text = "Please Login",
            fontSize = 34.sp,
            color = Color.Black,
        )

        Button(
            onClick = { Log.d("IntroPage", "Login Button Clicked")},
            modifier = Modifier.padding(16.dp) ) {
            Text(text = "Login")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun IntroPagePreview() {
    IntroPage()
}

@Preview(showBackground = false, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun IntroPageDarkPreview() {
    IntroPage()
}