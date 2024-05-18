package com.example.foodiehaven.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Admin::class,Menu::class], version = 1)
abstract class AdminApp: RoomDatabase() {
    abstract fun getAdminDao(): AdminDao
//    abstract fun getAdminDao(): MenuDao

    companion object{
        @Volatile
        private var instance : AdminApp? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            AdminApp::class.java,
            name= "admin"
        ).build()
    }
}