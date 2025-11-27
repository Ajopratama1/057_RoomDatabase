package com.example.a057_roomdatabase.repositori

import com.example.a057_roomdatabase.room.Siswa
import com.example.a057_roomdatabase.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RoomRepositoryInterface {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}

class OfflineRepository(
    private val siswaDao: SiswaDao
) : RoomRepositoryInterface {
    override fun getAllSiswaStream(): Flow<List<Siswa>> = siswaDao.getAllSiswa()
    override suspend fun insertSiswa(siswa: Siswa) = siswaDao.insert(siswa)
}


