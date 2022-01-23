package mx.com.turoialkt

class Menu {

    fun mostrarMenu(){
        var numero:Int
        do {
            println("Escogé una opción")
            println("1. Suma")
            println("2. Resta")
            println("3. Multiplicación")
            println("4. División")
            println("5. Salir")
            numero = readLine()!!.toInt()

            when(numero){
                1 ->{
                    sumar()
                }
                2 -> restar()
                3 -> multiplicar()
                4 -> dividir()


            }

        } while(numero != 5)  //(numero !in 1..100) // numero < 1 || numero > 100
        println("Gracias")
    }

    fun sumar(){
        println("Introduce un número")
        val numA = readLine()!!.toString().toFloat();
        println("Introduce el segundo número")
        val numB = readLine()!!.toString().toFloat();
        println("La suma es: " + (numA + numB))
    }

    fun restar(){
        println("Introduce un número")
        val numA = readLine()!!.toString().toFloat();
        println("Introduce el segundo número")
        val numB = readLine()!!.toString().toFloat();
        println("La resta es: " + (numA - numB))
    }

    fun multiplicar(){
        println("Introduce un número")
        val numA = readLine()!!.toString().toFloat();
        println("Introduce el segundo número")
        val numB = readLine()!!.toString().toFloat();
        println("La multiplicación es: " + (numA * numB))
    }

    fun dividir(){
        println("Introduce un número")
        val numA = readLine()!!.toString().toFloat();
        println("Introduce el segundo número")
        val numB = readLine()!!.toString().toFloat();
        println("La división es: " + (numA / numB))
    }
}