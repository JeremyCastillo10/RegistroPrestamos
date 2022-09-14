package com.ucne.registroocupaciones.ui.Persona

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.ContentAlpha
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ucne.registroocupaciones.model.Persona
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.ucne.registroocupaciones.model.Ocupation
import com.ucne.registroocupaciones.ui.ocupation.OcupationViewModel
import com.ucne.registroocupaciones.ui.Persona.PersonaViewModel


@OptIn(ExperimentalMaterial3Api::class)



@Composable
fun PersonaScreen(
    onNavigateBack: () -> Unit, viewModel: PersonaViewModel = hiltViewModel()
) {

    var nameError by remember { mutableStateOf(false) }

    val assistiveElementText = if (nameError) "Error: Obligatorio" else "*Obligatorio" // 4
    val assistiveElementColor = if (nameError) { // 5
        colors.error
    } else {
        colors.onSurface.copy(alpha = ContentAlpha.medium)
    }

    var ocupacionselected by remember { mutableStateOf("") }
    var expanded by remember { mutableStateOf(false) }
    val ocupaciones = listOf(
        Ocupation(id = 1, descripcion = "Ingeniero", salario = 60000.00),
        Ocupation(id = 1, descripcion = "Agricultor", salario = 60000.00),
        Ocupation(id = 1, descripcion = "Pintor", salario = 60000.00),
        Ocupation(id = 1, descripcion = "Maestro", salario = 60000.00),
    )
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = { Text("Registro de Personas") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {

            }, ) {
                Button(
                    onClick = {
                     if(viewModel.nombres.length <= 0 || viewModel.telefono.length <= 0 || viewModel.celular.length <= 0
                         || viewModel.direccion.length <= 0 || viewModel.email.length <= 0 || viewModel.fechanacimiento.length <= 0)
                     {
                         nameError = viewModel.nombres.isBlank()
                         nameError = viewModel.telefono.isBlank()
                         nameError = viewModel.direccion.isBlank()
                         nameError = viewModel.celular.isBlank()
                         nameError = viewModel.email.isBlank()
                         nameError = viewModel.fechanacimiento.isBlank()
                         nameError = viewModel.ocupacionid.isBlank()
                     }// 7
                        else{
                         viewModel.Save()
                         onNavigateBack()
                        }


                    },
                    // Uses ButtonDefaults.ContentPadding by default
                    contentPadding = PaddingValues(
                        start = 20.dp,
                        top = 12.dp,
                        end = 20.dp,
                        bottom = 30.dp
                    )
                ) {
                    // Inner content including an icon and a text label
                    Icon(
                        Icons.Filled.Done,
                        contentDescription = "Guardad",
                        modifier = Modifier.size(ButtonDefaults.IconSize),

                        )


                }
            }
        }
    )
    {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(8.dp)
        ) {

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Nombres") },
                value = viewModel.nombres,
                onValueChange = {viewModel.nombres = it})

                if(viewModel.nombres.length <= 0)
                {
                    Text(// 6
                        text = assistiveElementText,
                        color = assistiveElementColor,
                        style = typography.caption,
                        modifier = Modifier.padding(start = 16.dp)
                    )
                }


            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Telefono") },
                value = viewModel.telefono,
                onValueChange = {viewModel.telefono = it})
            if(viewModel.telefono.length <= 0)
            {
                Text(// 6
                    text = assistiveElementText,
                    color = assistiveElementColor,
                    style = typography.caption,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Celular") },
                value = viewModel.celular,
                onValueChange = {viewModel.celular = it})
            if(viewModel.celular.length <= 0)
            {
                Text(// 6
                    text = assistiveElementText,
                    color = assistiveElementColor,
                    style = typography.caption,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Email") },
                value = viewModel.email,
                onValueChange = {viewModel.email = it})
            if(viewModel.email.length <= 0)
            {
                Text(// 6
                    text = assistiveElementText,
                    color = assistiveElementColor,
                    style = typography.caption,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Direccion") },
                value = viewModel.direccion,
                onValueChange = {viewModel.direccion = it})
            if(viewModel.direccion.length <= 0)
            {
                Text(// 6
                    text = assistiveElementText,
                    color = assistiveElementColor,
                    style = typography.caption,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Fecha de Nacimiento") },
                value = viewModel.fechanacimiento,
                onValueChange = {viewModel.fechanacimiento = it})
            if(viewModel.fechanacimiento.length <= 0)
            {
                Text(// 6
                    text = assistiveElementText,
                    color = assistiveElementColor,
                    style = typography.caption,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }



            OutlinedTextField(
                label = { Text(text = "Ocupaciones") },
                value = ocupacionselected,
                onValueChange = { ocupacionselected = it },
                enabled = false, readOnly = true,
                modifier = Modifier
                    .clickable { expanded = true }
                    .fillMaxWidth()
            )
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier.fillMaxWidth()
            )
            {
                ocupaciones.forEach { ocupation ->
                    DropdownMenuItem(onClick = {
                        expanded = false
                        ocupacionselected = ocupation.descripcion
                        viewModel.ocupacionid = ocupacionselected

                    }) {
                        Text(text = ocupation.descripcion)
                    }

                }
            }
            if(viewModel.ocupacionid.length <= 0)
            {
                Text(// 6
                    text = assistiveElementText,
                    color = assistiveElementColor,
                    style = typography.caption,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }

        }

    }
}

@Composable
@Preview(showSystemUi = true)
fun Preview() {

    PersonaScreen({ })

}
