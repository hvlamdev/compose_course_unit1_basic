package com.vanlam.compose_quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vanlam.compose_quadrant.ui.theme.Compose_quadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_quadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant() {
    Row {
        Column(modifier = Modifier.weight(1F)) {
            Row(modifier = Modifier.weight(1F)) {
                ComposeContent(
                    title = "Text composable",
                    description = "Displays text and follows Material Design guidelines.",
                    color = Color.Green
                )
            }
            Row(modifier = Modifier.weight(1F)) {
                ComposeContent(
                    title = "Row composable",
                    description = "A layout composable that places its children in a horizontal sequence.",
                    color = Color.Cyan
                )
            }
        }
        Column(modifier = Modifier.weight(1F)) {
            Row(modifier = Modifier.weight(1F)) {
                ComposeContent(
                    title = "Image composable",
                    description = "Creates a composable that lays out and draws a given Painter class object.",
                    color = Color.Yellow
                )
            }
            Row(modifier = Modifier.weight(1F)) {
                ComposeContent(
                    title = "Column composable",
                    description = "A layout composable that places its children in a vertical sequence.",
                    color = Color.LightGray
                )
            }
        }
    }
}

@Composable
fun ComposeContent(title: String, description: String, color: Color) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .background(color)
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = title, style = TextStyle(fontWeight = FontWeight.Bold), modifier = Modifier.padding(bottom = 16.dp))
        Text(text = description, textAlign = TextAlign.Justify)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Compose_quadrantTheme {
        ComposeQuadrant()
    }
}