package com.proway.projetofragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.proway.projetofragments.fragments.PrimeiroFragment
import com.proway.projetofragments.fragments.QuartoFragmentParaListagem
import com.proway.projetofragments.fragments.SegundoFragment

class MainActivity2paraExec2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity2para_exec2)

        supportFragmentManager.beginTransaction()
            .replace(R.id.containerUp1, PrimeiroFragment())
            .commitNow()
        supportFragmentManager.beginTransaction()
            .replace(R.id.containerUp2, SegundoFragment.newInstance("Nome por param"))
            .commitNow()
        supportFragmentManager.beginTransaction()
            .replace(R.id.containerDonw1, QuartoFragmentParaListagem())
            .commitNow()
    }
}