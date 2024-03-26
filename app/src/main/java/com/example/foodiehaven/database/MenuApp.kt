package com.example.foodiehaven.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Menu::class], version = 1)
abstract class MenuApp: RoomDatabase() {
    abstract fun getMenuDao(): MenuDao

    companion object{
        @Volatile
        private var instance : MenuApp? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            MenuApp::class.java,
            name= "menu"
        ).build()
    }
}