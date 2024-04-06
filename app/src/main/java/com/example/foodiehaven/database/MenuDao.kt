package com.example.foodiehaven.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import java.util.concurrent.Flow

@Dao
interface MenuDao {
    @Insert
    suspend fun addMenu(menu: Menu)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(menu: Menu)

    @Query("SELECT * FROM Menu ORDER BY id DESC")
    suspend fun getAllMenu(): List<Menu>

    @Update
    suspend fun updateMenu(menu: Menu)

    @Delete
    suspend fun deleteMenu(menu: Menu)

//    @Query("SELECT biaya FROM `Menu` ORDER BY id DESC LIMIT 1")
//    suspend fun getBiayaMenu(): Menu
}