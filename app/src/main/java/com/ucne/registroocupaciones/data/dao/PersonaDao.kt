package com.ucne.registroocupaciones.data.dao

import androidx.room.*
import com.ucne.registroocupaciones.data.Persona
import com.ucne.registroocupaciones.model.Ocupation
import kotlinx.coroutines.flow.Flow

@Dao
interface PersonaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPersonas(persona: Persona)

    @Update
    suspend fun updatePersonas(persona: Persona)

    @Delete
    suspend fun deletePersonas(persona: Persona)

    @Query("SELECT * FROM Personas WHERE personaid = :personaid LIMIT 1")
    suspend fun find(personaid: Int): Persona

    @Query("SELECT * FROM Personas")
    fun getList(): Flow<List<Persona>>
}

