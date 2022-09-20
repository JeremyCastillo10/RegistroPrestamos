package com.ucne.registroocupaciones.repository

import com.ucne.registroocupaciones.data.*
import javax.inject.Inject

class PrestamoRepository @Inject constructor(
    val db: AppDataBase
){
    suspend fun InsertPrestamo(prestamo: Prestamo){
        db.PrestamoDao.insertPrestamo(prestamo)
    }
    suspend fun UpdatePrestamo(prestamo: Prestamo){
        db.PrestamoDao.updatePrestamo(prestamo)
    }
    suspend fun DeletePrestamo(prestamo: Prestamo){
        db.PrestamoDao.deletePrestamo(prestamo)
    }

    fun getAll() = db.PrestamoDao.getList()



}