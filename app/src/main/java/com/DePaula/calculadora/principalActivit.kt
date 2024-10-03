package com.DePaula.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PrincipalActivity : AppCompatActivity(){


//var nome_aplicativo = "minha calculadora
    var nome_aplicativo = "minha calculadora"
    var nome_aplicativo_string: String= "minha calculadora"
    val valor_inteiro: Int = 1250
    val  valor_com_ponto: Float = 1000F
    val aprovado: Boolean = false /// true ou false somente
    val sigla_do_app: String = "C" /// só permite uma letra, com aspas simples


     val nomeAplicativo: String = "minha claculadora"
    // const => faz com que a variavel não seja alterada depois


    override fun onCreate(savedInstanceState: Bundle?) {

        "10".also { nome_aplicativo_string = it }


        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


    val btnCalcular:Button = findViewById(R.id.btnCalcular)

    btnCalcular. setOnClickListener {
        val text = "Olá Otávio"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(this, text, duration) // in Activity
        toast.show()

    }


    }
    fun eventoClikBotaoCalcular(){



    }

}

