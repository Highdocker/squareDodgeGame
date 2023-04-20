package com.example.squaregame

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.squaregame.ui.theme.appBackground

@Composable
fun GameScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(appBackground)
            .padding(25.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .shadow(
                    elevation = 10.dp
                )
                .clip(RoundedCornerShape(10.dp))
                .background(color = Color.White),
            contentAlignment = Alignment.Center
        ) {
            BoardBase()
        }
        Box(
            modifier = Modifier
                .size(width = 225.dp, height = 225.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    modifier = Modifier
                        .size(width =75.dp, height = 75.dp),
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
                ) {
                    Image(painterResource(id = R.drawable.uparrow), contentDescription = null)
                }
                Row{
                    Button(
                        modifier = Modifier
                            .size(width =75.dp, height = 75.dp),
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
                    ) {
                        Image(painterResource(id = R.drawable.leftarrow), contentDescription = null)
                    }
                    Box(
                        modifier = Modifier
                            .size(width =75.dp, height = 75.dp),
                    )
                    Button(
                        modifier = Modifier
                            .size(width =75.dp, height = 75.dp),
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
                    ) {
                        Image(painterResource(id = R.drawable.rightarrow), contentDescription = null)
                    }
                }
                Button(
                    modifier = Modifier
                        .size(width =75.dp, height = 75.dp),
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
                ) {
                    Image(painterResource(id = R.drawable.downarrow), contentDescription = null)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview(modifier: Modifier = Modifier) {
    GameScreen()
}