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
                        startDestination = Screen.PersonaListScreen.route
                    ) {
                        composable(Screen.PersonaListScreen.route) {
                            PersonaListScreen(

                                onClick = { navController.navigate(Screen.PersonaScreen.route) }
                            )
                        }
                        composable(Screen.PersonaScreen.route) {
                            PersonaScreen({ navController.navigateUp() })
                        }
                    }

                }
            }
        }
    }


}




















