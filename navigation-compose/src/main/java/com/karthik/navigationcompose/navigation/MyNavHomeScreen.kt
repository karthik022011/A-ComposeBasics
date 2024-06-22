package com.karthik.navigationcompose.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController


@Composable
fun MyNavHomeScreen() {
    val navController = rememberNavController()
    Scaffold { innerPadding ->
        MyNavGraph(
            navController = navController,
            modifier = Modifier.padding(innerPadding)
        )
    }
}