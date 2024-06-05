package com.example.foodiehaven.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
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

    @Query("DELETE FROM Admin WHERE namaPelanggan = :namaPelanggan")
    fun delete(namaPelanggan:String)




    @Insert
    suspend fun addMenu(menu: Menu)
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    suspend fun insert(menu: Menu)
    @Query("SELECT * FROM Menu ORDER BY menuid DESC")
    suspend fun getAllMenu(): List<Menu>
    @Delete
    suspend fun deleteMenu(menu: Menu)
    @Query("DELETE FROM Menu")
    suspend fun deleteAllMenu()
//    @Query("SELECT * FROM Admin")
//    fun getMenuByAdmin():Customer
//
//    @Query("SELECT * FROM Admin WHERE adminid = :adminid")
//    @Transaction
//    fun getById(adminid:Long): List<Customer>

//    @Transaction
//    fun getById(adminid:Long):List<Customer>



    @Insert
    suspend fun addItem(itemCart: ItemCart)
    @Query("SELECT * FROM ItemCart WHERE adminid = :idBarang ")
    suspend fun getAllById(idBarang: Long): List<ItemCart>
    @Query("SELECT adminid FROM Admin ORDER BY adminid DESC LIMIT 1")
    fun getLastTransaksi():Long

    @Query("SELECT * FROM Menu WHERE menuid = :idBarang ")
    fun getAllMenuById(idBarang: Long): Menu
    @Query("DELETE FROM ItemCart WHERE adminid = :adminid")
    fun delItem(adminid:Long)

    @Insert
    suspend fun addHistory(historydb: Historydb)
    @Query("SELECT * FROM Historydb ORDER BY id DESC")
    suspend fun getAllHistory(): List<Historydb>
    @Query("SELECT * FROM Historydb ORDER BY id DESC")
    fun getHistory(): List<Historydb>
}