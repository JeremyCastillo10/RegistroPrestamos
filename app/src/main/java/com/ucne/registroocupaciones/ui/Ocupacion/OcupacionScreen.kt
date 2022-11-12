package com.ucne.registroocupaciones.ui.ocupacion

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.ContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ucne.registroocupaciones.ui.ocupation.OcupationViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OcupacionScreen(
    onNavigateBack: () -> Unit,
    viewModel: OcupationViewModel = hiltViewModel()
) {
    var nameError by remember { mutableStateOf(false) }

    val assistiveElementText = if (nameError) "Error: Obligatorio" else "*Obligatorio" // 4
    val assistiveElementColor = if (nameError) { // 5
        MaterialTheme.colors.error
    } else {
        MaterialTheme.colors.onSurface.copy(alpha = ContentAlpha.medium)
    }
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = { Text("Ocupation Entry") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                if(viewModel.descripcion.length <= 0 || viewModel.salario.length <= 0)
                {
                    nameError = viewModel.descripcion.isBlank()
                    nameError = viewModel.salario.isBlank()
                }// 7
                else{
                    viewModel.Save()
                    onNavigateBack()
                }
            }) {
                Icon(imageVector = Icons.Default.Create, contentDescription = "Add a Ocupation")
            }
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(8.dp)
        ) {

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Descripcion") },
                value = viewModel.descripcion,
                onValueChange = { viewModel.descripcion = it },)
            if(viewModel.descripcion.length <= 0)
            {
                Text(// 6
                    text = assistiveElementText,
                    color = assistiveElementColor,
                    style = MaterialTheme.typography.caption,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Salario") },
                value = viewModel.salario,
                onValueChange = {viewModel.salario = it},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),)
            if(viewModel.salario.length <= 0)
            {
                Text(// 6
                    text = assistiveElementText,
                    color = assistiveElementColor,
                    style = MaterialTheme.typography.caption,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }


        }
    }

}

@Composable
@Preview(showSystemUi = true)
fun Preview() {

    OcupacionScreen({ })

}