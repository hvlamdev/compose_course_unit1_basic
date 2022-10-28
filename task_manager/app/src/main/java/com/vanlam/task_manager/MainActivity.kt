package com.vanlam.task_manager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vanlam.task_manager.ui.theme.Task_managerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Task_managerTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    TaskManager()
                }
            }
        }
    }
}

@Composable
fun TaskManager() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TaskImage()
        Text(
            text = "All tasks completed",
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp)
                .fillMaxWidth(),
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
        )
        Text(text = "Nice work!", fontSize = 16.sp)
    }
}

@Composable
fun TaskImage() {
    val image = painterResource(id = R.drawable.ic_task_completed)
    return Image(painter = image, contentDescription = "Task Icon")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Task_managerTheme {
        TaskManager()
    }
}