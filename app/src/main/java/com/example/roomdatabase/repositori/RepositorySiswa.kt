package com.example.roomdatabase.repositori

import com.example.roomdatabase.room.Siswa
import com.example.roomdatabase.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositorySiswa {
    fun getAllSiswaStream(): Flow<list<Siswa>>
    suspend fun instertSiswa(siswa: Siswa)
}

class OfflineRepositoriSiswa(
    private val siswaDao: SiswaDao
): RepositorySiswa {
    override fun getAllSiswaStream(): Flow<list<Siswa>> = siswaDao.getAllSiswa()
    override suspend fun insertSiswa(siswa: Siswa) = siswaDao.insert(siswa)
}
