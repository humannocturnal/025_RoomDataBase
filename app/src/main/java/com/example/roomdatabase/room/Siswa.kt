package com.example.roomdatabase.room

import androidx.activity.SystemBarStyle.Companion.auto

@Entity(tableName = "tbl Siswa")
data class Siswa (
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val nama : String,
    val alamat : String,
    val telepon : String
)