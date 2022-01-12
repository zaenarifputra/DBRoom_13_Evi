package com.example.dbroom_13_evi.Room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Movie (

    @PrimaryKey(autoGenerate = true)
    val id: Int ,
    val title: String,
    val desc: String

)