package com.example.boxingproject.presentation.login

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    val state : MutableState<LoginState> = mutableStateOf( LoginState() )
    fun login(email:String, pass:String){
        //TODO
    }
    fun hideErrorDialog(){

    }
}