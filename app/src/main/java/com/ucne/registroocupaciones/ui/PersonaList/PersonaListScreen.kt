package com.ucne.registroocupaciones.ui.PersonaList

import com.ucne.registroocupaciones.ui.PersonaList.PersonaListViewModel


import android.content.Context
import android.content.Intent
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.hilt.navigation.compose.hiltViewModel
import com.ucne.registroocupaciones.model.Ocupation
import com.ucne.registroocupaciones.model.Persona
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PersonaListScreen(
    onClick: () -> Unit,
    viewModel: PersonaListViewModel = hiltViewModel()
) {

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = { Text("Personas Lista") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = onClick) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add a Persona")
            }
        }
    ) {

        val uiState by viewModel.uiState.collectAsState()

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(it)) {

            PersonaLista(
                persona = uiState.persona,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            )
        }

    }

}



@Composable
fun PersonaLista(
    persona: List<Persona>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(persona) { persona ->
            PersonaRow(persona)
        }
    }
}

@Composable
fun PersonaRow(persona: Persona) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(4.dp)
    ) {
        Text(
            text = "Nombre: ${ persona.nombres }",
            style = MaterialTheme.typography.titleLarge,
            color = Color.White
        )
        Text(
            text = "Telefono: ${ persona.telefono }",
            style = MaterialTheme.typography.titleLarge,
            color = Color.White

        )
        Text(
            text = "Celular: ${ persona.celular }",
            style = MaterialTheme.typography.titleLarge,
            color = Color.White
        )
        Text(
            text = "Email: ${ persona.email }",
            style = MaterialTheme.typography.titleLarge,
            color = Color.White
        )
        Text(
            text = "Direcion: ${ persona.direccion }",
            style = MaterialTheme.typography.titleLarge,
            color = Color.White
        )
        Text(
            text = "Ocupacion: ${ persona.ocupacionid }",
            style = MaterialTheme.typography.titleLarge,
            color = Color.White
        )


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {


        }
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 4.dp),
            color = Color.LightGray
        )
    }
}

@Composable
@Preview(showSystemUi = true)
fun Preview() {
    val lista = listOf(
        Persona(
            nombres = "juan",
            telefono = "8095772529",
            celular = "8097429211",
            direccion = "sfm",
            email = "jey@gamil.com",
            fechanacimiento = "17-03-2002",
            ocupacionid = "Pintor",
        ),
        Persona(
            nombres = "juan",
            telefono = "8095772529",
            celular = "8097429211",
            direccion = "sfm",
            email = "jey@gamil.com",
            fechanacimiento = "17-03-2002",
            ocupacionid = "Pintor",
        ),

        )

    PersonaLista(persona = lista)

}