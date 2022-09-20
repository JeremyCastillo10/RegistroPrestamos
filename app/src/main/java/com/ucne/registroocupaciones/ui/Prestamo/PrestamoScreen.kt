package com.ucne.registroocupaciones.ui.Prestamo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ucne.registroocupaciones.ui.Persona.PersonaScreen
import org.intellij.lang.annotations.JdkConstants

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun PrestamosScreen(

    onNavigateBack: () -> Unit,
    viewModel: PrestamoViewModel = hiltViewModel()
)
{
   Column() {
       CenterAlignedTopAppBar(title = { Text(text = "Registro de Prestamos") })

       Column(
           modifier = Modifier
               .fillMaxSize()
               .padding(40.dp)
               .padding()
       ) {
           OutlinedTextField(
               modifier = Modifier.fillMaxWidth(),
               label = { Text(text = "Telefono") },
               value = viewModel.fecha,
               onValueChange = { viewModel.fecha = it },
           )
           OutlinedTextField(
               modifier = Modifier.fillMaxWidth(),
               label = { Text(text = "Telefono") },
               value = viewModel.vence,
               onValueChange = { viewModel.vence = it },
           )
           OutlinedTextField(
               modifier = Modifier.fillMaxWidth(),
               label = { Text(text = "Telefono") },
               value = viewModel.personaid,
               onValueChange = { viewModel.personaid = it },
           )
           OutlinedTextField(
               modifier = Modifier.fillMaxWidth(),
               label = { Text(text = "Telefono") },
               value = viewModel.concepto,
               onValueChange = { viewModel.concepto = it },
           )
           OutlinedTextField(
               modifier = Modifier.fillMaxWidth(),
               label = { Text(text = "Telefono") },
               value = viewModel.monto,
               onValueChange = { viewModel.monto = it },
           )
           OutlinedTextField(
               modifier = Modifier.fillMaxWidth(),
               label = { Text(text = "Telefono") },
               value = viewModel.balance,
               onValueChange = { viewModel.balance = it },
           )

           Row(
               modifier = Modifier
                   .padding(20.dp)
                   .fillMaxSize(),
               horizontalArrangement = Arrangement.End,
           )
           {
               Button(
                   onClick = {
                       viewModel.Save()
                   }, Modifier.size(80.dp).padding(8.dp)
               ) {
                   Icon(
                       Icons.Filled.Add,
                       contentDescription = "Guardar",


                       )

               }

               Button(
                   onClick = {
                       viewModel.Update()
                   }, Modifier.size(80.dp).padding(8.dp)
               ) {
                   Icon(
                       Icons.Filled.Edit,
                       contentDescription = "Modificar",


                       )

               }

               Button(
                   onClick = {
                       viewModel.Delete()
                   }, Modifier.size(80.dp).padding(8.dp)
               ) {
                   Icon(
                       Icons.Filled.Delete,
                       contentDescription = "Eliminar",

                       )

               }
           }

       }


   }





}
@Composable
@Preview(showSystemUi = true)
fun Preview() {

    PrestamosScreen({})

}
