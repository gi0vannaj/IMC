package com.example.imc20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declaraçao de variavel
        //var x = 10 criei e inicializei e posso mudar, assim criou-se uma constante
        //val x= 10 criei, inicializei mas nao posso mudar o valor pois assim é uma constante

        //crinado as instancias das View para que possam ser manipuladas em kotlin
        val editTextPeso = findViewById<EditText>(R.id.edit_peso)
        val editTextAltura = findViewById<EditText>(R.id.edit_altura)
        val buttonCalcular = findViewById<Button>(R.id.button_calcular)
        val textViewResultado = findViewById<TextView>(R.id.text_view_resultado)

        //adicionando evento de um ouvinte de click no botao
        buttonCalcular.setOnClickListener{
            if (editTextPeso.text.isEmpty()){
                editTextPeso.error = "peso é obrigatorio"
            }else if(editTextAltura.text.isEmpty()){
                editTextAltura.error = "altura é obrigatorio"
            }else{
                val peso = editTextPeso.text.toString().toInt()
                val altura = editTextAltura.text.toString().toDouble()

                val imc = peso/(altura* altura)

                textViewResultado.text =String.format("%.1f",imc)
            }

        }


        }

    }
