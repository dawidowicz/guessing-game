package koty.calc


fun main(xxx: Array<String>) {
    println("podaj liczbę")
    var input = readLine() !!
    val number1 = input.toInt()
    println("podaj rodzaj operacji: +, -, *, /")
    val operator = readLine() !!
    println("podaj drugą liczbę")
    input = readLine() !!
    val number2 = input.toInt()
    var result = 0
    if (operator == "+") {
        result = number1 + number2
        println(result)
    } else if (operator == "-") {
        result = number1 - number2
        println(result)
    } else if (operator == "/") {
        result = number1 / number2
        println(result)
    } else if (operator == "*") {
        result = number1 * number2
        println("wynik: " + result)
    }
    println("podaj rodzaj operacji: +, -, *, /")
    val operator2 = readLine() !!
    println("podaj trzecią liczbę")
    input = readLine() !!
    val number3 = input.toInt()
    if (operator2 == "+") {
        println("wynik: " + (result + number3))
    } else if (operator2 == "-") {
      println("wynik: " + (result - number3))
    } else if (operator2 == "/") {
       println("wynik: " + (result / number3))
    } else if (operator2 == "*") {
        println("wynik: " + (result * number3))
    }
}

