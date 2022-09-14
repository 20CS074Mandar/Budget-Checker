package com.example.gdscapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.log

class BudgetChecker : AppCompatActivity() {
    private lateinit var tvPrice:TextView
    private lateinit var tvTvName:TextView
    private lateinit var edtBudget: EditText
    private lateinit var btnCheckStatus:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_budget_checker)

        tvPrice = findViewById(R.id.tVPrice)
        tvTvName=findViewById(R.id.tvTvName)
        edtBudget=findViewById(R.id.edtBudget)
        btnCheckStatus=findViewById(R.id.btnCheckStatus)
        tvTvName.text="Android TV 11 inches"
        tvPrice.text="100"
//        var price:Int=tvPrice.toString().toInt()
//        var budget:Int=edtBudget.text.toString().toInt()

        var price:Int=0
        price=Integer.parseInt(tvPrice.text.toString())

        btnCheckStatus.setOnClickListener(View.OnClickListener {
            var budget:Int=0
            if(edtBudget.text.toString().isNullOrEmpty())
            {
                budget=0
            }
            else
            {
                budget=Integer.parseInt(edtBudget.text.toString())
            }
            if(price<=budget)
            {
                Toast.makeText(this,"Lelel LeLe",Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this,"Aisa Kichke lafa marunga na!!",Toast.LENGTH_SHORT).show()
            }
        })


    }
}