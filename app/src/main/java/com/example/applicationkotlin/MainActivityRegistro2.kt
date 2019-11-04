package com.example.applicationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivityRegistro2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_registro2)

        val  Nometxt = findViewById<TextView>(R.id.txtNome)
        Nometxt.text = intent.getStringExtra("Nome")

        val Cpftxt = findViewById<TextView>(R.id.txtCpf)
        Cpftxt.text = intent.getStringExtra("Cpf")
    }
}
