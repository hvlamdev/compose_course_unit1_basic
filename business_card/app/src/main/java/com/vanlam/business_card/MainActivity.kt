package com.vanlam.business_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material.icons.sharp.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vanlam.business_card.ui.theme.Business_cardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Business_cardTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    DefaultPreview()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF009688))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "logo")
            Text(
                text = "Hoang Van Lam",
                color = Color.White,
                fontSize = 34.sp,
                modifier = Modifier.padding(bottom = 12.dp)
            )
            Text(text = "Android Developer Extraordinaire", color = Color.Yellow, fontSize = 16.sp)
        }
        Column(modifier = Modifier.padding(bottom = 24.dp)) {
            Info(
                Icons.Rounded.Email,
                content = "hvlamdev@gmail.com",
                description = "Email"
            )
            Info(
                Icons.Sharp.Phone,
                content = "098xxxxxxx",
                description = "Phone"
            )
            Info(
                Icons.Rounded.Share,
                content = "@hvlamdev",
                description = "Link"
            )
        }
    }
}

@Composable
fun Info(icon: ImageVector, content: String, description: String) {
    Column {
        Divider(modifier = Modifier.fillMaxWidth(), color = Color.White, thickness = 1.dp)
        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = 42.dp, top = 12.dp, bottom = 12.dp)) {
            Icon(
                icon,
                contentDescription = description,
                tint = Color(0xFF9DF1F1),
                modifier = Modifier.padding(end = 16.dp)
            )
            Text(text = content, color = Color.White, fontSize = 16.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Business_cardTheme {
        BusinessCard()
    }
}