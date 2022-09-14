package com.ucne.registroocupaciones.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Personas" )
data class Persona(
    @PrimaryKey(autoGenerate = true)
    val personaid: Int = 0,
    val telefono: String = "",
    val celular: String = "",
    val email: String = "",
    val direccion: String = "",
    val fechanacimiento: String = "",
    val nombres: String = "",
    val ocupacionid: String = ""

)