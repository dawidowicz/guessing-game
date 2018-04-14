package koty.calc


fun main(xxx: Array<String>) {
    println("Podaj pierwszą liczbę")
    var input = readLine() !!
    val number1 = input.toInt()
    val operator = getOperator()
    println("Podaj drugą liczbę")
    input = readLine() !!
    val number2 = input.toInt()
    var result = calculate(number1, number2, operator)
    println("Cząstkowy wynik: " + result)
    val operator2 = getOperator()
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

fun getOperator(): String {
    println("Podaj rodzaj operacji: +, -, *, /")
    val operator = readLine() !!
    return operator
}

fun calculate(number1: Int, number2: Int, operator: String): Int {
    if (operator == "+") {
        return number1 + number2
    } else if (operator == "-") {
        return number1 - number2
    } else if (operator == "/") {
        return number1 / number2
    } else if (operator == "*") {
        return number1 * number2
    }
    return 0
}