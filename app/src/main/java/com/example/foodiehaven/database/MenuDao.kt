package com.example.foodiehaven.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface MenuDao {
    @Insert
    suspend fun addMenu(menu: Menu)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(menu: Menu)

    @Query("SELECT * FROM `Menu` ORDER BY id DESC")
    suspend fun getAllMenu(): List<Menu>

    @Update
    suspend fun updateMenu(menu: Menu)

    @Delete
    suspend fun deleteMenu(menu: Menu)
}