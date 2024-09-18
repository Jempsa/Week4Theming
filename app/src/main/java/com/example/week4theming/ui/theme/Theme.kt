package com.example.week4theming.ui.theme


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


private val DarkColorScheme = darkColorScheme(
    primary = CustomPrimaryColor,
    secondary = Color(0xFF03DAC5),

)

private val LightColorScheme = lightColorScheme(
    primary = CustomPrimaryColor,
    secondary = Color(0xFF03DAC5),
)

@Composable
fun Week4ThemingTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colors,
        typography = Typography, // Make sure Typography is defined
        content = content
    )
}

