package com.project.incentivoapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.widget.CalendarView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.project.incentivoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var dateTV: TextView
    private lateinit var calendarView: CalendarView
    private lateinit var binding: ActivityMainBinding
    //private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        calendarUpdateDate(R.id.show_date, R.id.calendarView)
        //binding.calendarView.
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_nav,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onClick(view: View?) {
        Toast.makeText(this, "teste", Toast.LENGTH_SHORT).show()
    }

    private fun calendarUpdateDate(text_element: Int, date_element: Int) {
        dateTV = findViewById(text_element)
        calendarView = findViewById(date_element)
        calendarView.setOnDateChangeListener{ _, year, month, dayOfMonth ->
            val date = (dayOfMonth.toString() + "-"
                        + (month + 1) + "-" + year)

            dateTV.text = date
            //Toast.makeText(this, dateTV.text, Toast.LENGTH_SHORT).show()
        }
    }
}

