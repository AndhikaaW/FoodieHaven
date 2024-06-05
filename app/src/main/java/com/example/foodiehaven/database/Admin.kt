package com.example.foodiehaven.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Admin (
    @PrimaryKey(autoGenerate = true)
    var adminid: Long=0L,
    @ColumnInfo
    var namaPelanggan: String,
    @ColumnInfo
    var noTelepon: String,
    @ColumnInfo
    var alamatRumah:String,
    @ColumnInfo
    var tanggalPesan:String
)
