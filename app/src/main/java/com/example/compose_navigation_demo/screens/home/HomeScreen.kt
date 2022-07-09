package com.example.compose_navigation_demo.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.compose_navigation_demo.BottomNavScreen
import com.example.compose_navigation_demo.ui.components.PreviewContainer

object HomeScreen : BottomNavScreen("home") {

    override val label: String
        get() = "Home"

    @Composable
    override fun Content(navController: NavHostController) {
        Home {
            navController.navigate(SubHome.route)
        }
    }
}


@Composable
fun Home(onClick: () -> Unit) {
    Column {
        Text(text = "Home Screen Yay.")
        Button(onClick = onClick) {
            Text(text = "Go to sub screen.")
        }
    }
}

@Preview
@Composable
private fun HomePreview() {
    PreviewContainer {
        Home() {}
    }
}