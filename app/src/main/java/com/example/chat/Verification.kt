package com.example.chat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Verification : AppCompatActivity() {
    var number:String?=null
    private val num= findViewById<EditText>(R.id.editNumber)!!
    private val btn= findViewById<Button>(R.id.continueButton)!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification)
        btn.setOnClickListener {
            if(checknumber()){
                val phoneNumber=code
            }
        }

    }
    private fun checknumber():Boolean{
        number=num.text.toString().trim()
        if(number!!.isEmpty()){
            num.error="Field is Required"
            return false
        }
        else if(number!!.length<10){
            num.error="Number should be 10 in length"
            return false
        }
        else return true
    }
}