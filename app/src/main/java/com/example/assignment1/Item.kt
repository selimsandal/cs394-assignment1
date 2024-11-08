package com.example.assignment1.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Item(
    val name: String,
    val role: String,
    val location: String
) : Parcelable
