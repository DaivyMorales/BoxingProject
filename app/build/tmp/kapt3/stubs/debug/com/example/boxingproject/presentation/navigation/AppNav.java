package com.example.boxingproject.presentation.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/example/boxingproject/presentation/navigation/AppNav;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "HomeScreen", "LoginScreen", "MenuScreen", "PagoScreen", "RegistrationScreen", "Lcom/example/boxingproject/presentation/navigation/AppNav$HomeScreen;", "Lcom/example/boxingproject/presentation/navigation/AppNav$LoginScreen;", "Lcom/example/boxingproject/presentation/navigation/AppNav$MenuScreen;", "Lcom/example/boxingproject/presentation/navigation/AppNav$PagoScreen;", "Lcom/example/boxingproject/presentation/navigation/AppNav$RegistrationScreen;", "app_debug"})
public abstract class AppNav {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    
    private AppNav(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/example/boxingproject/presentation/navigation/AppNav$LoginScreen;", "Lcom/example/boxingproject/presentation/navigation/AppNav;", "()V", "crearRouteNueva", "", "nameValue", "app_debug"})
    public static final class LoginScreen extends com.example.boxingproject.presentation.navigation.AppNav {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.boxingproject.presentation.navigation.AppNav.LoginScreen INSTANCE = null;
        
        private LoginScreen() {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String crearRouteNueva(@org.jetbrains.annotations.NotNull()
        java.lang.String nameValue) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/boxingproject/presentation/navigation/AppNav$RegistrationScreen;", "Lcom/example/boxingproject/presentation/navigation/AppNav;", "()V", "app_debug"})
    public static final class RegistrationScreen extends com.example.boxingproject.presentation.navigation.AppNav {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.boxingproject.presentation.navigation.AppNav.RegistrationScreen INSTANCE = null;
        
        private RegistrationScreen() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/boxingproject/presentation/navigation/AppNav$PagoScreen;", "Lcom/example/boxingproject/presentation/navigation/AppNav;", "()V", "app_debug"})
    public static final class PagoScreen extends com.example.boxingproject.presentation.navigation.AppNav {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.boxingproject.presentation.navigation.AppNav.PagoScreen INSTANCE = null;
        
        private PagoScreen() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/boxingproject/presentation/navigation/AppNav$MenuScreen;", "Lcom/example/boxingproject/presentation/navigation/AppNav;", "()V", "app_debug"})
    public static final class MenuScreen extends com.example.boxingproject.presentation.navigation.AppNav {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.boxingproject.presentation.navigation.AppNav.MenuScreen INSTANCE = null;
        
        private MenuScreen() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/example/boxingproject/presentation/navigation/AppNav$HomeScreen;", "Lcom/example/boxingproject/presentation/navigation/AppNav;", "()V", "createRoute", "", "user", "app_debug"})
    public static final class HomeScreen extends com.example.boxingproject.presentation.navigation.AppNav {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.boxingproject.presentation.navigation.AppNav.HomeScreen INSTANCE = null;
        
        private HomeScreen() {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String createRoute(@org.jetbrains.annotations.NotNull()
        java.lang.String user) {
            return null;
        }
    }
}