package com.example.foodiehaven.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Paket::class], version = 1)
abstract class PaketApp: RoomDatabase() {
    abstract fun getPaketDao(): PaketDao

    companion object{
        @Volatile
        private var instance : PaketApp? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            PaketApp::class.java,
            name= "paket"
        ).build()
    }
}