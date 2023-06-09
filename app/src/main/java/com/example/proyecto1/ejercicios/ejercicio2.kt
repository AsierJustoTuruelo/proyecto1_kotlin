package com.example.proyecto1.ejercicios

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

// con ifs
fun ticketPrice2(age: Int, isMonday: Boolean): Int {
    // Fill in the code.
    if (age >= 0 && age <= 12){
        return 15
    } else if (age >= 13 && age <= 60){
        if (isMonday == true){
            return 25
        } else{
            return 30
        }
    } else if (age > 60 && age <= 100){
        return 20
    } else{
        return -1
    }
}

// con when
fun ticketPrice(age: Int, isMonday: Boolean): Int {
    // Fill in the code.
    when(age){
        in 0..12 -> return 15
        in 13..60 -> if (isMonday){
            return 25
        } else{
            return 30
        }
        in 61..100 -> return 20
        else -> return -1
    }
}