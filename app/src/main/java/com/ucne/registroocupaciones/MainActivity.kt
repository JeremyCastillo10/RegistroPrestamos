package com.ucne.registroocupaciones

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.speech.tts.TextToSpeech
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.app.ActivityCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ucne.registroocupaciones.ui.OcupacionList.OcupacionListScreen
import com.ucne.registroocupaciones.ui.Persona.PersonaScreen
import com.ucne.registroocupaciones.ui.PersonaList.PersonaListScreen
import com.ucne.registroocupaciones.ui.Prestamo.PrestamosScreen
import com.ucne.registroocupaciones.ui.PrestamoList.PrestamoListScreen
import com.ucne.registroocupaciones.ui.ocupacion.OcupacionScreen
import com.ucne.registroocupaciones.ui.theme.RegistroOcupacionesTheme
import com.ucne.registroocupaciones.util.Screen
import dagger.hilt.android.AndroidEntryPoint
import java.util.*

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RegistroOcupacionesTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = Screen.HomeScreen.route
                    ) {
                        composable(Screen.HomeScreen.route) {
                            MainScreen(
                                onClick = { navController.navigate(Screen.OcupacionScreen.route) },
                                onClick1 = { navController.navigate(Screen.OcupacionListScreen.route) },
                                onClick2 = { navController.navigate(Screen.PersonaScreen.route) },
                                onClick3 = { navController.navigate(Screen.PersonaListScreen.route) },
                                onClick4 = { navController.navigate(Screen.PrestamoScreen.route) },
                                onClick5 = { navController.navigate(Screen.PrestamoListScreen.route) }
                            )
                        }
                        composable(Screen.OcupacionScreen.route) {
                            OcupacionScreen({ navController.navigateUp() })
                        }
                        composable(Screen.OcupacionListScreen.route) {
                            OcupacionListScreen(
                                onClick = { navController.navigate(Screen.OcupacionScreen.route) }
                            )
                        }
                        composable(Screen.PrestamoScreen.route) {
                            PrestamosScreen({ navController.navigateUp() })
                        }
                        composable(Screen.PersonaListScreen.route) {
                            PersonaListScreen(
                                onClick = { navController.navigate(Screen.PersonaScreen.route) }
                            )
                        }
                        composable(Screen.PersonaScreen.route) {
                            PersonaScreen({ navController.navigateUp() })
                        }
                        composable(Screen.PrestamoListScreen.route) {
                            PrestamoListScreen(
                                onClick = { navController.navigate(Screen.PrestamoScreen.route) }
                            )
                        }
                    }

                }
            }
        }
    }


}




















