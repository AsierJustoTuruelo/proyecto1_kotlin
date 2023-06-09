package com.example.proyecto1

fun main(){
    var name:String? = "Asier"
    var nulo:String? = null
    println(name?.get(3) ?: "Es nuelo wey")
    println(nulo?.get(3) ?: "Es nuelo wey")

}