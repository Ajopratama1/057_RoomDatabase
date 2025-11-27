package com.example.a057_roomdatabase.room

import androidx.room.PrimaryKey

data class Siswa(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nama: String,
    val alamat: String,
    val telpon: String

)
