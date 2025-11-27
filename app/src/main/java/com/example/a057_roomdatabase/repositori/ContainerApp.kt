package com.example.a057_roomdatabase.repositori

import android.app.Application
import android.content.Context
import com.example.a057_roomdatabase.room.DatabaseSiswa

interface ContainerApp {
    val repositoriSiswa : RepositoriSiswa
}



class ContainerDataApp(private val context: Context) :
    ContainerApp {
    override val repositoriSiswa : RepositoriSiswa by lazy {
        OfflineRepositori(DatabaseSiswa.getDatabase(context).siswaDao())

    }
}

class AplikasiSiswa : Application() {
    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerDataApp(this)
    }
}



