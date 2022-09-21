package com.ucne.registroocupaciones.ui.Prestamo;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020)J\u0006\u0010+\u001a\u00020)R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR+\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR+\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000bR+\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001b\u0010\t\"\u0004\b\u001c\u0010\u000bR+\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b!\u0010\r\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R+\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\'\u0010\r\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000b\u00a8\u0006,"}, d2 = {"Lcom/ucne/registroocupaciones/ui/Prestamo/PrestamoViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/ucne/registroocupaciones/repository/PrestamoRepository;", "(Lcom/ucne/registroocupaciones/repository/PrestamoRepository;)V", "<set-?>", "", "balance", "getBalance", "()Ljava/lang/String;", "setBalance", "(Ljava/lang/String;)V", "balance$delegate", "Landroidx/compose/runtime/MutableState;", "concepto", "getConcepto", "setConcepto", "concepto$delegate", "fecha", "getFecha", "setFecha", "fecha$delegate", "monto", "getMonto", "setMonto", "monto$delegate", "personaid", "getPersonaid", "setPersonaid", "personaid$delegate", "prestamoid", "getPrestamoid", "setPrestamoid", "prestamoid$delegate", "getRepository", "()Lcom/ucne/registroocupaciones/repository/PrestamoRepository;", "vence", "getVence", "setVence", "vence$delegate", "Delete", "", "Save", "Update", "app_debug"})
public final class PrestamoViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.ucne.registroocupaciones.repository.PrestamoRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState prestamoid$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState fecha$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState vence$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState personaid$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState concepto$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState monto$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState balance$delegate = null;
    
    @javax.inject.Inject()
    public PrestamoViewModel(@org.jetbrains.annotations.NotNull()
    com.ucne.registroocupaciones.repository.PrestamoRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ucne.registroocupaciones.repository.PrestamoRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrestamoid() {
        return null;
    }
    
    public final void setPrestamoid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFecha() {
        return null;
    }
    
    public final void setFecha(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVence() {
        return null;
    }
    
    public final void setVence(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPersonaid() {
        return null;
    }
    
    public final void setPersonaid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getConcepto() {
        return null;
    }
    
    public final void setConcepto(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMonto() {
        return null;
    }
    
    public final void setMonto(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBalance() {
        return null;
    }
    
    public final void setBalance(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void Save() {
    }
    
    public final void Update() {
    }
    
    public final void Delete() {
    }
}