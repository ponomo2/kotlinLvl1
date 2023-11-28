package screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.hw2.ui.theme.Screen

@Composable
fun PaymentsScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(
            space = 12.dp,
            alignment = Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Payments Screen",
            fontSize = 20.sp
        )

        Button(
            onClick = {
                navController.navigate(route = Screen.Plans.route)
            }
        ) {
            Text(text = "Open Plans")
        }

        Button(
            onClick = {
                navController.popBackStack()
            }
        ) {
            Text(text = "Go Back")
        }
    }
}