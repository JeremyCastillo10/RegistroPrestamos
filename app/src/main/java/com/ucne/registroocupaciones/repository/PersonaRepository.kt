package com.ucne.registroocupaciones.repository


import com.ucne.registroocupaciones.data.AppDataBase
import com.ucne.registroocupaciones.data.Persona
import javax.inject.Inject

class PersonaRepository @Inject constructor(
    val db: AppDataBase
) {
    suspend fun insertPersonas(persona: Persona) {
        db.PersonaDao.insertPersonas(persona)
    }

    suspend fun updatePersonas(persona: Persona) {
        db.PersonaDao.updatePersonas(persona)
    }

    suspend fun deletePersonas(persona: Persona) {
        db.PersonaDao.deletePersonas(persona)
    }


    fun getAll() = db.PersonaDao.getList()

}