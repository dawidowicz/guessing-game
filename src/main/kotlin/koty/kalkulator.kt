package koty


fun main(xxx: Array<String>) {
    println("podaj liczbę")
    var input = readLine() !!
    val number1 = input.toInt()
    println("podaj rodzaj operacji: +, -, *, /")
    val operator = readLine() !!
    println("podaj drugą liczbę")
    input = readLine() !!
    val number2 = input.toInt()
    if (operator == "+") {
        println("wynik: " + (number1 + number2))
    } else if (operator == "-") {
        val result = number1 - number2
        println(result)
    } else if (operator == "/") {
        val result = number1 / number2
        println(result)
    } else if (operator == "*") {
        val result = number1 * number2
        println("wynik: " + result)
    }
}

