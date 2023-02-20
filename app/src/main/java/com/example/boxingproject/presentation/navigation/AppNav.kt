package com.example.boxingproject.presentation.navigation

import androidx.navigation.NamedNavArgument

sealed class AppNav(
    val route: String,
    //val arguments : List<NamedNavArgument>
    ) {
    object LoginScreen : AppNav(route = "LoginScreen") {
        fun crearRouteNueva(nombre: String) : String{
            return "LoginScreen/$nombre"
        }

    }

    object Principal : AppNav(route = "Home"){
        fun mostrarCuentaNueva(nombre: String) : String {
            return "Ho"
        }
    }
    object RegistrationScreen : AppNav(route = "Registration", /*emptyList()*/)
    object PagoScreen : AppNav(route = "PagoScreen", /*emptyList()*/)
    object MenuScreen : AppNav(route = "MenuScreen", /*emptyList()*/)
}