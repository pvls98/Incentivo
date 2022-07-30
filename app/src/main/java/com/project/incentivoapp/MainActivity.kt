package com.project.incentivoapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.widget.CalendarView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var dateTV: TextView
    private lateinit var calendarView: CalendarView
    //private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dateTV = findViewById(R.id.idTVDate)
        calendarView = findViewById(R.id.calendarView)

        calendarView
            .setOnDateChangeListener{ _, year, month, dayOfMonth ->
                    val date = (dayOfMonth.toString() + "-"
                            + (month + 1) + "-" + year)

                dateTV.text = date
            }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_nav,menu)
        return super.onCreateOptionsMenu(menu)
    }
}

