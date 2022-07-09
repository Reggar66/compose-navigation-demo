package com.example.compose_navigation_demo

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.compose_navigation_demo.screens.home.HomeMain
import com.example.compose_navigation_demo.screens.home.HomeScreen
import com.example.compose_navigation_demo.screens.home.SubHome
import com.example.compose_navigation_demo.screens.other.Other


abstract class Screen(val route: String) {

    open val rootScreenRoute: String = ""

    @Composable
    abstract fun Content(navController: NavHostController)
}

abstract class BottomNavScreen(val route: String) {

    abstract val label: String

    @Composable
    open fun Content(navController: NavHostController) {
    }
}

val bottomScreens = listOf(
    HomeMain,
    Other
)

/**
 * Graph for home screen with nested screens
 */
fun NavGraphBuilder.home(navController: NavHostController) {
    navigation(startDestination = HomeScreen.route, route = HomeMain.route) {
        composable(HomeScreen.route) { HomeScreen.Content(navController = navController) }
        composable(SubHome.route) { SubHome.Content(navController = navController) }
    }
}

/**
 * Graph of screens. Contains all screens and takes care of changing them based on navigation
 * through navController.
 */
@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "homeMain") {
        composable(Other.route) {
            Other.Content(navController = navController)
        }
        home(navController)
    }
}