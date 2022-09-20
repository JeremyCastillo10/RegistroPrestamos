package com.ucne.registroocupaciones

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun MainScreen(onClick: () -> Unit,
               onClick1: () -> Unit,
               onClick2: () -> Unit,
               onClick3: () -> Unit,
               onClick4: () -> Unit,


               )
{
    Column() {
        Button(onClick = onClick) {
            Text(text = "RegistroOcupacion")

        }
        Button(onClick = onClick1) {
            Text(text = "Lista Ocupacion")

        }
        Button(onClick = onClick2) {
            Text(text = "RegistroPersona")

        }
        Button(onClick = onClick3) {
            Text(text = "Lista Persona")

        }
        Button(onClick = onClick4) {
            Text(text = "RegistroPrestamo")

        }

    }

}
