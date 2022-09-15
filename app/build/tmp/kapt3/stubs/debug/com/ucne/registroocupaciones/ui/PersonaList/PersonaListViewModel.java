package com.ucne.registroocupaciones.ui.PersonaList;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/ucne/registroocupaciones/ui/PersonaList/PersonaListViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/ucne/registroocupaciones/repository/PersonaRepository;", "(Lcom/ucne/registroocupaciones/repository/PersonaRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ucne/registroocupaciones/ui/PersonaList/PersonaListUiState;", "getRepository", "()Lcom/ucne/registroocupaciones/repository/PersonaRepository;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "app_debug"})
public final class PersonaListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.ucne.registroocupaciones.repository.PersonaRepository repository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.ucne.registroocupaciones.ui.PersonaList.PersonaListUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.ucne.registroocupaciones.ui.PersonaList.PersonaListUiState> uiState = null;
    
    @javax.inject.Inject()
    public PersonaListViewModel(@org.jetbrains.annotations.NotNull()
    com.ucne.registroocupaciones.repository.PersonaRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ucne.registroocupaciones.repository.PersonaRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.ucne.registroocupaciones.ui.PersonaList.PersonaListUiState> getUiState() {
        return null;
    }
}