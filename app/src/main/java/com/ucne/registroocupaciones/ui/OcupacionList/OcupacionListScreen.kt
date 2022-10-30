package com.ucne.registroocupaciones.ui.OcupacionList

import android.content.Context
import android.content.Intent
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.hilt.navigation.compose.hiltViewModel
import com.ucne.registroocupaciones.model.Ocupation
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OcupacionListScreen(
    onClick: () -> Unit,
    viewModel: OcupacionListViewModel = hiltViewModel()
) {

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = { Text("Ocupaciones Lista") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = onClick) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add a Ocupation")
            }
        }
    ) {

        val uiState by viewModel.uiState.collectAsState()

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(it)) {

            OcupacionLista(
                ocupation = uiState.ocupacion,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            )

        }

    }

}



@Composable
fun OcupacionLista(
    ocupation: List<Ocupation>,
    modifier: Modifier = Modifier,
    viewModel: OcupacionListViewModel = hiltViewModel()
) {
    LazyColumn(modifier = modifier) {
        items(ocupation) { ocupation ->
            OcupacionRow(ocupation,viewModel)
        }
    }
}

@Composable
fun OcupacionRow(ocupation: Ocupation, viewModel: OcupacionListViewModel) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = androidx.compose.material.MaterialTheme.colors.primary)
            .padding(4.dp)
    ) {
        androidx.compose.material.Icon(
            Icons.Filled.Delete,
            contentDescription = "Fecha",
            modifier = Modifier
                .align(Alignment.End)
                .clickable {
                    viewModel.Delete(ocupation)
                }

        )
        Text(
            text = ocupation.descripcion,
            style = MaterialTheme.typography.titleLarge
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = "salario: ${ocupation.salario}"
            )

        }
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 4.dp),
            color = Color.LightGray
        )
    }
}
