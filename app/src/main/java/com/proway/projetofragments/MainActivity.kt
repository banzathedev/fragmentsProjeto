package com.proway.projetofragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.proway.projetofragments.fragments.PrimeiroFragment
import com.proway.projetofragments.fragments.SegundoFragment
import com.proway.projetofragments.fragments.TerceiroFragment

class MainActivity : AppCompatActivity() {
    private var tipoFragment = TipoFragment.PRIMEIRO
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PrimeiroFragment())
                .commitNow()

        findViewById<Button>(R.id.btnfrag1).apply {
            setOnClickListener {
               replaceFrag(PrimeiroFragment())
            }
        }
        findViewById<Button>(R.id.btnfrag2).apply {
            setOnClickListener {
                replaceFrag(SegundoFragment())
            }
        }
        findViewById<Button>(R.id.btnfrag3).apply {
            setOnClickListener {
                replaceFrag(TerceiroFragment())
            }
        }
        findViewById<Button>(R.id.novaActivity).apply {
            setOnClickListener {
              val intent =  Intent(context, NovaActivity::class.java)
                startActivity(intent)
            }
        }

    }
    private fun replaceFrag(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow()
    }
}

enum class TipoFragment{
    PRIMEIRO,
    SEGUNDO
}