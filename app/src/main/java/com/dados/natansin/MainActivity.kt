package com.dados.natansin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dados.natansin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
                setContentView(binding.root)
        binding.botaoMudar.setOnClickListener{
            giraDado()
        }





    }


    private fun giraDado()
    {
        val dado = Dado (6)
        val Ldado = when (dado.dadogirado())
        {
            1-> R.drawable.dado1lados
            2-> R.drawable.dado2lado
            3-> R.drawable.dado3lado
            4-> R.drawable.dado4lado
            5-> R.drawable.dado5lado

            else-> R.drawable.dado6lado
        }
        binding.imgView.setImageResource(Ldado)
    }

}
    class Dado(private val ladododados: Int)
{

    fun dadogirado(): Int{
        return (1..ladododados).random()

    }

}