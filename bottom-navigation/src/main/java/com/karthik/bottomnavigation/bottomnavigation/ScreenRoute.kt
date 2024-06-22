package com.karthik.bottomnavigation.bottomnavigation


sealed class ScreenRoute(val route: String) {
    data object Home : ScreenRoute("home_route")
    data object Search : ScreenRoute("search_route")
    data object Profile : ScreenRoute("profile_route")
}

