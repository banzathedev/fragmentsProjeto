package com.proway.projetofragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.proway.projetofragments.fragments.PrimeiroFragment
import com.proway.projetofragments.fragments.SegundoFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

            supportFragmentManager.beginTransaction()
                .replace(R.id.conteiner1, PrimeiroFragment())
                .commitNow()

        supportFragmentManager.beginTransaction()
            .replace(R.id.conteiner2, SegundoFragment())
            .commitNow()

    }
}