package com.example.boxingproject.presentation.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.boxingproject.presentation.navigation.AppNav

@Composable
fun HomeScreen(navController: NavController, user: String){
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "$user")
        Spacer(modifier = Modifier.size(10.dp))
        Button(
            onClick = { navController.navigate(AppNav.LoginScreen.route) },
            modifier = Modifier
                .width(200.dp)
                .height(50.dp)
        ) {
            Text(text = "Salir")
        }
    }
}