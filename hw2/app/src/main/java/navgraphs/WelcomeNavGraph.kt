package navgraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.hw2.ui.theme.Screen
import com.example.hw2.ui.theme.USER
import com.example.hw2.ui.theme.WELCOME
import screens.HomeScreen
import screens.PaymentsScreen
import screens.PlansScreen
import screens.SettingsScreen

fun NavGraphBuilder.welcomeNavGraph(navController: NavHostController) {
    navigation(
        startDestination = Screen.Home.route,
        route = WELCOME
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController)
        }

        composable(
            route = Screen.Settings.route
        ) {
            SettingsScreen(navController)
        }
    }
}