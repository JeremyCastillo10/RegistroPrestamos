package com.ucne.registroocupaciones.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u0019\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/ucne/registroocupaciones/repository/OcupacionRepository;", "", "db", "Lcom/ucne/registroocupaciones/data/AppDataBase;", "(Lcom/ucne/registroocupaciones/data/AppDataBase;)V", "getDb", "()Lcom/ucne/registroocupaciones/data/AppDataBase;", "deleteOcupacion", "", "ocupation", "Lcom/ucne/registroocupaciones/model/Ocupation;", "(Lcom/ucne/registroocupaciones/model/Ocupation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "getOcupacion", "id", "", "insertOcupacion", "updateOcupacion", "app_debug"})
public final class OcupacionRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.ucne.registroocupaciones.data.AppDataBase db = null;
    
    @javax.inject.Inject()
    public OcupacionRepository(@org.jetbrains.annotations.NotNull()
    com.ucne.registroocupaciones.data.AppDataBase db) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ucne.registroocupaciones.data.AppDataBase getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertOcupacion(@org.jetbrains.annotations.NotNull()
    com.ucne.registroocupaciones.model.Ocupation ocupation, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateOcupacion(@org.jetbrains.annotations.NotNull()
    com.ucne.registroocupaciones.model.Ocupation ocupation, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteOcupacion(@org.jetbrains.annotations.NotNull()
    com.ucne.registroocupaciones.model.Ocupation ocupation, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.ucne.registroocupaciones.model.Ocupation> getOcupacion(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.ucne.registroocupaciones.model.Ocupation>> getAll() {
        return null;
    }
}