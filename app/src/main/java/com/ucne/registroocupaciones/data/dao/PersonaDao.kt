package com.ucne.registroocupaciones.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.ucne.registroocupaciones.model.Persona
import kotlinx.coroutines.flow.Flow

@Dao
interface PersonaDao {
    @Insert
    suspend fun insertPersonas(persona: Persona)

    @Update
    suspend fun updatePersonas(persona: Persona)

    @Delete
    suspend fun deletePersonas(persona: Persona)

    @Query("SELECT * FROM Personas WHERE personaid = :id")
    fun getPersona(id: Int): Flow<Persona>

    @Query("SELECT * FROM Personas")
    fun getAll(): Flow<List<Persona>>
}

