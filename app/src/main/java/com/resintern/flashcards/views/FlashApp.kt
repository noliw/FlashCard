package com.resintern.flashcards.views

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.resintern.flashcards.views.navigation.FlashNavGraph

@Composable
fun FlashApp() {
    val navController = rememberNavController()
    FlashNavGraph(navController)
}