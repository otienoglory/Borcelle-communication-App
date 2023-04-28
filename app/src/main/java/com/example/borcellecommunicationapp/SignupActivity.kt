package com.example.borcellecommunicationapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignupActivity : AppCompatActivity() {
    lateinit var mtxtusername:TextView
    lateinit var mtxtage:TextView
    lateinit var mtxtphonenumber:TextView
    lateinit var mtxtemail:TextView
    lateinit var mtxtpostemployed:TextView
    lateinit var mtxtpassword:TextView
    lateinit var mtxtconfirmpassword:TextView
    lateinit var mbtnsignup:Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        mbtnsignup=findViewById(R.id.mBtnRegister)
        mtxtusername=findViewById(R.id.inputUsername)
        mtxtage=findViewById(R.id.inputAge)
        mtxtphonenumber =findViewById(R.id.inputPhoneNumber)
        mtxtemail =findViewById(R.id.inputemail)
        mtxtpostemployed =findViewById(R.id.inputPostemployed)
        mtxtpassword =findViewById(R.id.inputPassword)
        mtxtconfirmpassword =findViewById(R.id.inputconfirmpassword)
    }
}





