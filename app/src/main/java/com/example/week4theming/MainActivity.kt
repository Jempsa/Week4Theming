package com.example.week4theming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.week4theming.ui.theme.Week4ThemingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Week4ThemingTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyApp() // Call MyApp instead of Greeting
                }
            }
        }
    }
}

@Composable
fun MyApp() {

    val appModifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "My Title",
            style = MaterialTheme.typography.headlineSmall,
            modifier = appModifier
        )

        OutlinedTextField(
            value = "",
            onValueChange = { /* Handle input*/},
            modifier = appModifier
        )

    }

    Button(
        onClick = { /* Do something */ },
        modifier = appModifier
    ) {
        Text("Submit")
    }
}

@Preview(showBackground = true)
@Composable
fun MyAppPreview() {
    Week4ThemingTheme {
        MyApp() // Preview for MyApp
    }
}