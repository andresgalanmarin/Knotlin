package com.example.cursoknotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Leccion 4
        sentenciaWhen()
    }
    /*
    Aqui hablamos de la sentencia When
     */
    fun sentenciaWhen() {

        //When con Strig
        val country = "Mexico"

        when (country) {
            "España" ,"Mexico", "Perú", "Colombia", "Argentina"-> {
                println("El idioma es español")
            } "EEUU" -> {
                println("El idioma es inglés")
            } "Francia" -> {
                println("El idioma es francés")
            } else -> {
                println("No conocemos el idioma")
            }
        }

        //when con int
        val age = 44

        when (age) {
            0, 1, 2 -> {
                println("Eres un bebé")
            } in 3..10 -> {
                println ("Eres un niño")
            } in 11..17 -> {
                println("Eeres un adolescente")
            } in 18..69 -> {
                println ("Eres un adulto")
            } in 70..99 -> {
                println("Eres un anciano")
            } else -> {
                println ("OMG!! ")
            }
        }
    }
}