package com.karthik.navigationcompose.navigation


sealed class ScreenRoute(val route: String) {
    data object First : ScreenRoute("first_route")
    data object Second : ScreenRoute("second_route")
    data object Third : ScreenRoute("third_route")
}

