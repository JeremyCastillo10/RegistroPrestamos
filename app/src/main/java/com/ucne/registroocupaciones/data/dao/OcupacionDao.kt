package com.ucne.registroocupaciones.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.ucne.registroocupaciones.model.Ocupation
import kotlinx.coroutines.flow.Flow

@Dao
interface OcupacionDao {
    @Insert
    suspend fun insertOcupacion(ocupation: Ocupation)

    @Update
    suspend fun updateOcupacion(ocupation: Ocupation)

    @Delete
    suspend fun deleteOcupacion(ocupation: Ocupation)

    @Query("SELECT * FROM Ocupaciones WHERE id = :id")
    fun getOcupacion(id: Int): Flow<Ocupation>

    @Query("SELECT * FROM Ocupaciones")
    fun getAll(): Flow<List<Ocupation>>
}

