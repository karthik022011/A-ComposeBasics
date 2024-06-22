package com.karthik.navigationcompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController


@Composable
fun MyNavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    MyNavHost(
        navController = navController,
        modifier = modifier
    )
}