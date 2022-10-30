package com.ucne.registroocupaciones.ui.PrestamoList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ucne.registroocupaciones.data.Persona
import com.ucne.registroocupaciones.data.Prestamo
import com.ucne.registroocupaciones.model.Ocupation
import com.ucne.registroocupaciones.repository.PersonaRepository
import com.ucne.registroocupaciones.repository.PrestamoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class PrestamoListUiState(
    val prestamo: List<Prestamo> = emptyList(),
    val texto: String = "Meeting"
)

@HiltViewModel
class PrestamoListViewModel @Inject constructor(
    val repository: PrestamoRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(PrestamoListUiState())
    val uiState: StateFlow<PrestamoListUiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            repository.getAll().collect { list ->
                _uiState.update {
                    it.copy( prestamo = list )
                }
            }
        }
    }
    fun Delete(prestamo: Prestamo) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.DeletePrestamo(prestamo)
        }
    }
}