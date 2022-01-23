import mx.com.turoialkt.SuperCalculadora

fun main(args : Array<String>){
    println("Hola Esta es una calculadora en Kotlin \nIntroduce tu operación")
    val calculadora =  SuperCalculadora("");
    val str = readLine()!!.toString()

    calculadora.calcular(str)
}