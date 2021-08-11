package com.proway.projetofragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.proway.projetofragments.R
import com.proway.projetofragments.adapter.AdapterRecyclerView
import com.proway.projetofragments.model.Produtos


class QuartoFragmentParaListagem : Fragment() {

    lateinit var recyclerView : RecyclerView

    val listaProdutos = mutableListOf<Produtos>(
        Produtos("Camisa", 50),
        Produtos("Jeans", 200),
        Produtos("Meias", 15),
        Produtos("Gorro", 30),
        Produtos("Luvas", 10),
        Produtos("Jaqueta", 150),


        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quarto_para_listagem, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadComponents(view)
    }

    private fun loadComponents(view: View) {
        recyclerView = view.findViewById(R.id.RecyclerViewNoFragment4)
        recyclerView.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = AdapterRecyclerView(listaProdutos)
    }

}