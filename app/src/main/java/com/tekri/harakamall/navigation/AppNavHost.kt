package com.tekri.harakamall.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tekri.harakamall.ui.screens.about.AboutScreen
import com.tekri.harakamall.ui.screens.home.HomeScreen
import com.tekri.harakamall.ui.screens.intent.IntentScreen
import com.tekri.harakamall.ui.screens.item.ItemScreen
import com.tekri.harakamall.ui.screens.start.StartScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_HOME
) {


    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController=navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController=navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController=navController)
        }
        composable(ROUT_START) {
            StartScreen(navController=navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen (navController=navController)
        }

    }
}

