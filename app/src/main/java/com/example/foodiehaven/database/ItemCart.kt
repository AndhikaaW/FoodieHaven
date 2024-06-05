package com.example.foodiehaven.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class ItemCart (
    @PrimaryKey(autoGenerate = true)
    var itemcart: Long = 0L,
    @ColumnInfo
    var adminid: Long = 1L,
    @ColumnInfo
    var namamenu: String,
    @ColumnInfo
    var hargamenu: String,
    @ColumnInfo
    var count: String
)