package koty

fun main(xxx: Array<String>) {
    println("napisz coś")
    val input = readLine()
    if (input == "coś") {
        println("bravo!")
    } else if (input == "COŚ") {
        println("wyłącz Caps Locka!")
    } else if (input == "kurwa" || input == "chuj") {
        println("nie klnij!")
    } else if (input == "chuj") {
        println("chyba ty!")
    } else {
        println("fe!")
    }
}