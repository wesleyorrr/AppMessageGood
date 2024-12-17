package com.freelanceror.appmensagegood


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import com.freelanceror.appmensagegood.data.AppDatabase

import com.freelanceror.appmensagegood.databinding.ActivityCalendarBinding
import com.freelanceror.appmensagegood.model.CompletedTask
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class CalendarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalendarBinding
    private lateinit var db: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalendarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "task_database"
        ).build()


        val buttons = listOf(
            Pair(findViewById<Button>(R.id.btnSunday), "Sunday"),
            Pair(findViewById<Button>(R.id.btnMonday), "Monday"),
            Pair(findViewById<Button>(R.id.btnTuesday), "Tuesday"),
            Pair(findViewById<Button>(R.id.btnWednesday), "Wednesday"),
            Pair(findViewById<Button>(R.id.btnThursday), "Thursday"),
            Pair(findViewById<Button>(R.id.btnFriday), "Friday"),
            Pair(findViewById<Button>(R.id.btnSaturday), "Saturday")
        )

        buttons.forEach { pair ->
            pair.first.setOnClickListener {
                val day = pair.second
                val date = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Date())
                saveTaskToDatabase(day, date)
            }
        }

        findViewById<Button>(R.id.btnViewCalendar).setOnClickListener {
            startActivity(Intent(this, CalendarActivityy::class.java))
        }
    }
    private fun saveTaskToDatabase(day: String, date: String) {
        lifecycleScope.launch {
            db.completedTaskDao().insertTask(CompletedTask(dayOfWeek = day, date = date))
            Toast.makeText(this@CalendarActivity, "Tarefa salva!", Toast.LENGTH_SHORT).show()
        }

    }
}