package com.ucne.registroocupaciones.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.ucne.registroocupaciones.data.Prestamo
import com.ucne.registroocupaciones.model.Ocupation
import com.ucne.registroocupaciones.data.dao.*
import kotlinx.coroutines.flow.Flow

@Dao
interface PrestamoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPrestamo(prestamo: Prestamo)

    @Update
    suspend fun updatePrestamo(prestamo: Prestamo)

    @Delete
    suspend fun deletePrestamo(prestamo: Prestamo)

    @Query("SELECT * FROM Prestamos WHERE prestamoid = :prestamoid LIMIT 1")
    suspend fun find(prestamoid: Int): Prestamo

    @Query("SELECT * FROM Prestamos")
    fun getList(): Flow<List<Prestamo>>
}