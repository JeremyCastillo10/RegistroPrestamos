package com.ucne.registroocupaciones.ui.ocupation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR+\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/ucne/registroocupaciones/ui/ocupation/OcupationViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/ucne/registroocupaciones/repository/OcupacionRepository;", "(Lcom/ucne/registroocupaciones/repository/OcupacionRepository;)V", "<set-?>", "", "descripcion", "getDescripcion", "()Ljava/lang/String;", "setDescripcion", "(Ljava/lang/String;)V", "descripcion$delegate", "Landroidx/compose/runtime/MutableState;", "getRepository", "()Lcom/ucne/registroocupaciones/repository/OcupacionRepository;", "salario", "getSalario", "setSalario", "salario$delegate", "Save", "", "app_debug"})
public final class OcupationViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.ucne.registroocupaciones.repository.OcupacionRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState descripcion$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState salario$delegate = null;
    
    @javax.inject.Inject()
    public OcupationViewModel(@org.jetbrains.annotations.NotNull()
    com.ucne.registroocupaciones.repository.OcupacionRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ucne.registroocupaciones.repository.OcupacionRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescripcion() {
        return null;
    }
    
    public final void setDescripcion(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSalario() {
        return null;
    }
    
    public final void setSalario(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void Save() {
    }
}