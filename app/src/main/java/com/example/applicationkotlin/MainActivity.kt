package com.example.applicationkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    companion object{
        public val listAlunos : MutableList<Aluno> = ArrayList()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            val intent:Intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        btnRegistro.setOnClickListener {
            val intent2:Intent = Intent(this, ListaAlunoActivity::class.java)
            startActivity(intent2)
        }


    }
}
