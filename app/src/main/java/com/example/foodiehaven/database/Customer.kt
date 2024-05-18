package com.example.foodiehaven.database

import androidx.room.Embedded
import androidx.room.Relation

data class Customer (
    @Embedded
    val Admin : Admin,

    @Relation(
        parentColumn = "adminid",
        entityColumn = "id"
    )
    val menu: Menu
)