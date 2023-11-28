package navgraphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.hw2.ui.theme.ROOT
import com.example.hw2.ui.theme.WELCOME


@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = WELCOME,
        route = ROOT
    ) {
        welcomeNavGraph(navController = navController)
        userNavGraph(navController = navController)
    }
}