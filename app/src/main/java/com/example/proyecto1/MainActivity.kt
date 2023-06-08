package com.example.proyecto1

fun ola(){
    println("HOLA")
    // VALORES SON CONSTANTES Y VARIABLES NO
    /* Valores y variables numericos*/
    // mejor poner esto para identificar el tipo ints
    val edad:Int = 30
    // si necesitamos mas espacio (los ints tienen limite)
    val edad2:Long = 1234567890
    // para floats hay que poner 'f'
    val numeroF:Float = 3.0f
    // un double es un float con mas decimales
    val numeroFD:Double = 40.1222222222222223

    /* Variables alfanumericas */
    // caracteres variables char 1 caracter
    val charExample1:Char = 'c'
    val charExample2:Char = '@'
    // strings
    val stringEx1:String = "ASIER"

    /* Variables booleanas */
    var booleanEx:Boolean = true
    println(booleanEx)
    println("hola me llamo $stringEx1")

}

fun main(){
    var numero = variableNumericaFloat(3)
    println(numero)
    var numero2 = variableNumericaInt(5.0f)
    println(numero2)
}
fun variableNumericaFloat(numero:Int):Float{
    /* Funciones */
    return numero.toFloat()
}

// Un modo de reducir el tamaño de funciones para funciones pequeñas
fun variableNumericaInt(numero:Float) = numero.toInt()