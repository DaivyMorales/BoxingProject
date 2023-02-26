package com.example.boxingproject.presentation.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import com.example.boxingproject.R
import com.example.boxingproject.presentation.components.EvenDialog
import com.example.boxingproject.presentation.components.RoundedButtom
import com.example.boxingproject.presentation.components.TransparentTextField
import com.example.boxingproject.presentation.navigation.AppNav
import kotlin.reflect.KFunction
import kotlin.reflect.KFunction0

@Composable
fun LoginScreen(
    navController: NavController,
    state : LoginState,
    onLogin : (dato1: String, dato2:String) -> Unit,
    onNavigateToRegister : ()-> Unit,
    onDissmissDialog : KFunction0<Unit>,
){
    val emailValue = rememberSaveable {
        mutableStateOf("")
    }

    val passwordValue = rememberSaveable {
        mutableStateOf("")
    }

    var passwordVisibility by remember{
        mutableStateOf(false)
    }

    val focusManager = LocalFocusManager.current

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
        ){
    Image(
        painterResource(id = R.drawable.user ),
        contentDescription = "Imagen Usuario",
        contentScale =  ContentScale.Inside
    )
        Box( modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ){
            ConstraintLayout {
                val (surface, fab) = createRefs()
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(400.dp)
                        .constrainAs(surface) {
                            //Alinea el control al final de surface
                            bottom.linkTo(parent.bottom)
                        },
                    color = Color.White,
                    shape = RoundedCornerShape(
                        topStartPercent = 8, topEndPercent = 8
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Text(text = "Bienvenido",
                            style = MaterialTheme.typography.h4.copy(
                                fontWeight = FontWeight.Medium
                            )
                        )
                        Text(text = "Accede a tu cuenta",
                            style = MaterialTheme.typography.h4.copy(
                                fontWeight = FontWeight.Medium
                            )
                        )

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)

                        ) {
                            TransparentTextField(
                                textFieldValue = emailValue,
                                textLabel = "Email",
                                keyboardType = KeyboardType.Email,
                                keyboardActions = KeyboardActions(
                                    onNext = {
                                        focusManager.moveFocus(
                                            focusDirection = FocusDirection.Down
                                        )
                                    }
                                ),
                                imeAction = ImeAction.Next
                            )

                            TransparentTextField(
                                textFieldValue = passwordValue,
                                textLabel = "Password",
                                keyboardType = KeyboardType.Password,
                                keyboardActions = KeyboardActions(
                                    onDone = {
                                        focusManager.clearFocus()
                                        onLogin(emailValue.value, passwordValue.value)
                                    }
                                ),
                                imeAction = ImeAction.Done,
                                trailingIcon = {
                                    IconButton(onClick = {
                                        passwordVisibility = !passwordVisibility
                                    }) {
                                        Icon(
                                            imageVector = if(passwordVisibility) {
                                                Icons.Default.Visibility
                                            }else{
                                                Icons.Default.VisibilityOff
                                            },
                                            contentDescription = "Icono del password"
                                        )
                                    }
                                },
                                visualTransformation = if(passwordVisibility) {
                                    VisualTransformation.None
                                }else{
                                    PasswordVisualTransformation()
                                }
                            )
                            Text(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Forgot Passworddd",
                                style = MaterialTheme.typography.body1,
                                textAlign = TextAlign.End
                            )
                        }

                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {

                            RoundedButtom(
                                text = "Loginnn",
                                displayProgressBar = state.displayProgressBar,
                                onClick = {
                                    val datos = listOf(
                                        LoginState(
                                            emailValue.value, passwordValue.value,
                                            false, false, null
                                        )
                                    )
                                    onLogin(emailValue.value, passwordValue.value)
                                })
                            ClickableText(
                                text = buildAnnotatedString {
                                    append("No tienes una cuenta activa")
                                    withStyle(
                                        style = SpanStyle(
                                            color = MaterialTheme.colors.primary,
                                            fontWeight = FontWeight.Bold,
                                        ),
                                    ){
                                        append("Sign Up")
                                    }
                                },

                                ){
                                onNavigateToRegister()
                            }

                        }


                    }

                }

                FloatingActionButton(
                    modifier = Modifier
                        .size(72.dp)
                        .constrainAs(fab) {
                            top.linkTo(surface.top, margin = (-36).dp)
                            end.linkTo(surface.end, margin = 36.dp)
                        },
                    backgroundColor = MaterialTheme.colors.primary,
                    onClick = {
                        onLogin(emailValue.value, passwordValue.value)
                    }
                ) {
                    Icon(
                        modifier = Modifier.size(72.dp),
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "Boton de avanzar",
                        tint = Color.White
                    )
                }

            }


        }
        if (state.errorMessages != null){
            EvenDialog(
                onDismiss = onDissmissDialog,
                errorMessages = state.errorMessages
            )
        }
    }

}