package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button()
        init()
        initChange()
    }

    // 4 задание
    private fun button() {
        val text1: TextView = findViewById(R.id.text1)
        val button: Button = findViewById(R.id.button1)
        button.setOnClickListener {
            text1.setText("Hello, GeekBrains!")
        }
    }

    // 5 задание, пункт a
    private fun init() {
        val count = Counters("", 0)
        val text2: TextView = findViewById(R.id.text2)
        val button: Button = findViewById(R.id.button2)
        button.setOnClickListener {
            text2.setText(count.incrementCounter())
        }
    }

    // 5 задание, пункт b
    private fun initChange() {
        val testObj = Test.newCopy
        val text3: TextView = findViewById(R.id.text3)
        val button: Button = findViewById(R.id.button3)
        button.setOnClickListener {
            text3.setText(testObj.incrementCounter())
        }
    }

    // 5 задание, пункт c
    private fun testCycle() {
        for (i in 1..5) {
            print(i)
        }
        for (i in 10 downTo 5) {
            print(i)
        }
        for (i in 2..10 step 2) {
            print("Step $i")
        }
    }
}

// 5 задание, пункт а
data class Counters(var word: String, var counter: Int) {
    init {
        word = "Count "
    }

    fun incrementCounter() = word + counter++
}

// 5 задание, пункт b
object Test {
    var newCopy = Counters(" ", 0).copy(counter = 10)
}