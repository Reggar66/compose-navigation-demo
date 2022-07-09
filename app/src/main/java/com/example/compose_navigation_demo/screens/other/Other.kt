package com.example.compose_navigation_demo.screens.other

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.compose_navigation_demo.BottomNavScreen

object Other : BottomNavScreen("other") {

    override val label: String
        get() = "Other"

    @Composable
    override fun Content(navController: NavHostController) {
        Other()
    }
}

@Composable
fun Other() {
    Text(text = "Other Screen.")
}