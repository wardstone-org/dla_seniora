package com.wardstone.dla_seniora.core.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

// Kolory jasnego motywu SeniorOS
private val SeniorLightColorScheme = lightColorScheme(
    primary = SeniorBlue,
    onPrimary = SeniorWhite,

    secondary = SeniorGreen,
    onSecondary = SeniorWhite,

    error = SeniorSosRed,
    onError = SeniorWhite,

    background = SeniorBackground,
    onBackground = SeniorText,

    surface = SeniorWhite,
    onSurface = SeniorText,

    outline = SeniorBorder
)

// Kolory ciemnego motywu SeniorOS
private val SeniorDarkColorScheme = darkColorScheme(
    primary = SeniorBlue,
    onPrimary = SeniorWhite,

    secondary = SeniorGreen,
    onSecondary = SeniorWhite,

    error = SeniorSosRed,
    onError = SeniorWhite,

    background = SeniorDarkBackground,
    onBackground = SeniorLightText,

    surface = SeniorDarkSurface,
    onSurface = SeniorLightText,

    outline = SeniorBorder
)

// Motyw całej aplikacji
@Composable
fun Dla_senioraTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        SeniorDarkColorScheme
    } else {
        SeniorLightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}