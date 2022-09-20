package com.ucne.registroocupaciones.data

import androidx.room.Database
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.RoomDatabase
import com.ucne.registroocupaciones.data.dao.OcupacionDao
import com.ucne.registroocupaciones.data.dao.PersonaDao
import com.ucne.registroocupaciones.data.dao.PrestamoDao
import com.ucne.registroocupaciones.model.Ocupation

@Database(
    entities = [Ocupation::class, Persona::class, Prestamo::class],
    version = 2
)
abstract class AppDataBase : RoomDatabase() {
    abstract val OcupacionDao: OcupacionDao
    abstract  val PersonaDao: PersonaDao
    abstract val PrestamoDao: PrestamoDao

}
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

@Entity(tableName = "Prestamos" )
data class Prestamo(
    @PrimaryKey(autoGenerate = true)
    val prestamoid: Int = 0,
    val fecha: String = "",
    val vence: String = "",
    val personaid: Int = 0,
    val concepto: String = "",
    val monto: Double = 0.00,
    val balance: Double = 0.00,

    )