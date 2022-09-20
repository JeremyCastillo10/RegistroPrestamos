package com.ucne.registroocupaciones.data.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\fH\'J\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/ucne/registroocupaciones/data/dao/OcupacionDao;", "", "deleteOcupacion", "", "ocupation", "Lcom/ucne/registroocupaciones/model/Ocupation;", "(Lcom/ucne/registroocupaciones/model/Ocupation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "find", "ocupacionid", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getList", "Lkotlinx/coroutines/flow/Flow;", "", "insertOcupacion", "updateOcupacion", "app_debug"})
public abstract interface OcupacionDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertOcupacion(@org.jetbrains.annotations.NotNull()
    com.ucne.registroocupaciones.model.Ocupation ocupation, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateOcupacion(@org.jetbrains.annotations.NotNull()
    com.ucne.registroocupaciones.model.Ocupation ocupation, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteOcupacion(@org.jetbrains.annotations.NotNull()
    com.ucne.registroocupaciones.model.Ocupation ocupation, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM Ocupaciones WHERE ocupacionid = :ocupacionid LIMIT 1")
    public abstract java.lang.Object find(int ocupacionid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ucne.registroocupaciones.model.Ocupation> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Ocupaciones")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.ucne.registroocupaciones.model.Ocupation>> getList();
}