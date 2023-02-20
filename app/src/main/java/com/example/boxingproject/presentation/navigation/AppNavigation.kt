package com.example.boxingproject.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.boxingproject.presentation.interactive.MenuScreen
import com.example.boxingproject.presentation.interactive.PagoScreen
import com.example.boxingproject.presentation.login.LoginScreen
import com.example.boxingproject.presentation.login.LoginViewModel
import com.example.boxingproject.presentation.screens.RegistrationScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = AppNav.LoginScreen.route) {

        composable(route = AppNav.LoginScreen.route) {
            val viewModel = LoginViewModel()
            LoginScreen(
                navController,
                state = viewModel.state.value,
                onLogin = viewModel::login,
                onDissmissDialog = viewModel::hideErrorDialog,
                onNavigateToRegister = {
                    navController.navigate(AppNav.MenuScreen.route)
                }
            )
        }
        composable(route = AppNav.RegistrationScreen.route) {
            RegistrationScreen(navController)
        }
        composable(route = AppNav.MenuScreen.route) {
            MenuScreen(navController)
        }
        composable(route = AppNav.PagoScreen.route) {
            PagoScreen(navController)
        }

    }
}
