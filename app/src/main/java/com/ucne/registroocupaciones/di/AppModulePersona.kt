package com.ucne.registroocupaciones.di

import android.content.Context
import androidx.room.Room
import com.ucne.registroocupaciones.data.AppDataBase
import com.ucne.registroocupaciones.data.AppPersonaDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModulePersona {

    @Singleton
    @Provides
    fun providesDababase(@ApplicationContext context: Context): AppPersonaDb {
        return Room.databaseBuilder(
            context,
            AppPersonaDb::class.java,
            "SpellingDb"
        ).fallbackToDestructiveMigration().build()
    }
}