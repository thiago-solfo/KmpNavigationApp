package org.example.project

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.*

@Composable
fun HomeScreen(navController: NavHostController) {
    Button(onClick = { navController.navigate("details") }) {
        Text("Ir para detalhes")
    }
}

@Composable
fun DetailsScreen(navController: NavHostController) {
    Column {
        Text("Tela de detalhes")
        Button(onClick = { navController.popBackStack() }) {
            Text("Voltar")
        }
    }
}

@Composable
fun App() {
    MaterialTheme {

        val navController = rememberNavController()

        NavHost(
            navController = navController,
            startDestination = "home"
        ) {

            composable("home") {
                HomeScreen(navController)
            }

            composable("details") {
                DetailsScreen(navController)
            }

        }
    }
}