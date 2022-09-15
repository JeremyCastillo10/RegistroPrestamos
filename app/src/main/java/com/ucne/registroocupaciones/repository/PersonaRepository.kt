package com.ucne.registroocupaciones.repository


import com.ucne.registroocupaciones.data.AppDataBase
import com.ucne.registroocupaciones.data.AppPersonaDb
import com.ucne.registroocupaciones.model.Ocupation
import com.ucne.registroocupaciones.model.Persona
import javax.inject.Inject

class PersonaRepository @Inject constructor(
    val db: AppPersonaDb
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

    fun getPersonas(id: Int) = db.PersonaDao.getPersona(id)

    fun getAll() = db.PersonaDao.getAll()

}