package com.ucne.registroocupaciones.ui.Persona;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010(\u001a\u00020)R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR+\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR+\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000bR+\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001b\u0010\t\"\u0004\b\u001c\u0010\u000bR+\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b!\u0010\r\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R+\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\'\u0010\r\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000b\u00a8\u0006*"}, d2 = {"Lcom/ucne/registroocupaciones/ui/Persona/PersonaViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/ucne/registroocupaciones/repository/PersonaRepository;", "(Lcom/ucne/registroocupaciones/repository/PersonaRepository;)V", "<set-?>", "", "celular", "getCelular", "()Ljava/lang/String;", "setCelular", "(Ljava/lang/String;)V", "celular$delegate", "Landroidx/compose/runtime/MutableState;", "direccion", "getDireccion", "setDireccion", "direccion$delegate", "email", "getEmail", "setEmail", "email$delegate", "fechanacimiento", "getFechanacimiento", "setFechanacimiento", "fechanacimiento$delegate", "nombres", "getNombres", "setNombres", "nombres$delegate", "ocupacionid", "getOcupacionid", "setOcupacionid", "ocupacionid$delegate", "getRepository", "()Lcom/ucne/registroocupaciones/repository/PersonaRepository;", "telefono", "getTelefono", "setTelefono", "telefono$delegate", "Save", "", "app_debug"})
public final class PersonaViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.ucne.registroocupaciones.repository.PersonaRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState nombres$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState telefono$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState celular$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState direccion$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState email$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState fechanacimiento$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState ocupacionid$delegate = null;
    
    @javax.inject.Inject()
    public PersonaViewModel(@org.jetbrains.annotations.NotNull()
    com.ucne.registroocupaciones.repository.PersonaRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ucne.registroocupaciones.repository.PersonaRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNombres() {
        return null;
    }
    
    public final void setNombres(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTelefono() {
        return null;
    }
    
    public final void setTelefono(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCelular() {
        return null;
    }
    
    public final void setCelular(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDireccion() {
        return null;
    }
    
    public final void setDireccion(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFechanacimiento() {
        return null;
    }
    
    public final void setFechanacimiento(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOcupacionid() {
        return null;
    }
    
    public final void setOcupacionid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void Save() {
    }
}