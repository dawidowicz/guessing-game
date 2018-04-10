package koty.calc


fun main(xxx: Array<String>) {
    println("Podaj pierwszą liczbę")
    var input = readLine() !!
    val number1 = input.toInt()
    println("Podaj rodzaj operacji: +, -, *, /")
    val operator = readLine() !!
    println("Podaj drugą liczbę")
    input = readLine() !!
    val number2 = input.toInt()
    var result = 0
    if (operator == "+") {
        result = number1 + number2
        println("Cząstkowy wynik: " + result)
    } else if (operator == "-") {
        result = number1 - number2
        println("Cząstkowy wynik: " +result)
    } else if (operator == "/") {
        result = number1 / number2
        println("Cząstkowy wynik: " +result)
    } else if (operator == "*") {
        result = number1 * number2
        println("Cząstkowy wynik: " + result)
    }
    println("Podaj rodzaj operacji: +, -, *, /")
    val operator2 = readLine() !!
    println("Podaj trzecią liczbę")
    input = readLine() !!
    val number3 = input.toInt()
    if (operator2 == "+") {
        println("Wynik: " + (result + number3))
    } else if (operator2 == "-") {
      println("Wynik: " + (result - number3))
    } else if (operator2 == "/") {
       println("Wynik: " + (result / number3))
    } else if (operator2 == "*") {
        println("Wynik: " + (result * number3))
    }
}

