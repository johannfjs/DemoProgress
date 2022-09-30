package com.johannjara.demoprogress

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "main"
    ) {
        composable(route = "main") {
            MainScreen(onInfoClick = { navController.navigate("info") })
        }

        composable(route = "info") {
            InfoScreen(onBackClick = { navController.popBackStack() })
        }
    }
}
