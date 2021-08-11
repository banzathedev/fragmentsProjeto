package com.proway.projetofragments.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.proway.projetofragments.R
import com.proway.projetofragments.adapter.AdapterDoQuintoFragment
import com.proway.projetofragments.adapter.AdapterRecyclerView
import com.proway.projetofragments.model.Carro
import com.proway.projetofragments.model.Produtos


class QuintoFragment : Fragment() {
    lateinit var recyclerView: RecyclerView

    var parametroTipoLista: Int = 0


    override fun onAttach(context: Context) {
        super.onAttach(context)
        arguments?.getInt("tipo_lista")?.let {
            parametroTipoLista = it
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quinto, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var listDe = mutableListOf<Any>()
        if (parametroTipoLista == TipoLista.PRODUTOS.id) {
            listDe = mutableListOf(
                Produtos("Jeans", 200),
                Produtos("Blusa", 200),
                Produtos("Camisa", 200),
                Produtos("Gorro", 200),
                Produtos("Luva", 200),
                Produtos("Jaqueta", 200),
            )
        } else if (parametroTipoLista == TipoLista.CARROS.id) {
            listDe = mutableListOf(
                Carro("Gol", 2020),
                Carro("Celta", 2020),
                Carro("Marajó", 2020),
                Carro("Opala", 2020),
                Carro("Monza", 2020),
                Carro("Onix", 2020),
                Carro("Fusca", 2020),
            )
        }
        recyclerView = view.findViewById(R.id.RecyclerViewDoQuintoFrag)
        recyclerView.layoutManager =
            LinearLayoutManager(requireContext())
        recyclerView.adapter = AdapterDoQuintoFragment(listDe)
    }


    companion object {

        fun newInstance(tipoLista: TipoLista): QuintoFragment {
            return QuintoFragment().apply {
                arguments = Bundle().apply {
                    putInt("tipo_lista", tipoLista.id)
                }
            }
        }
    }

}

enum class TipoLista(val id: Int) {
    PRODUTOS(1),
    CARROS(2)
}