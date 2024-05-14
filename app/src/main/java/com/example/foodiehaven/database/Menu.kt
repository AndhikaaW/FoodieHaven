package com.example.foodiehaven.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey

@Entity(tableName = "Menu")
data class Menu (
    @PrimaryKey(autoGenerate = true)
    var id: Long,
    @ColumnInfo
    var namamenu: String,
    @ColumnInfo
    var hargamenu: String,
    @ColumnInfo
    var count: String,
)