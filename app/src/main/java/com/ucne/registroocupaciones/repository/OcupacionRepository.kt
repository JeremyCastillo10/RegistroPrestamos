package com.ucne.registroocupaciones.repository


import com.ucne.registroocupaciones.data.AppDataBase
import com.ucne.registroocupaciones.data.dao.OcupacionDao
import com.ucne.registroocupaciones.model.Ocupation
import javax.inject.Inject

class OcupacionRepository @Inject constructor(
    val db: AppDataBase
) {
    suspend fun insertOcupacion(ocupation: Ocupation) {
        db.OcupacionDao.insertOcupacion(ocupation)
    }

    suspend fun updateOcupacion(ocupation: Ocupation) {
        db.OcupacionDao.updateOcupacion(ocupation)
    }

    suspend fun deleteOcupacion(ocupation: Ocupation) {
        db.OcupacionDao.deleteOcupacion(ocupation)
    }

    fun getOcupacion(id: Int) = db.OcupacionDao.getOcupacion(id)

    fun getAll() = db.OcupacionDao.getAll()

}