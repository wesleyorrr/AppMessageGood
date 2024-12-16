package com.freelanceror.appmensagegood.data

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.freelanceror.appmensagegood.Dao.CompletedTaskDao
import com.freelanceror.appmensagegood.model.CompletedTask

@Database(entities = [CompletedTask::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun completedTaskDao(): CompletedTaskDao
}
