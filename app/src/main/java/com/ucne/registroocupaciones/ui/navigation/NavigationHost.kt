package com.ucne.registroocupaciones.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ucne.registroocupaciones.HomeScreenView
import com.ucne.registroocupaciones.ui.OcupacionList.OcupacionListScreen
import com.ucne.registroocupaciones.ui.Persona.PersonaScreen
import com.ucne.registroocupaciones.ui.PersonaList.PersonaListScreen
import com.ucne.registroocupaciones.ui.Prestamo.PrestamosScreen
import com.ucne.registroocupaciones.ui.PrestamoList.PrestamoListScreen
import com.ucne.registroocupaciones.ui.ocupacion.OcupacionScreen

@Composable
fun NavigationHost(
    navController: NavHostController,
    darkMode: MutableState<Boolean>
) {
    NavHost(navController, startDestination = NavigationItem.Home.route) {
        composable(NavigationItem.Home.route) {
            HomeScreenView()
        }
        composable(NavigationItem.OcupacionScreen.route) {
            OcupacionScreen({ navController.navigateUp() })
        }
        composable(NavigationItem.OcupacionListScreen.route) {
            OcupacionListScreen(
                onClick = { navController.navigate(NavigationItem.OcupacionScreen.route) }
            )
        }
        composable(NavigationItem.PrestamoScreen.route) {
            PrestamosScreen({ navController.navigateUp() })
        }
        composable(NavigationItem.PersonaListScreen.route) {
            PersonaListScreen(
                onClick = { navController.navigate(NavigationItem.PersonaScreen.route) }
            )
        }
        composable(NavigationItem.PersonaScreen.route) {
            PersonaScreen({ navController.navigateUp() })
        }
        composable(NavigationItem.PrestamoListScreen.route) {
            PrestamoListScreen(
                onClick = { navController.navigate(NavigationItem.PrestamoScreen.route) }
            )
        }
    }
}