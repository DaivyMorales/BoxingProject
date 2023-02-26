package com.example.boxingproject.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.boxingproject.presentation.home.HomeScreen
import com.example.boxingproject.presentation.interactive.MenuScreen
import com.example.boxingproject.presentation.interactive.PagoScreen
import com.example.boxingproject.presentation.login.LoginScreen
import com.example.boxingproject.presentation.login.LoginViewModel
import com.example.boxingproject.presentation.screens.RegisterViewModel
import com.example.boxingproject.presentation.screens.RegistrationScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppNav.LoginScreen.route
    ) {

        val viewModel = LoginViewModel()
        composable(route = AppNav.LoginScreen.route) {

            if( viewModel.state.value.successLogin ){
                LaunchedEffect(key1 = Unit){
                    navController.navigate(AppNav.HomeScreen.createRoute(viewModel.state.value.email)){

                        popUpTo(AppNav.LoginScreen.route){
                            inclusive = true
                        }
                    }
                }
            }else{
            LoginScreen(
                navController,
                state = viewModel.state.value,
                onLogin = viewModel::login,
                onDissmissDialog = viewModel::hideErrorDialog,
                onNavigateToRegister = {
                    navController.navigate(AppNav.RegistrationScreen.route)
                },
            )
        }
        }// End Route Login

        val viewModel2 = RegisterViewModel()
        composable("RegistrationScreen")
        {

            RegistrationScreen(
                navController,
                state = viewModel2.state.value,
                onRegister = viewModel2::register,
                onBack = { navController.popBackStack() },
                onDismissDialog = viewModel2::hideErrorDialog
            )
        }
        composable(route = AppNav.MenuScreen.route) {
            MenuScreen(navController)
        }
        composable(route = AppNav.PagoScreen.route) {
            PagoScreen(navController)
        }

        composable(
            route = AppNav.HomeScreen.route,
            arguments = listOf(navArgument("user"){
            type = NavType.StringType
            })){
            HomeScreen(navController = navController, user = it.arguments?.getString("user") ?: "")
        }
    }
}

