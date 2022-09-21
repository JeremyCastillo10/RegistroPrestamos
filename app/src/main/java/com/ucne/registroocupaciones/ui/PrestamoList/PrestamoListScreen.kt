package com.ucne.registroocupaciones.ui.PrestamoList

import androidx.compose.foundation.background
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
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ucne.registroocupaciones.data.Persona
import com.ucne.registroocupaciones.data.Prestamo
import com.ucne.registroocupaciones.ui.PersonaList.PersonaListViewModel
import com.ucne.registroocupaciones.ui.PersonaList.PersonaLista

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PrestamoListScreen(
    onClick: () -> Unit,viewModel: PrestamoListViewModel = hiltViewModel()
)
{
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = { Text("Prestamo Lista") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = onClick) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add a Prestamo")
            }
        }
    ) {

        val uiState by viewModel.uiState.collectAsState()

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(it)) {

            PrestamoLista(
                prestamo = uiState.prestamo,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            )
        }

    }

}
@Composable
fun PrestamoLista(
    prestamo: List<Prestamo>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(prestamo) { prestamo ->
            PrestamoRow(prestamo)
        }
    }
}

@Composable
fun PrestamoRow(prestamo: Prestamo) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(4.dp)
    ) {
        Text(
            text = "ID: ${ prestamo.prestamoid }",
            style = MaterialTheme.typography.titleLarge,
            color = Color.White
        )
        Text(
            text = "Fecha: ${ prestamo.fecha }",
            style = MaterialTheme.typography.titleLarge,
            color = Color.White
        )
        Text(
            text = "Concepto: ${ prestamo.concepto }",
            style = MaterialTheme.typography.titleLarge,
            color = Color.White

        )
        Text(
            text = "Vence: ${ prestamo.vence }",
            style = MaterialTheme.typography.titleLarge,
            color = Color.White
        )
        Text(
            text = "Monto: ${ prestamo.monto }",
            style = MaterialTheme.typography.titleLarge,
            color = Color.White
        )
        Text(
            text = "Balance: ${ prestamo.balance }",
            style = MaterialTheme.typography.titleLarge,
            color = Color.White
        )
        Text(
            text = "Persona: ${ prestamo.personaid }",
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
