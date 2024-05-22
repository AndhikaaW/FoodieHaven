package com.example.foodiehaven.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update

@Dao
interface AdminDao {
    @Insert
    suspend fun addAdmin(admin: Admin)

//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    suspend fun insert(admin: Admin)

    @Query("SELECT * FROM Admin ORDER BY adminid DESC")
    suspend fun getAllAdmin(): List<Admin>

    @Delete
    suspend fun deleteAdmin(admin: Admin)


    @Insert
    suspend fun addMenu(menu: Menu)
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    suspend fun insert(menu: Menu)
    @Query("SELECT * FROM Menu ORDER BY id DESC")
    suspend fun getAllMenu(): List<Menu>
    @Delete
    suspend fun deleteMenu(menu: Menu)

//    @Query("SELECT * FROM Admin")
//    fun getMenuByAdmin():Customer
//
//    @Query("SELECT * FROM Admin WHERE adminid = :adminid")
//    @Transaction
//    fun getById(adminid:Long): List<Customer>

//    @Transaction
//    fun getById(adminid:Long):List<Customer>
}