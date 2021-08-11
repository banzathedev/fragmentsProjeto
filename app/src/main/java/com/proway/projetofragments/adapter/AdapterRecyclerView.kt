package com.proway.projetofragments.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.proway.projetofragments.R
import com.proway.projetofragments.model.Produtos

class AdapterRecyclerView( val productsLista: MutableList<Produtos>) : RecyclerView.Adapter<produtosViewHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): produtosViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return produtosViewHolder((itemView))
    }

    override fun onBindViewHolder(holder: produtosViewHolder, position: Int) {
        productsLista[position].apply {
            holder.bind(this)

        }
    }

    override fun getItemCount(): Int {
        return productsLista.size
    }


}

class produtosViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var name = view.findViewById<TextView>(R.id.itemName)
    fun bind(produtos: Produtos) {
        name.text = produtos.nome
        }

    }

