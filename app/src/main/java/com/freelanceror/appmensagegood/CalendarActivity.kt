package com.freelanceror.appmensagegood

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.freelanceror.appmensagegood.R.layout.activity_calendar
import com.freelanceror.appmensagegood.databinding.ActivityCalendarBinding

class CalendarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalendarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityCalendarBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}