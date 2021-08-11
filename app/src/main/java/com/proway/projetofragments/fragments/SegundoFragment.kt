package com.proway.projetofragments.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.proway.projetofragments.R


class SegundoFragment : Fragment() {

        var nomePorParam: String = ""

    override fun onAttach(context: Context) {
        super.onAttach(context)
        arguments?.getString("chave_param")?.let{
            nomePorParam = it
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_segundo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.nameToShow).apply {
            text = nomePorParam
        }
    }

    companion object {
        fun newInstance(parametro : String): SegundoFragment{
            return SegundoFragment().apply {
                arguments = Bundle().apply {
                    putString("chave_param", parametro)
                }
            }
        }
    }
}

