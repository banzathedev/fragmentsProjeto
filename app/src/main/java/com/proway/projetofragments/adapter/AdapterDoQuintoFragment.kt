package com.proway.projetofragments.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.proway.projetofragments.R
import com.proway.projetofragments.model.Carro
import com.proway.projetofragments.model.Produtos

class AdapterDoQuintoFragment<T>(private val listOf: MutableList<T>) :
    RecyclerView.Adapter<GenericViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenericViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return GenericViewHolder(view)
    }

    override fun onBindViewHolder(holder: GenericViewHolder, position: Int) {
        listOf[position].apply {
            holder.bind(this)
        }
    }

    override fun getItemCount(): Int {
      return  listOf.size
    }


}

class GenericViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val titleTextView: TextView = itemView.findViewById(R.id.itemNameOrModel)


    fun <T> bind(model: T) {
        when (model) {
            is Produtos -> {
                titleTextView.text = model.nome

            }
            is Carro -> {
                titleTextView.text = model.modelo

            }
        }

    }


}
