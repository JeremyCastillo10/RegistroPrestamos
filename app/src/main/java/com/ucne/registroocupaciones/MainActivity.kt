package com.ucne.registroocupaciones

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.speech.tts.TextToSpeech
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.app.ActivityCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.ucne.registroocupaciones.ui.OcupacionList.OcupacionListScreen
import com.ucne.registroocupaciones.ui.Persona.PersonaScreen
import com.ucne.registroocupaciones.ui.PersonaList.PersonaListScreen
import com.ucne.registroocupaciones.ui.Prestamo.PrestamosScreen
import com.ucne.registroocupaciones.ui.PrestamoList.PrestamoListScreen
import com.ucne.registroocupaciones.ui.components.Drawer
import com.ucne.registroocupaciones.ui.navigation.NavigationHost
import com.ucne.registroocupaciones.ui.navigation.NavigationItem
import com.ucne.registroocupaciones.ui.ocupacion.OcupacionScreen
import com.ucne.registroocupaciones.ui.presentation.components.TopBar
import com.ucne.registroocupaciones.ui.theme.RegistroOcupacionesTheme
import com.ucne.registroocupaciones.util.Screen
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import java.util.*

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val systemUiController = rememberSystemUiController()
            val darkMode = remember { mutableStateOf(false) }

            SideEffect {
                systemUiController.setStatusBarColor(
                    color = Color.Blue
                )
            }

            RegistroOcupacionesTheme(
                darkTheme = darkMode.value
            ){
                MainScreen(darkMode)
            }
        }
    }


}
@Composable
fun MainScreen(
    darkMode: MutableState<Boolean>
) {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState(
        drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    )
    val scope = rememberCoroutineScope()
    val openDialog = remember { mutableStateOf(false) }

    val navigationItems = listOf(
        NavigationItem.Home,
        NavigationItem.OcupacionListScreen,
        NavigationItem.OcupacionScreen,
        NavigationItem.PersonaListScreen,
        NavigationItem.PersonaScreen,
        NavigationItem.PrestamoListScreen,
        NavigationItem.PrestamoScreen
    )

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopBar(
                scope,
                scaffoldState,
                openDialog = { openDialog.value = true  },
                displaySnackBar = {
                    scope.launch {
                        val resultado = scaffoldState.snackbarHostState.showSnackbar(
                            message = "Nuevo SnackBar!",
                            duration = SnackbarDuration.Short,
                            actionLabel = "Aceptar"
                        )

                        when(resultado){
                            SnackbarResult.ActionPerformed -> {
                                Log.d("MainActivity", "Snackbar Accionado")
                            }
                            SnackbarResult.Dismissed -> {
                                Log.d("MainActivity", "Snackbar Ignorado")
                            }
                        }
                    }
                }
            )
        },
        drawerContent = { Drawer(scope, scaffoldState, navController, items = navigationItems) },
        drawerGesturesEnabled = true
    ){
        NavigationHost(navController,darkMode)
    }

}




















