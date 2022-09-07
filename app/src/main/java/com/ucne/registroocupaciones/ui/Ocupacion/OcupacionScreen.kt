package com.ucne.registroocupaciones.ui.ocupacion

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = { Text("Ocupation Entry") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                viewModel.Save()
                onNavigateBack()
            }) {
                Icon(imageVector = Icons.Default.Create, contentDescription = "Add a Student")
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
                onValueChange = { viewModel.descripcion = it })

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Salario") },
                value = viewModel.salario,
                onValueChange = {viewModel.salario = it})


        }
    }

}

@Composable
@Preview(showSystemUi = true)
fun Preview() {

    OcupacionScreen({ })

}