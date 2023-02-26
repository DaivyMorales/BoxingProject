package com.example.boxingproject.presentation.navigation

import androidx.navigation.NamedNavArgument

sealed class AppNav(
    val route: String
    ) {
    object LoginScreen : AppNav(route = "LoginScreen/{nameValue}") {
        fun crearRouteNueva(nameValue: String) : String{
            return "LoginScreen/$nameValue"
        }
    }
    object RegistrationScreen : AppNav(route = "RegistrationScreen")
    object PagoScreen : AppNav(route = "PagoScreen")
    object MenuScreen : AppNav(route = "MenuScreen")

    object HomeScreen : AppNav("HomeScreen/{user}"){
        fun createRoute(user : String) : String {
            return "HomeScreen/$user"
        }
    }
}