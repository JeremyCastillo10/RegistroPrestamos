package com.ucne.registroocupaciones.ui.PersonaList


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ucne.registroocupaciones.data.Persona
import com.ucne.registroocupaciones.model.Ocupation
import com.ucne.registroocupaciones.repository.PersonaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class PersonaListUiState(
    val persona: List<Persona> = emptyList(),
    val texto: String = "Meeting"
)

@HiltViewModel
class PersonaListViewModel @Inject constructor(
    val repository: PersonaRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(PersonaListUiState())
    val uiState: StateFlow<PersonaListUiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            repository.getAll().collect { list ->
                _uiState.update {
                    it.copy( persona = list )
                }
            }
        }
    }
    fun Delete(persona: Persona) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deletePersonas(persona)
        }
    }
}
