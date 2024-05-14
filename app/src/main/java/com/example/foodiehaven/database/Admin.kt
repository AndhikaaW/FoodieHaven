package com.example.foodiehaven.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Admin")
data class Admin (
    @PrimaryKey(autoGenerate = true)
    var id: Long,
    @ColumnInfo
    var namaPelanggan: String,
    @ColumnInfo
    var alamatRumah:String,
    @ColumnInfo
    var noTelepon: String,
//    @ColumnInfo
//    var Menu: String,
//    @ColumnInfo
//    var jumlahMenu: String
)