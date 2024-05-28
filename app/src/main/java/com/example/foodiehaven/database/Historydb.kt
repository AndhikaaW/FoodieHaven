package com.example.foodiehaven.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Historydb(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    @ColumnInfo
    val namaPelanggan: String,
    @ColumnInfo
    val tanggalPesan: String
)