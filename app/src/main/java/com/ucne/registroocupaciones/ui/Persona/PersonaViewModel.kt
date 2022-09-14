package com.ucne.registroocupaciones.ui.Persona

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ucne.registroocupaciones.model.Ocupation
import com.ucne.registroocupaciones.model.Persona
import com.ucne.registroocupaciones.repository.OcupacionRepository
import com.ucne.registroocupaciones.repository.PersonaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class PersonaViewModel @Inject constructor(
    val repository: PersonaRepository
) : ViewModel() {

    var nombres by mutableStateOf("")
    var telefono by mutableStateOf("")
    var celular by mutableStateOf("")
    var direccion by mutableStateOf("")
    var email by mutableStateOf("")
    var fechanacimiento by mutableStateOf("")
    var ocupacionid by mutableStateOf("")



    fun Save(){
        viewModelScope.launch {
            repository.insertPersonas(
                Persona(
                    nombres = nombres,
                    telefono = telefono,
                    celular = celular,
                    direccion = direccion,
                    email = email,
                    fechanacimiento = fechanacimiento,
                    ocupacionid = ocupacionid,

                    )
            )
        }
    }
}