package com.proway.projetofragments.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.proway.projetofragments.R
import com.proway.projetofragments.model.Produtos

class AdapterDaListaDOFrag4(val produtosLista : MutableList<Produtos>): RecyclerView.Adapter<produtosViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): produtosViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return produtosViewHolder((itemView))
    }

    override fun onBindViewHolder(holder: produtosViewHolder, position: Int) {
        produtosLista[position].apply {
            holder.bind(this)

        }
    }

    override fun getItemCount(): Int {
        return produtosLista.size
    }
}
class produtosListaViewHolder(view: View): RecyclerView.ViewHolder(view) {
    var name = view.findViewById<TextView>(R.id.itemNameOrModel)
    fun bind(produtos: Produtos) {
        name.text = produtos.nome
    }

}