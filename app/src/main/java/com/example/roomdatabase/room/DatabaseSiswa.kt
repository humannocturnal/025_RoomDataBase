package com.example.roomdatabase.room

import android.R.attr.version
import android.content.Context

@Database(entities = [Siswa::class], version = 1, exportSchema = false)
abstract class DatabaseSiswa : RoomDataBase() {
    abstract fun siswaDao() : SiswaDao

    companion object {
        @Volatile
        private var Instance: DatabaseSiswa? = null

        fun getDataBase(context: Context): DatabaseSiswa {
            return (Instance?: synchronized(this){
                Room.DatabaseBuilder(
                    context, DatabaseSiswa::class.java,
                    "Siswa_Database")
                    .build().also { Instance=it }
            })
        }
    }
}