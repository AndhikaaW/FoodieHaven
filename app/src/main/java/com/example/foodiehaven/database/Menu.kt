package com.example.foodiehaven.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import androidx.room.Index

@Entity
data class Menu(
//    val id: Int,
    @PrimaryKey(autoGenerate = true)
    var menuid: Long = 0L,
    @ColumnInfo
    var namamenu: String,
    @ColumnInfo
    var hargamenu: String,
    @ColumnInfo
    var count: String
)