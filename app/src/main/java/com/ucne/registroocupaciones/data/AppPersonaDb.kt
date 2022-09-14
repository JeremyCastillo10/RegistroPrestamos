package com.ucne.registroocupaciones.data

import androidx.room.Database
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.RoomDatabase

import com.ucne.registroocupaciones.data.dao.OcupacionDao
import com.ucne.registroocupaciones.data.dao.PersonaDao

import com.ucne.registroocupaciones.model.Ocupation
import com.ucne.registroocupaciones.model.Persona

@Database(
    entities = [Persona::class],
    version = 2
)
abstract class AppPersonaDb : RoomDatabase() {
    abstract val PersonaDao:PersonaDao
}