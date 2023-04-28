package com.example.borcellecommunicationapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    lateinit var txtusername:TextView
    lateinit var txtemail:TextView
    lateinit var txtpassword:TextView
    lateinit var mbtnlogin:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        txtusername=findViewById(R.id.inputUsername)
        txtemail = findViewById(R.id.inputemail)
        txtpassword =findViewById(R.id.inputPassword)
        mbtnlogin=findViewById(R.id.mBtnRegister)
    }
}




