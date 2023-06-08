package com.example.proyecto1

fun main(){
    obtenerMes(4)
}

// USO DEL WHEN
fun obtenerMes(mes:Int):String{
    when(mes){
        1->println("Enero")
        2->println("Febrero")
        3->println("Marzo")
        4->println("Abril")
        5->println("Mayo")
        6->println("Junio")
        7->println("Julio")
        8->println("Agosto")
        9->println("Septiembre")
        10->println("Octubre")
        11->println("Noviembre")
        12->println("Diciembre")
        else-> println("Mes no existe")

    }

    return ""
}