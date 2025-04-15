package com.tekri.harakamall.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tekri.harakamall.dta.UserDatabase
import com.tekri.harakamall.repository.UserRepository
import com.tekri.harakamall.ui.screens.about.AboutScreen
import com.tekri.harakamall.ui.screens.auth.LoginScreen
import com.tekri.harakamall.ui.screens.auth.RegisterScreen
import com.tekri.harakamall.ui.screens.dashboard.DashboardScreen
import com.tekri.harakamall.ui.screens.form.FormScreen
import com.tekri.harakamall.ui.screens.form1.Form1Screen
import com.tekri.harakamall.ui.screens.home.HomeScreen
import com.tekri.harakamall.ui.screens.intent.IntentScreen
import com.tekri.harakamall.ui.screens.item.ItemScreen
import com.tekri.harakamall.ui.screens.service.ServiceScreen
import com.tekri.harakamall.ui.screens.splash.SplashScreen
import com.tekri.harakamall.ui.screens.start.StartScreen
import com.tekri.harakamall.viewmodel.AuthViewModel

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {
    val context= LocalContext.current


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
        composable(ROUT_DASHBOARD) {
            DashboardScreen (navController=navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen (navController=navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen (navController=navController)
        }
        composable(ROUT_FORM) {
            FormScreen (navController=navController)
        }
        composable(ROUT_FORM1) {
            Form1Screen (navController=navController)
        }

        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }


    }
}

