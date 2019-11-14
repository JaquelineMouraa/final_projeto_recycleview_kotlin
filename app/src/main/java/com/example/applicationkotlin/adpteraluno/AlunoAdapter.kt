package com.example.applicationkotlin.adpteraluno

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.applicationkotlin.Aluno
import com.example.applicationkotlin.MainActivity
import com.example.applicationkotlin.R
import kotlinx.android.synthetic.main.aluno_list_item.*

class AlunoAdapter() : Adapter<AlunoAdapter.AlunoViewHolder>()  {

    private val listAlunos : MutableList<Aluno> = ArrayList()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): AlunoAdapter.AlunoViewHolder {
        return AlunoViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.aluno_list_item, p0, false))
    }

    override fun getItemCount(): Int {
        return listAlunos.size
    }

    override fun onBindViewHolder(p0: AlunoViewHolder, pos: Int) {
        var aluno = listAlunos[pos]
        p0.tvNomeAluno.text = aluno.nome

        p0.btExcluir.setTag(aluno)

        p0.btExcluir.setOnClickListener{
            MainActivity.listAlunos.remove(p0.btExcluir.getTag() as Aluno)
            atualizarLista(MainActivity.listAlunos)
        }
    }

    public fun atualizarLista(listaAlunos : List<Aluno>){
        listAlunos.clear()
        listAlunos.addAll(listaAlunos)
        notifyDataSetChanged()
    }

    class AlunoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvNomeAluno = itemView.findViewById(R.id.tvNomeAluno) as TextView
        val btExcluir = itemView.findViewById(R.id.ibExcluir) as ImageButton
    }
}