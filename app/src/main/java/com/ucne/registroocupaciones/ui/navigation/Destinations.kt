package com.ucne.registroocupaciones.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.ui.graphics.vector.ImageVector
import com.ucne.registroocupaciones.R

sealed class NavigationItem(var route:String, var icon: ImageVector, var title:String){
    object Home: NavigationItem("home", Icons.Filled.Home,"Home")
    object OcupacionListScreen: NavigationItem("OcupacionLista",Icons.Filled.List,"Lista Ocupaciones")
    object OcupacionScreen: NavigationItem("Ocupation",Icons.Filled.Add, "Registro Ocupacion")
    object PersonaListScreen: NavigationItem("PersonaLista",Icons.Filled.List, "Lista de Persona")
    object PersonaScreen: NavigationItem("Persona",Icons.Filled.Add, "Registro de Personas")
    object PrestamoScreen: NavigationItem("Prestamo",Icons.Filled.Add,"Registro de Prestamos")
    object PrestamoListScreen: NavigationItem("PrestamoLista",Icons.Filled.List,"Lista de Prestamos")
}
