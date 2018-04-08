package koty

import java.util.*

fun main(xxx: Array<String>) {
    checkIfHuman()
}

fun nowyProgram() {
    var correct = false
    while (!correct) {
        println("napisz coś")
        val input = readLine()!!
        correct = checkInput(input)
    }
}

fun checkInput(input: String): Boolean {
    if (input == "coś") {
        println("bravo!")
        return true
    } else if (input == "COŚ") {
        println("wyłącz Caps Locka!")
    } else if (input == "kurwa" || input == "chuj") {
        println("nie klnij!")
    } else if (input == "coś innego") {
        println("napisz mi coś")
    } else {
        println("fe!")
    }
    return false
}

fun readNumber(): Int {
    println("podaj liczbę")
    val input = readLine()!!
    try {
        val number = input.toInt()
        println("podałeś liczbę: " + number)
        return number
    } catch (e: NumberFormatException){
        println("toś chuj")
        return readNumber()
    }
}

fun checkIfHuman() {
    val number = Random().nextInt(1000)
    var correct = false
    while (!correct) {
        println("powtórz: " + number)
        val userNumber = readNumber()
        if (userNumber == number) {
            correct = true
        }
    }
    println("Dziękuję")
}