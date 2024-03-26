package com.example.foodiehaven.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Menu (
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo
    var namaPelanggan: String,
    @ColumnInfo
    var noTelepon: String,
    @ColumnInfo
    var alamatRumah: String,
    @ColumnInfo
    var namaMenu: String,
    @ColumnInfo
    var kuantitas: String,
    @ColumnInfo
    var biaya: String
    )