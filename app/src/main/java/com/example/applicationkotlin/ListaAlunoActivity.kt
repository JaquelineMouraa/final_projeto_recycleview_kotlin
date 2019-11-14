package com.example.applicationkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
//import androidx.appcompat.app.AlertController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.applicationkotlin.adpteraluno.AlunoAdapter
import kotlinx.android.synthetic.main.activity_main_list.*

class ListaAlunoActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var mDialogView: View
    private lateinit var adapter : AlunoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_list)

        var txtMessage = findViewById<TextView>(R.id.txtViewList)

        adapter = AlunoAdapter()


        recyclerView = findViewById<RecyclerView>(R.id.recyclerViewList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        floatingButton.setOnClickListener{
            val intententer2: Intent = Intent (this, RegistroAlunoActivity::class.java)
            startActivity(intententer2)
        }
    }

    override fun onResume() {
        super.onResume()
        adapter.atualizarLista(MainActivity.listAlunos)
    }

}


