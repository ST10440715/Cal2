package com.ST10440715.calculator2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.time.times

private operator fun Int.rangeTo(intnum2: String?): IntRange {



}

class MainActivity : AppCompatActivity() {

    var etnum1 : EditText? = null
    var etnum2 : EditText? = null
    var tvDisp : TextView? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etnum1 = findViewById(R.id.etnum1)
        etnum2 = findViewById(R.id.etnum2)
        tvDisp = findViewById(R.id.tvDisp)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener{add()}

        val btnSub = findViewById<Button>(R.id.btnSub)
        btnSub.setOnClickListener{sub()}

        val btnMul = findViewById<Button>(R.id.btnMul)
        btnMul.setOnClickListener{mul()}

        val btnDiv = findViewById<Button>(R.id.btnDiv)
        btnDiv.setOnClickListener{div()}

        val btnSqr = findViewById<Button>(R.id.btnSqr)
        btnSqr.setOnClickListener{sqr()}

        val btnPow = findViewById<Button>(R.id.btnPow)
        btnPow.setOnClickListener{pow()}

        val btnNexSc = findViewById<Button>(R.id.btnNextScreen)
        btnNexSc.setOnClickListener {
            // call the next screen
            val intent = Intent (this,MainActivity2::class.java)
            // start your next activity
            startActivity(intent)
        }

    }
    private fun add(){}
    private fun sub(){}
    private fun mul(){}
    private fun div(){}

    private fun sqr(){}
    private fun pow() {
        var intnum1 = etnum1?.text?.toString()
        var intnum2 = etnum2?.text?.toString()
        var intAnswer: Int = 1

        for (i in 1.. intnum2) {
            intAnswer = intAnswer * intnum1
        }
        tvDisp?.text = intAnswer.toString()
    }
