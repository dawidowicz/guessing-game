package koty

fun main(xxx: Array<String>) {
    nowyProgram()
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
    } else {
        println("fe!")
    }
    return false
}