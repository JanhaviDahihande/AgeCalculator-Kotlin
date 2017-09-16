package com.age_calc.janha_000.agecalculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mButton.setOnClickListener {
            val year = mAge.getString()
            if (year.isNullOrBlank())
                mDisplayAge.text = "Invalid year"
            else {
                mDisplayAge.text = calcAge(year)
            }
        }
    }

    private fun calcAge(input: String): String {
        val year = input.toInt()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)

        return if (currentYear < year)
            "Enter correct year!"
        else {
            "You are ${currentYear - year} year(s) old"
        }
    }
}
