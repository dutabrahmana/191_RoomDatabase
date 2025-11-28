package com.example.roomdatabase.room

@Database(entities = [Siswa::class], version =  1, exportSchema = false)
abstract class DatabaseSiswa : RoomDatabase(){
    abstract fun siswaDao() : SiswaDAO

    companion object {
        @Volatile
        private var instance: DatabaseSiswa? = null

