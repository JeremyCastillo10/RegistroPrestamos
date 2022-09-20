package com.ucne.registroocupaciones.ui.ocupation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ucne.registroocupaciones.model.Ocupation
import com.ucne.registroocupaciones.repository.OcupacionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class OcupationViewModel @Inject constructor(
    val repository: OcupacionRepository
) : ViewModel() {

    var descripcion by mutableStateOf("")
     var salario by mutableStateOf("")


    fun Save(){
        viewModelScope.launch {
            repository.insertOcupacion(
                Ocupation(
                    descripcion = descripcion,
                    salario = salario.toDouble(),

                )
            )
        }
    }
}