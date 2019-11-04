package com.example.applicationkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main_registro.*

class MainActivityRegistro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_registro)

        val edTxtNome = findViewById<EditText>(R.id.edTxtNome)
        val edTxtCpf = findViewById<EditText>(R.id.edTxtCpf)
        val btnEntrar2 = findViewById<Button>(R.id.btnEntrar2)

        btnEntrar2.setOnClickListener {
            val intententer2:Intent = Intent (this, MainActivityRegistro2::class.java)

            intententer2.putExtra("Nome", edTxtNome.text.toString())
            intententer2.putExtra("Cpf", edTxtCpf.text.toString())

            startActivity(intententer2)
        }

        val btnCancelar2 = findViewById<Button>(R.id.btnCancelar2)
        btnCancelar2.setOnClickListener {
            finish()
        }
    }
}
