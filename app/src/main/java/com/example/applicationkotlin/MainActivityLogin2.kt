package com.example.applicationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivityLogin2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login2)

        val Logintxt = findViewById<TextView>(R.id.txtImport)
        Logintxt.text = intent.getStringExtra("Login")

        val Senhatxt = findViewById<TextView>(R.id.txtSenha)
        Senhatxt.text = intent.getStringExtra("Senha")
    }
}
