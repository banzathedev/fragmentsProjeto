package com.proway.projetofragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.proway.projetofragments.fragments.PrimeiroFragment
import com.proway.projetofragments.fragments.TerceiroFragment

class NovaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nova)

        supportFragmentManager.beginTransaction()
            .replace(R.id.containerNova1, PrimeiroFragment())
            .commitNow()

        supportFragmentManager.beginTransaction()
            .replace(R.id.containerNova2, TerceiroFragment())
            .commitNow()


    }
}