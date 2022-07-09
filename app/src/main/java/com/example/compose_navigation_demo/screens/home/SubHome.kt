package com.example.compose_navigation_demo.screens.home

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.compose_navigation_demo.Screen
import com.example.compose_navigation_demo.ui.components.PreviewContainer

object SubHome : Screen("subHome") {

    override val rootScreenRoute: String
        get() = HomeScreen.route

    @Composable
    override fun Content(navController: NavHostController) {
        SubHome()
    }
}

@Composable
fun SubHome() {
    Text(text = "Sub Home Screen :D")
}

@Preview
@Composable
private fun SubHomePreview() {
    PreviewContainer {
        SubHome()
    }
}