package com.freelanceror.appmensagegood.model

import androidx.room.Entity


@Entity(tableName = "completed_tasks")
data class CompletedTask(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val dayOfWeek: String,
    val date: String
)
