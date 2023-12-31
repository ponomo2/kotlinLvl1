package com.example.homework1

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListItem(
                when (LocalConfiguration.current.orientation) {
                    Configuration.ORIENTATION_LANDSCAPE -> 4
                    else -> 3
                }
            )
        }
    }
}

@Composable
private fun ListItem(
    columnNumber: Int
) {
    Column ( modifier = Modifier
        .fillMaxSize()
        .background(color = colorResource(R.color.AliceBlue))
        .verticalScroll(rememberScrollState())
    ) {
        // количество квадратов
        var squareNumber = rememberSaveable {
            mutableStateOf(0)
        }

        // отрисовывает строки, которые заполнены полностью
        for (i in columnNumber .. (squareNumber.value) step columnNumber) {
            drawRow(i, columnNumber-1)
        }

        // отрисовывает строку, заполненную не полностью
        if (squareNumber.value % columnNumber != 0) {
            val squareInLastRow: Int = (squareNumber.value % columnNumber) - 1
            drawRow(squareNumber.value, squareInLastRow)
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Button(
                onClick = { squareNumber.value++ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.MediumSlateBlue),
                    contentColor = Color.White),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                Text(text = stringResource(R.string.add_button))
            }
        }
    }
}

@Composable
private fun drawRow(lastNumber: Int, squaresInRow: Int) {
    Row (
        modifier = Modifier
            .fillMaxWidth(),
    ) {
        for (i in squaresInRow downTo 0){
            drawSquare(lastNumber - i)
        }
    }
}

@Composable
private fun drawSquare(squareDigit: Int) {
    val squareWidth: Int = LocalConfiguration.current.screenWidthDp / (
                            (if (LocalConfiguration.current.orientation ==
                                    Configuration.ORIENTATION_LANDSCAPE)
                                    4 else 3))
    Box(
        modifier = Modifier
            .size(squareWidth.dp)
            .padding(10.dp)
            .background(
                color = if (squareDigit % 2 == 0) colorResource(R.color.Tomato)
                else colorResource(R.color.DeepSkyBlue)
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "$squareDigit", color = Color.White, fontSize = 20.sp)
    }
}