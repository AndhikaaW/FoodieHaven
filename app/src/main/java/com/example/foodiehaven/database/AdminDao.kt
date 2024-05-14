package com.example.foodiehaven.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface AdminDao {
    @Insert
    suspend fun addAdmin(admin: Admin)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(admin: Admin)

    @Query("SELECT * FROM Admin ORDER BY id DESC")
    suspend fun getAllAdmin(): List<Admin>

    @Update
    suspend fun updateAdmin(admin: Admin)

    @Delete
    suspend fun deleteAdmin(admin: Admin)
}