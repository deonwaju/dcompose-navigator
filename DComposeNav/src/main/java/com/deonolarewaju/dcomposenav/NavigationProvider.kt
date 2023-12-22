package com.deonolarewaju.dcomposenav

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun NavigationProvider(content: @Composable (navController: NavController) -> Unit) {
    val navController = rememberNavController()
    content(navController)
}

/**
 * Navigate to the specified route with optional data.
 *
 * @param navController The NavController to perform the navigation.
 * @param key The key for saving data to the destination's savedStateHandle.
 * @param route The destination route to navigate to.
 * @param data Optional data to pass to the destination.
 */
fun navigateTo(navController: NavController, key: String, route: String, data: Any? = null) {
    try {
        // Set data to the savedStateHandle of the currentBackStackEntry
        navController.currentBackStackEntry?.savedStateHandle?.set(key, data)

        // Navigate to the specified route
        navController.navigate(route)
    } catch (e: Exception) {
        // Handle any exceptions that may occur during navigation
        // Log or propagate the exception as needed
        e.printStackTrace()
    }
}
//About
//Library for navigation without or with arguments carrying data