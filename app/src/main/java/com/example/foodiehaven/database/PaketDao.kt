package com.example.foodiehaven.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface PaketDao {
    @Insert
    suspend fun addPaket(paket: Paket)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(paket: Paket)

    @Query("SELECT * FROM `Paket` ORDER BY id DESC")
    suspend fun getAllPaket(): List<Paket>

    @Update
    suspend fun updatePaket(paket: Paket)

    @Delete
    suspend fun deletePaket(paket: Paket)
}