package com.example.studeasee.model

import androidx.annotation.DrawableRes

data class Room (
    @DrawableRes
    val imageResourceID:Int,
    val name:String,
    val price :Int,
)