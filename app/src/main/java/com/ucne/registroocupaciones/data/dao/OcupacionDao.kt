package com.ucne.registroocupaciones.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.ucne.registroocupaciones.model.Ocupation
import com.ucne.registroocupaciones.data.dao.*
import kotlinx.coroutines.flow.Flow

@Dao
interface OcupacionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOcupacion(ocupation: Ocupation)

    @Update
    suspend fun updateOcupacion(ocupation: Ocupation)

    @Delete
    suspend fun deleteOcupacion(ocupation: Ocupation)

    @Query("SELECT * FROM Ocupaciones WHERE ocupacionid = :ocupacionid LIMIT 1")
    suspend fun find(ocupacionid: Int): Ocupation

    @Query("SELECT * FROM Ocupaciones")
    fun getList(): Flow<List<Ocupation>>
}

