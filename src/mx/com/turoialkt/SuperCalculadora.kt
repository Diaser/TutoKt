package mx.com.turoialkt

import com.sun.org.apache.xpath.internal.operations.Bool

class SuperCalculadora {

    var cadena: String
    var regexString = "^\\d*\\.\\d+|\\d+\\.\\d*$".toRegex();

    constructor(cadena : String){
        this.cadena =  cadena
    }

    fun obtenerOoeracion(formula: String): String{

        for(i in 0 until formula.length){
            //println("i"+ i + " es " + formula[i])
            val cadena: String
            cadena = formula[i].toString();
            if(cadena.equals("(")){
                for(j in formula.length -1 downTo 0)
                    if(formula[j].toString().equals(")")) {
                        println(formula.substring(i + 1, j))
                        return formula.substring(i + 1, j)
                    }

            }
        }
            return ""
    }

    fun calcular(formula : String){
        var mutableList: MutableList<String> = mutableListOf()
        var numero = ""

        for((index, value) in formula.withIndex())
        {
            if(value.toString().equals("+") || value.toString().equals("-") || value.toString().equals("X") || value.toString().equals("/")){
                mutableList.add(numero)
                mutableList.add(value.toString())
                numero = ""

            }else{
                numero += value
            }
            if(index == formula.length-1 )
                mutableList.add(numero)
        }

        for((index, value) in mutableList.withIndex()){
            println("elemento "+ index + " is " + value)
        }
        operar(mutableList)

        //if(!formula.contains("(") || !formula.contains(")") )
    }

    private fun operar(lista: MutableList<String>){
        var resul: Double = 0.0
        for((index, value) in lista.withIndex()){
            if(index == 0 && toNumber(value))
                resul += value.toDouble()

            else if(toNumber(value)){
                when(lista[index-1]){
                    "+" -> resul += value.toDouble()
                    "-" -> resul -= value.toDouble()
                }
            }

        }
        println("Suma es : " + resul)
    }

    private fun sumar( numA : Double, numB: Double): Double{
        return numA
    }

    private fun restar( numA : Double, numB: Double): Double{
        return numA
    }
    private fun multiplicar( numA : Double, numB: Double): Double{
        return numA
    }
    private fun dividir( numA : Double, numB: Double): Double{
        return numA
    }
    private fun toNumber(number: String): Boolean{
        try{
            val num = number.toDouble();
            println("numero " + num)
            return true
        }catch (e: NumberFormatException){
            println("Message " + e.localizedMessage)
            return false
        }
    }

}