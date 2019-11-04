package com.example.applicationkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main_login.*

class MainActivityLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)

        val edTxtLogin = findViewById<EditText>(R.id.edTxtLogin)
        val edTxtSenha = findViewById<EditText>(R.id.edTxtSenha)
        val btnEntrar = findViewById<Button>(R.id.btnEntrar)

        btnEntrar.setOnClickListener {
            val intententer:Intent = Intent (this, MainActivityLogin2::class.java)

            intententer.putExtra("Login", edTxtLogin.text.toString())
            intententer.putExtra("Senha", edTxtSenha.text.toString())

            startActivity(intententer)
        }

        val btnCancelar = findViewById<Button>(R.id.btnCancelar)
        btnCancelar.setOnClickListener {
            finish()
        }
    }

}
