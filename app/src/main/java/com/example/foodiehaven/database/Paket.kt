package com.example.foodiehaven.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Paket (
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo
    var namaPaket: String,
    @ColumnInfo
    var harga: String,
    @ColumnInfo
    var jumlah: String,
)