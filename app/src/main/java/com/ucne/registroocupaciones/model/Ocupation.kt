package com.ucne.registroocupaciones.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Ocupaciones" )
data class Ocupation(
    @PrimaryKey(autoGenerate = true)
    val id: Int=0,
    val descripcion: String="",
    val salario: Double =0.0,

    )
