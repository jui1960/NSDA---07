package com.example.a17_assement.Model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Data::class], version = 1)
abstract class EmployeeDatabase : RoomDatabase() {
    abstract fun employDao(): EmployeeDao

    companion object {
        private var INSTANCE: EmployeeDatabase? = null

        fun getdatabse(context: Context): EmployeeDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    EmployeeDatabase::class.java,
                    "note_db"
                )
                    .allowMainThreadQueries()
                    .build()
            }
            return INSTANCE!!
        }
    }

}