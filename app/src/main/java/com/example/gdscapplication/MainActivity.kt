package com.example.gdscapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var nextButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextButton=findViewById(R.id.btnNext)
        nextButton.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,BudgetChecker::class.java))
        })
    }
}