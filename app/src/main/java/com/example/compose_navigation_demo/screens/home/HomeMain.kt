package com.example.compose_navigation_demo.screens.home

import com.example.compose_navigation_demo.BottomNavScreen

object HomeMain : BottomNavScreen("homeMain") {

    override val label: String
        get() = "Home"
}