package com.example.assignment01

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        val counteModel = CounterModel()
        //get the reference of the ui elements
        val teamAScore: TextView = findViewById(R.id.teamAScore)
        val teamBScore: TextView = findViewById(R.id.teamBscore)
        val A1: Button = findViewById(R.id.button1A)
        val A2: Button = findViewById(R.id.button2A)
        val A3: Button = findViewById(R.id.buttonA3)
        val B1: Button = findViewById(R.id.buttonB1)
        val B2: Button = findViewById(R.id.buttonB2)
        val B3: Button = findViewById(R.id.buttonB3)
        val resetButton: Button = findViewById(R.id.resetButton)

        A1.setOnClickListener{
            counteModel.increament1()
            teamAScore.text = counteModel.getCount1().toString()
        }
        A2.setOnClickListener{
            counteModel.increament2()
            teamAScore.text = counteModel.getCount1().toString()
        }
        A3.setOnClickListener{
            counteModel.increament3()
            teamAScore.text = counteModel.getCount1().toString()
        }
        B1.setOnClickListener{
            counteModel.increament4()
            teamBScore.text = counteModel.getCount2().toString()
        }
        B2.setOnClickListener{
            counteModel.increament5()
            teamBScore.text = counteModel.getCount2().toString()
        }
        B3.setOnClickListener{
            counteModel.increament6()
            teamBScore.text = counteModel.getCount2().toString()
        }
        resetButton.setOnClickListener {
            counteModel.reset()
            teamAScore.text = counteModel.getCount1().toString()
            teamBScore.text = counteModel.getCount2().toString()
        }
    }
}