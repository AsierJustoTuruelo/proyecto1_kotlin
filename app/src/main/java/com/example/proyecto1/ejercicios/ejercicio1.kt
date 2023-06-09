package com.example.proyecto1.ejercicios

// Ejercicio 1

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    // Fill in the code.
    if (numberOfMessages >= 100){
        println("You have 99+ notifications")
    }
    else{
        println("You have $numberOfMessages notifications")
    }
}