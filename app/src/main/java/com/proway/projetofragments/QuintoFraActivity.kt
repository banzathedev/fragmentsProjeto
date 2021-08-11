package com.proway.projetofragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.proway.projetofragments.fragments.QuintoFragment
import com.proway.projetofragments.fragments.TipoLista

class QuintoFraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quinto_fra)
        findViewById<Button>(R.id.botaoProdutos).apply {
            setOnClickListener {
                replaceFrag(QuintoFragment.newInstance(TipoLista.PRODUTOS))
            }
        }


        findViewById<Button>(R.id.botaoCarros).apply {
            setOnClickListener {
                replaceFrag(QuintoFragment.newInstance(TipoLista.CARROS))
            }
        }

    }

    private fun replaceFrag(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.containerQuintoFrag, fragment)
            .commitNow()
    }
    }
