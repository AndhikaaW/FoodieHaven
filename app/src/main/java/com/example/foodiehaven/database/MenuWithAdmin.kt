package com.example.foodiehaven.database

import androidx.room.Embedded
import androidx.room.Relation

data class MenuWithAdmin (
    @Embedded
    val admin: Admin,

    @Relation(
        parentColumn = "AdminId",
        entityColumn = "id"
    )
    val menu: List<Menu>
)