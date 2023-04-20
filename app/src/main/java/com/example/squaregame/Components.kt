package com.example.squaregame

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.squaregame.ui.theme.*

@Composable
fun BoardBase() {
    Canvas(
        modifier = Modifier
            .size(300.dp)
            .padding(5.dp)
            .background(color = Color.LightGray),
    ) {
        drawLine(
            color = Color.Gray,
            strokeWidth = 2f,
            start = Offset(x = size.width*1/5, y = 0f),
            end = Offset(x = size.width*1/5, y = size.height),
        )
        drawLine(
            color = Color.Gray,
            strokeWidth = 2f,
            start = Offset(x = size.width*2/5, y = 0f),
            end = Offset(x = size.width*2/5, y = size.height),
        )
        drawLine(
            color = Color.Gray,
            strokeWidth = 2f,
            start = Offset(x = size.width*3/5, y = 0f),
            end = Offset(x = size.width*3/5, y = size.height),
        )
        drawLine(
            color = Color.Gray,
            strokeWidth = 2f,
            start = Offset(x = size.width*4/5, y = 0f),
            end = Offset(x = size.width*4/5, y = size.height),
        )

        drawLine(
            color = Color.Gray,
            strokeWidth = 2f,
            start = Offset(x = 0f, y = size.width*1/5),
            end = Offset(x = size.width, y = size.width*1/5),
        )
        drawLine(
            color = Color.Gray,
            strokeWidth = 2f,
            start = Offset(x = 0f, y = size.width*2/5),
            end = Offset(x = size.width, y = size.width*2/5),
        )
        drawLine(
            color = Color.Gray,
            strokeWidth = 2f,
            start = Offset(x = 0f, y = size.width*3/5),
            end = Offset(x = size.width, y = size.width*3/5),
        )
        drawLine(
            color = Color.Gray,
            strokeWidth = 2f,
            start = Offset(x = 0f, y = size.width*4/5),
            end = Offset(x = size.width, y = size.width*4/5),
        )
    }
}

@Composable
fun playerSquare() {
    Canvas(
        modifier = Modifier
            .size(60.dp)
    ) {
        drawRect(
            color = playerColor
        )
    }
}

@Composable
fun enemySquare1() {
    Canvas(
        modifier = Modifier
            .size(60.dp)
    ) {
        drawRect(
            color = enemyColor1
        )
    }
}

@Composable
fun enemySquare2() {
    Canvas(
        modifier = Modifier
            .size(60.dp)
    ) {
        drawRect(
            color = enemyColor2
        )
    }
}

@Composable
fun enemySquare3() {
    Canvas(
        modifier = Modifier
            .size(60.dp)
    ) {
        drawRect(
            color = enemyColor3
        )
    }
}

@Composable
fun bonusSquare() {
    Canvas(
        modifier = Modifier
            .size(60.dp)
    ) {
        drawRect(
            color = bonusColor
        )
    }
}

@Composable
fun gameOverSquare() {
    Canvas(
        modifier = Modifier
            .size(60.dp)
    ) {
        drawRect(
            color = gameOverColor
        )
    }
}

@Preview
@Composable
fun Previews() {
    Column{
        playerSquare()
        enemySquare1()
        enemySquare2()
        enemySquare3()
        bonusSquare()
        gameOverSquare()
    }

}