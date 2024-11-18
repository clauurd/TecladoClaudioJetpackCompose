package com.example.tecladoclaudiojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tecladoclaudiojetpackcompose.ui.theme.TecladoClaudioJetpackComposeTheme
import android.content.Context
import android.media.MediaPlayer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.ui.platform.LocalContext


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TecladoClaudioJetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


fun reproducirSonido(context: Context, soundResId: Int) {
    val mediaPlayer = MediaPlayer.create(context, soundResId)
    mediaPlayer?.apply {
        setOnCompletionListener { mp -> mp.release() }
        start()
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Box(
        modifier =
        Modifier.fillMaxSize()
            .background(color = Color.Black),

        ) {
        Column(
            modifier = Modifier.fillMaxHeight()
                .systemBarsPadding(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween


        ) {
            Box(
                modifier =
                Modifier.fillMaxWidth()
                    .fillMaxHeight()
                    .background(color = Color.White)
                    .weight(1f)
                    .border(border = BorderStroke(3.dp, color = Color.Gray))
                    .clickable {
                        reproducirSonido(context, R.raw.a3)
                    }
            ) {}
            Box(
                modifier =
                Modifier.fillMaxWidth()
                    .fillMaxHeight()
                    .background(color = Color.White)
                    .weight(1f)
                    .border(
                        border = BorderStroke(3.dp, color = Color.Gray)
                    ).clickable {
                        reproducirSonido(context, R.raw.b3)
                    }
            ) {}
            Box(
                modifier =
                Modifier.fillMaxWidth()
                    .fillMaxHeight()
                    .background(color = Color.White)
                    .weight(1f)
                    .border(border = BorderStroke(3.dp, color = Color.Gray))
                    .clickable {
                        reproducirSonido(context, R.raw.c3)
                    }

            ) {}
            Box(
                modifier =
                Modifier.fillMaxWidth()
                    .fillMaxHeight()
                    .background(color = Color.White)
                    .weight(1f)
                    .border(border = BorderStroke(3.dp, color = Color.Gray))
                    .clickable {
                        reproducirSonido(context, R.raw.d3)
                    }


            ) {}
            Box(
                modifier =
                Modifier.fillMaxWidth()
                    .fillMaxHeight()
                    .background(color = Color.White)
                    .weight(1f)
                    .border(border = BorderStroke(3.dp, color = Color.Gray))
                    .clickable {
                        reproducirSonido(context, R.raw.e3)
                    }
            ) {

            }
            Box(
                modifier =
                Modifier.fillMaxWidth()
                    .fillMaxHeight()
                    .background(color = Color.White)
                    .weight(1f)
                    .border(border = BorderStroke(3.dp, color = Color.Gray))
                    .clickable {
                        reproducirSonido(context, R.raw.f3)
                    }
            ) {}
            Box(
                modifier =
                Modifier.fillMaxWidth()
                    .fillMaxHeight()
                    .background(color = Color.White)
                    .weight(1f)
                    .border(border = BorderStroke(3.dp, color = Color.Gray))
                    .clickable {
                        reproducirSonido(context, R.raw.g3)
                    }
            ) {}
            Box(
                modifier =
                Modifier.fillMaxWidth()
                    .fillMaxHeight()
                    .background(color = Color.White)
                    .weight(1f)
                    .border(border = BorderStroke(3.dp, color = Color.Gray))
                    .clickable {
                        reproducirSonido(context, R.raw.a5)
                    }
            ) {}
            Box(
                modifier =
                Modifier.fillMaxWidth()
                    .fillMaxHeight()
                    .background(color = Color.White)
                    .weight(1f)
                    .border(border = BorderStroke(3.dp, color = Color.Gray))
                    .clickable {
                        reproducirSonido(context, R.raw.b5)
                    }
            ) {}
            Box(
                modifier =
                Modifier.fillMaxWidth()
                    .fillMaxHeight()
                    .background(color = Color.White)
                    .weight(1f)
                    .border(border = BorderStroke(3.dp, color = Color.Gray))
                    .clickable {
                        reproducirSonido(context, R.raw.c5)
                    }
            ) {
            Text("hola")
            }
        }
        Column(modifier = Modifier.width(160.dp)
            .fillMaxHeight()
            .background(color = Color.Black)
            ,
                horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween){

        }
    }}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TecladoClaudioJetpackComposeTheme {
        Greeting("")
    }
}