package com.ucne.registroocupaciones.data

import androidx.room.Database
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.RoomDatabase
import com.ucne.registroocupaciones.data.dao.OcupacionDao
import com.ucne.registroocupaciones.model.Ocupation

@Database(
    entities = [Ocupation::class,],
    version = 2
)
abstract class AppDataBase : RoomDatabase() {
    abstract val OcupacionDao: OcupacionDao
}