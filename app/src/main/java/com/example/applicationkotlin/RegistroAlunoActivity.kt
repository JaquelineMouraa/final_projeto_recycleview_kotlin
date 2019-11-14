package com.example.applicationkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_registro.*

class RegistroAlunoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_registro)

        btnCadastrar.setOnClickListener {
            var aluno = Aluno(
                edTxtNome.text.toString(),
                edTxtMatricula.text.toString(),
                edTxtCurso.text.toString(),
                edTxtSenha.text.toString()
                )

            MainActivity.listAlunos.add(aluno)

            Toast.makeText(this,"Aluno cadastrado",Toast.LENGTH_SHORT).show()
            clearText()
        }

        val btnCancelar2 = findViewById<Button>(R.id.btnCancelar2)
        btnCancelar2.setOnClickListener {
            finish()
        }
    }

    private fun clearText(){
        edTxtNome.setText("")
        edTxtMatricula.setText("")
        edTxtCurso.setText("")
        edTxtSenha.setText("")
    }
}
