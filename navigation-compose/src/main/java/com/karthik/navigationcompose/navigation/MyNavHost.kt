package com.karthik.navigationcompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.karthik.navigationcompose.screens.firstscreen.FirstScreen
import com.karthik.navigationcompose.screens.secondscreen.SecondScreen
import com.karthik.navigationcompose.screens.thirdscreen.ThirdScreen


@Composable
fun MyNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = ScreenRoute.First.route,
        modifier = modifier
    ) {
        composable(route = ScreenRoute.First.route) {
            FirstScreen(
                onClickButton = {
                  navController.navigate(ScreenRoute.Second.route)
                }
            )
        }
        composable(route = ScreenRoute.Second.route) {
            SecondScreen(
                onClickButton = {
                    navController.navigate(ScreenRoute.Third.route)
                }
            )
        }
        composable(route = ScreenRoute.Third.route) {
            ThirdScreen(
                onClickButton = {
                    //false tells that it will remove all expect first screen
                    navController.popBackStack(ScreenRoute.First.route, false)
                }
            )
        }
    }
    }