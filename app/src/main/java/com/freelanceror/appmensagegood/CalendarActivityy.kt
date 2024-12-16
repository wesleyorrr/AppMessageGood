package com.freelanceror.appmensagegood

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import com.freelanceror.appmensagegood.data.AppDatabase
import com.freelanceror.appmensagegood.databinding.ActivityCalendarActivityyBinding
import com.freelanceror.appmensagegood.databinding.ActivityCalendarActivityyBinding.inflate
import kotlinx.coroutines.launch

class CalendarActivityy : AppCompatActivity() {

    private lateinit var binding: ActivityCalendarActivityyBinding
    private lateinit var db: AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCalendarActivityyBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "task_database"
        ).build()

        lifecycleScope.launch {
            val tasks = db.completedTaskDao().getAllTasks()
            // Aqui você pode usar uma biblioteca de calendário para mostrar os dias marcados
        }
    }
}


