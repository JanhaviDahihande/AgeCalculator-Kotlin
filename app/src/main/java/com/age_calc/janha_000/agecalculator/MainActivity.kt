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
    
    //now edit this code quickly

    private fun calcAge(input: String): String {
        val year = input.toInt()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)

       if (currentYear==0)
        show.text= "Invalid Input"
        else {
            val myage: Float= currentyear - yearofbirth

            show.text = "YOUR AGE IS $year YEARS"
        }
        
    }
}
