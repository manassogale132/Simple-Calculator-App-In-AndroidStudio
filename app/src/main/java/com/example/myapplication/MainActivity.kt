package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton.setOnClickListener {
            add()
            Toast.makeText(this,"Add Button is Clicked!",Toast.LENGTH_SHORT).show()
        }

        subButton.setOnClickListener {
            subtract()
            Toast.makeText(this,"Subtract Button is Clicked!",Toast.LENGTH_SHORT).show()
        }

        mulButton.setOnClickListener {
            multiply()
            Toast.makeText(this,"Multiply Button is Clicked!",Toast.LENGTH_SHORT).show()
        }

        divButton.setOnClickListener {
            divide()
            Toast.makeText(this,"Divide Button is Clicked!",Toast.LENGTH_SHORT).show()
        }
    }


    fun add(){
        if(isEmptyCheck()){
            val input1 = editTextNum1.text.toString().trim().toBigDecimal()
            val input2 = editTextNum2.text.toString().trim().toBigDecimal()
            ansWer.text = input1.add(input2).toString()
        }
    }

    fun subtract(){
        if(isEmptyCheck()){
            val input1 = editTextNum1.text.toString().trim().toBigDecimal()
            val input2 = editTextNum2.text.toString().trim().toBigDecimal()
            ansWer.text = input1.subtract(input2).toString()
        }
    }

    fun multiply(){
        if(isEmptyCheck()){
            val input1 = editTextNum1.text.toString().trim().toBigDecimal()
            val input2 = editTextNum2.text.toString().trim().toBigDecimal()
            ansWer.text = input1.multiply(input2).toString()
        }
    }

    fun divide(){
        if(isEmptyCheck()){
            val input1 = editTextNum1.text.toString().trim().toBigDecimal()
            val input2 = editTextNum2.text.toString().trim().toBigDecimal()
            ansWer.text = input1.divide(input2).toString()
        }
    }


    fun isEmptyCheck() : Boolean {
        var a = true;
        if(editTextNum1.text.toString().trim().isEmpty()){
            editTextNum1.error = "Enter Number 1"
            a = false
        }
        if(editTextNum2.text.toString().trim().isEmpty()){
            editTextNum2.error = "Enter Number 2"
            a = false
        }
        return a
    }

}