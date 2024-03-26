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

    @Query("SELECT * FROM Admin WHERE username = :username AND password = :password")
    suspend fun findUserByUsernameAndPassword(username: String, password: String): Admin?

    @Query("SELECT * FROM Admin WHERE username = :username")
    suspend fun findUserByUsername(username: String): Admin?
}