package com.proway.projetofragments.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.proway.projetofragments.R
import com.proway.projetofragments.model.Produtos

class AdapterDoQuintoFragment(val productsLista: MutableList<Produtos>) :
    RecyclerView.Adapter<shopViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): shopViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return shopViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: shopViewHolder, position: Int) {
        productsLista[position].apply {
            holder.bind(this)

        }
    }

    override fun getItemCount(): Int {
        return productsLista.size
    }


}

class shopViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var name = view.findViewById<TextView>(R.id.itemName)
    fun bind(produtos: Produtos) {
        name.text = produtos.nome
    }

}
