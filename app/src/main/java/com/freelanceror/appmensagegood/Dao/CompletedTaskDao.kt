package com.freelanceror.appmensagegood.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.freelanceror.appmensagegood.model.CompletedTask

@Dao
interface CompletedTaskDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(task: CompletedTask)

    @Query("SELECT * FROM completed_tasks")
    suspend fun getAllTasks(): List<CompletedTask>
}