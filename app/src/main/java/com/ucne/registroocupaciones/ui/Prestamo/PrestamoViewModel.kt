package com.ucne.registroocupaciones.ui.Prestamo

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import  androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ucne.registroocupaciones.data.Prestamo
import com.ucne.registroocupaciones.repository.PrestamoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PrestamoViewModel @Inject constructor(
    val repository: PrestamoRepository
): ViewModel() {
    var prestamoid by mutableStateOf("")
    var fecha by mutableStateOf("")
    var vence by mutableStateOf("")
    var personaid by mutableStateOf("")
    var concepto by mutableStateOf("")
    var monto by mutableStateOf("")
    var balance by mutableStateOf("")

    fun Save(){
        viewModelScope.launch {
            repository.InsertPrestamo(
                Prestamo(
                    prestamoid =prestamoid.toInt(),
                    fecha = fecha,
                    vence = vence,
                    personaid = personaid,
                    concepto = concepto,
                    monto = monto.toDouble(),
                    balance = balance.toDouble()

                )
            )
        }
    }
    fun Update(){
        viewModelScope.launch {
            repository.UpdatePrestamo(
                Prestamo(
                    fecha = fecha,
                    vence = vence,
                    personaid = personaid,
                    concepto = concepto,
                    monto = monto.toDouble(),
                    balance = balance.toDouble()

                )
            )
        }
    }

    fun Delete(){
        viewModelScope.launch {
            repository.DeletePrestamo(
                Prestamo(
                    fecha = fecha,
                    vence = vence,
                    personaid = personaid,
                    concepto = concepto,
                    monto = monto.toDouble(),
                    balance = balance.toDouble()

                )
            )
        }
    }

}