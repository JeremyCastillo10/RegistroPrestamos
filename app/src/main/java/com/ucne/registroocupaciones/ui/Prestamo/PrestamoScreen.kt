package com.ucne.registroocupaciones.ui.Prestamo

import android.app.DatePickerDialog
import android.widget.DatePicker
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.ContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ucne.registroocupaciones.data.Persona
import com.ucne.registroocupaciones.data.Prestamo
import com.ucne.registroocupaciones.model.Ocupation
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun PrestamosScreen(

    onNavigateBack: () -> Unit,
    viewModel: PrestamoViewModel = hiltViewModel()
)
{
   Column() {
       var nameError by remember { mutableStateOf(false) }

       val assistiveElementText = if (nameError) "Error: Obligatorio" else "*Obligatorio" // 4
       val assistiveElementColor = if (nameError) { // 5
           MaterialTheme.colors.error
       } else {
           MaterialTheme.colors.onSurface.copy(alpha = ContentAlpha.medium)
       }
       var personaselected by remember { mutableStateOf("") }
       var expanded by remember { mutableStateOf(false) }

       val personas = listOf(
           Persona(nombres = "Jeremy Castillo"),
           Persona(nombres = "Daniel Mena"),
           Persona(nombres = "Pedro Burgos"),
           Persona(nombres = "Jonathan Toribio"),
       )
       val mContext = LocalContext.current

       // Declaring integer values
       // for year, month and day
       val mYear: Int
       val mMonth: Int
       val mDay: Int

       // Initializing a Calendar
       val mCalendar = Calendar.getInstance()

       // Fetching current year, month and day
       mYear = mCalendar.get(Calendar.YEAR)
       mMonth = mCalendar.get(Calendar.MONTH)
       mDay = mCalendar.get(Calendar.DAY_OF_MONTH)

       mCalendar.time = Date()

       // Declaring a string value to
       // store date in string format
       val mDate = remember { mutableStateOf("") }

       // Declaring DatePickerDialog and setting
       // initial values as current values (present year, month and day)
       val mDatePickerDialog = DatePickerDialog(
           mContext,
           { _: DatePicker, mYear: Int, mMonth: Int, mDayOfMonth: Int ->
               viewModel.fecha = "$mDayOfMonth/${mMonth+1}/$mYear"

           }, mYear, mMonth, mDay
       )
       val mDatePickerDialog1 = DatePickerDialog(
           mContext,
           { _: DatePicker, mYear: Int, mMonth: Int, mDayOfMonth: Int ->
               viewModel.vence ="$mDayOfMonth/${mMonth+1}/$mYear"
           }, mYear, mMonth, mDay
       )
       CenterAlignedTopAppBar(title = { Text(text = "Registro de Prestamos") })

       Column(
           modifier = Modifier
               .fillMaxSize()
               .padding()
               .padding(8.dp)
       ) {
           Row() {
               OutlinedTextField(
                   modifier = Modifier.width(320.dp),
                   label = { Text(text = "Prestamo ID") },
                   value = viewModel.prestamoid,
                   onValueChange = { viewModel.prestamoid = it },


               )
               Icon(
                   Icons.Filled.Search,
                   contentDescription = "Fecha",
                   modifier = Modifier.fillMaxWidth()
                       .height(50.dp)


                       .clickable {

                       }

               )

           }
           OutlinedTextField(
               modifier = Modifier.fillMaxWidth(),
               label = { Text(text = "Fecha") },
               value = viewModel.fecha,
               onValueChange = { viewModel.fecha = it },
               readOnly = true

               )
           if(viewModel.fecha.length <= 0)
           {
               Text(// 6
                   text = assistiveElementText,
                   color = assistiveElementColor,
                   style = MaterialTheme.typography.caption,
                   modifier = Modifier.padding(start = 16.dp)
               )
           }
           Icon(
               Icons.Filled.DateRange,
               contentDescription = "Fecha",
               modifier = Modifier
                   .clickable {
                       mDatePickerDialog.show()
                   }

           )

           OutlinedTextField(
               modifier = Modifier.fillMaxWidth(),
               label = { Text(text = "Vence") },
               value = viewModel.vence,
               onValueChange = { viewModel.vence = it },
               readOnly = true
           )
           if(viewModel.vence.length <= 0)
           {
               Text(// 6
                   text = assistiveElementText,
                   color = assistiveElementColor,
                   style = MaterialTheme.typography.caption,
                   modifier = Modifier.padding(start = 16.dp),


               )
           }
           Icon(
               Icons.Filled.DateRange,
               contentDescription = "vence",
               modifier = Modifier
                   .clickable {
                       mDatePickerDialog1.show()
                   }

           )

           OutlinedTextField(
               modifier = Modifier.fillMaxWidth(),
               label = { Text(text = "Concepto") },
               value = viewModel.concepto,
               onValueChange = { viewModel.concepto = it },
           )
           if(viewModel.concepto.length <= 0)
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
               label = { Text(text = "Monto") },
               value = viewModel.monto,
               onValueChange = { viewModel.monto = it },
           )
           if(viewModel.monto.length <= 0)
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
               label = { Text(text = "Balance") },
               value = viewModel.balance,
               onValueChange = { viewModel.balance = it },
           )
           if(viewModel.balance.length <= 0)
           {
               Text(// 6
                   text = assistiveElementText,
                   color = assistiveElementColor,
                   style = MaterialTheme.typography.caption,
                   modifier = Modifier.padding(start = 16.dp)
               )
           }
           OutlinedTextField(
               label = { Text(text = "Persona") },
               value = personaselected,
               onValueChange = { personaselected = it },
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
               personas.forEach { personas ->
                   androidx.compose.material.DropdownMenuItem(onClick = {
                       personas.nombres
                       expanded = false
                       personaselected = personas.nombres
                       viewModel.personaid = personaselected

                   }) {
                       Text(text = personas.nombres)
                   }

               }
           }
           if(viewModel.personaid.length <= 0)
           {
               Text(// 6
                   text = assistiveElementText,
                   color = assistiveElementColor,
                   style = MaterialTheme.typography.caption,
                   modifier = Modifier.padding(start = 16.dp)
               )
           }


           Row(

               modifier = Modifier
                   .align(Alignment.CenterHorizontally)
                   .padding(10.dp)


           )
           {
               Button(
                   onClick = {
                       if(viewModel.fecha.length <= 0 || viewModel.vence.length <= 0 || viewModel.concepto.length <= 0
                           || viewModel.balance.length <= 0 || viewModel.monto.length <= 0 || viewModel.personaid.length <= 0)
                       {
                           nameError = viewModel.fecha.isBlank()
                           nameError = viewModel.vence.isBlank()
                           nameError = viewModel.concepto.isBlank()
                           nameError = viewModel.balance.isBlank()
                           nameError = viewModel.monto.isBlank()
                           nameError = viewModel.personaid.isBlank()
                       }// 7
                       else{
                           viewModel.Save()
                           onNavigateBack()
                       }
                   },
                   Modifier
                       .size(90.dp)
                       .padding(10.dp)

               ) {
                   Icon(
                       Icons.Filled.Add,
                       contentDescription = "Guardar",


                       )

               }

               Button(
                   onClick = {
                       viewModel.fecha = ""
                       viewModel.vence = ""
                       viewModel.concepto=""
                       viewModel.balance = ""
                       viewModel.monto = ""
                       viewModel.personaid= ""
                   },
                   Modifier
                       .size(90.dp)
                       .padding(8.dp)
               ) {
                   Icon(
                       Icons.Filled.Clear,
                       contentDescription = "Nuevo",
                       )
               }
               Button(
                   onClick = {
                       viewModel.Delete()
                   },
                   Modifier
                       .size(90.dp)
                       .padding(8.dp)
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
