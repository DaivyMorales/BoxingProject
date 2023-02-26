package com.example.boxingproject.presentation.screens

import androidx.annotation.StringRes

data class RegisterState(
    val successRegister: Boolean = false,
    val displayProgressBar: Boolean = false,
    @StringRes val errorMessages: Int? = null
)
