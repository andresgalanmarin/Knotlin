package com.example.cursoknotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Leccion 4
        //sentenciaWhen()

        //Leccion 5
        //arrays()

        //Leccion 7
        //maps()

        //Leccion 8
        //loops()

        //Leccion 9
        //nullSafety()

        //Leccion 10
        //funciones()

        //Leccion 11
        classes()
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

    /*
    Aqui hablamos de array o arreglos
     */
    fun arrays() {

        val name = "Andres"
        val surname= "Galan"
        val company = "seedsfy"
        val age ="44"

        //creación de Array

        val myArray: ArrayList<String> = arrayListOf<String>()

        //Añadir datos de uno en uno
        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        //myArray.add(age)
        //myArray.add(age)

        println(myArray)

        //Añadir conjunto de datos
        myArray.addAll(listOf("Hola","Bienvenidos al tutorial"))

        println(myArray)

        //Acceso a datos de Array
        val myCompanay = myArray[2]
        println(myCompanay)

        //Modificacion de Datos de Array

        myArray[5] = "Suscríbete y activa la camapa"
        println(myArray)

        //Borrar datos de array
        myArray.removeAt(4)
        println(myArray)

        //Recorrer datos de Array

        myArray.forEach {
            println(it)
        }

        //Otras operaciones
        println(myArray.count())

        //myArray.clear()

        println(myArray.count())

        println(myArray.first())
        println(myArray.last())

    }

    /*
    Aqui vamos a hablar de mapas o diccionarios
     */
    fun maps() {

        var myMap: Map<String,Int> = mapOf()
        println(myMap)

        //Añadir valores

        myMap = mutableMapOf("Andres" to 1,"Pedro" to 2, "Sara" to 5)
        println(myMap)

        //Añadir un solo valor
        myMap["Ana"] = 7
        myMap.put("Maria",8)
        println(myMap)

        //Actualizar Datos
        myMap.put("Andres",3)
        myMap["Andres"] = 4
        myMap.put("Brais",3)
        println(myMap)

        //Acceso a Datos de maps o diccionarios
        println(myMap["Andres"])

        //Borrar datos
        myMap.remove("Andres")
        println(myMap)
    }

    /*
    Aqui hablaremos de bucles o loops
     */
    private fun loops () {

        //Bucles

        val myArray: List<String> = listOf("Hola", "Bienvenidos al tutorial", "Suscribete")
        val myMap: MutableMap<String, Int> = mutableMapOf("Brais" to 1, "Pedro" to 2, "Sara" to 5)

        // For

        for (myString in myArray) {

            println(myString)
        }

        for (myElement in myMap) {
            println("${myElement.key}->${myElement.value}")
        }

        for (x in 0..10) {
            println(x)
        }

        for (x in 0 until 10) {
            println(x)
        }

        for (x in 0..10 step 2) {
            println(x)
        }

        for (x in 10 downTo 0 step 3) {
            println(x)
        }

        val myNumericArray = (0..20)
        for (x in myNumericArray){
            println(x)
        }

        // While

        var x = 0

        while (x <= 10) {
            println (x)
            x += 2

        }


    }

    /*
    Aqui vamo a hablar de seguridad contra nulos llamada null safety
     */
    fun nullSafety() {
        var myString="MoureDev"
        //myString= null Daria error
        println(myString)

        //Variable null safety
        var mySafetyString: String? = "MoreDev null safety"
        mySafetyString = null
        println(mySafetyString)

        mySafetyString = "Suscribete"
        //println(mySafetyString)

        //Esto da error, lo comento. Es una redundancia pq siempre es null
        /*
        if (mySafetyString != null) {
            println (mySafetyString!!)
        } else {
            println (mySafetyString)
        }
        */
        println (mySafetyString)

        //Safe call
        println(mySafetyString?.length)

        mySafetyString?.let {
            println(it)
        } ?: run {
            println(this)
        }

    }

    /*
    Aqui hablamos de funciones
     */
    fun funciones () {

        sayHello()
        sayHello()
        sayHello()

        sayMyName("Andrés")
        sayMyName("Pedro")
        sayMyName("Sara")

        sayMyNameAndAge("Andres", 44)

        val sumResult = sumTwoNumber(10,5)
        println(sumResult)
        println (sumTwoNumber(10,5))

        println(sumTwoNumber(9,sumTwoNumber(3,7)))
    }

    //Función simple
    fun sayHello() {

        println("Hola!")
    }

    //Funciones con un parámetro de entrada
    fun sayMyName(name: String) {
        println("Hola mi nombre es $name")
    }

    //Funciones con un parámetro de entrada
    fun sayMyNameAndAge(name: String, edad: Int) {
        println("Hola mi nombre es $name y mi edad es $edad")
    }

    //Funciones con valor de retorno
    fun sumTwoNumber(firstNumber: Int, secondNumber: Int) : Int{
        val sum = firstNumber+secondNumber
        return sum
    }

    /*
    Aquí hablamos de clases u objetos
     */
    fun classes() {

        val andres = Programmer("Andres", 44, arrayOf(Programmer.Language.HTMl5,Programmer.Language.KOTLIN,Programmer.Language.PHP))
        println(andres.name)

        andres.age = 45
        andres.code()

        val sara= Programmer("Sara", 35, arrayOf(Programmer.Language.JAVA,Programmer.Language.SWIFT),
            arrayOf(andres))
        println(sara.name)
        sara.code()

        println("${sara.friends?.first()?.name} es amigo de ${sara.name}. ${sara.friends?.first()?.name} tiene ${sara.friends?.first()?.age} años")
    }

}