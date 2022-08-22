package com.example.otabaadrian

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var ButtonCal:Button
    lateinit var Buttonweb:Button
    lateinit var ButtonIntent:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButtonCal=findViewById(R.id.Btn_Calc)
        Buttonweb=findViewById(R.id.Btn_Web)
        ButtonIntent=findViewById(R.id.Btn_Intent)

        ButtonCal.setOnClickListener {
            val intent=Intent(this,CalculatorActivity::class.java)
            startActivity(intent)
        }
        Buttonweb.setOnClickListener {
            val web=Intent(this,CalculatorActivity::class.java)
            startActivity(web)
        }
        ButtonIntent.setOnClickListener {
            val cal=Intent(this,CalculatorActivity::class.java)
            startActivity(cal)
        }
    }
}