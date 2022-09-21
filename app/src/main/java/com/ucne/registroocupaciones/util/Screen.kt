package com.ucne.registroocupaciones.util

sealed class Screen(val route: String){
    object OcupacionListScreen: Screen("OcupacionLista")
    object OcupacionScreen: Screen("Ocupation")
    object PersonaListScreen: Screen("PersonaLista")
    object PersonaScreen: Screen("Persona")
    object PrestamoScreen: Screen("Prestamo")
    object PrestamoListScreen: Screen("PrestamoLista")
    object  HomeScreen: Screen("MainScreen")
}