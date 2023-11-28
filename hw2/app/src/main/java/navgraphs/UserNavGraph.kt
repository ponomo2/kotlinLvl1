package navgraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.hw2.ui.theme.Screen
import com.example.hw2.ui.theme.USER
import screens.PaymentsScreen
import screens.PlansScreen

fun NavGraphBuilder.userNavGraph(navController: NavHostController) {
    navigation(
        startDestination = Screen.Payments.route,
        route = USER
    ) {
        composable(
            route = Screen.Payments.route
        ) {
            PaymentsScreen(navController)
        }

        composable(
            route = Screen.Plans.route
        ) {
            PlansScreen(navController = navController)
        }
    }
}