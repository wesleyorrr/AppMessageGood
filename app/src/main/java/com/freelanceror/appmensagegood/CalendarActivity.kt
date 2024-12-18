package com.freelanceror.appmensagegood


import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


import com.freelanceror.appmensagegood.databinding.ActivityCalendarBinding


class CalendarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalendarBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalendarBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }

}