package com.example.boxingproject.presentation.navigation

import androidx.navigation.NamedNavArgument

sealed class AppNav(
    val route: String,
    val arguments : List<NamedNavArgument>
    ) {
    object LoginScreen : AppNav(route = "LoginScreen", emptyList())
    object RegistrationScreen : AppNav(route = "Registration", emptyList())
    object PagoScreen : AppNav(route = "PagoScreen", emptyList())
    object MenuScreen : AppNav(route = "MenuScreen", emptyList())
}