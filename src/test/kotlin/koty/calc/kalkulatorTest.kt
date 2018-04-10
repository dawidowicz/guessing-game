package koty.calc

import io.kotlintest.matchers.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.data_driven.data
import org.jetbrains.spek.data_driven.on
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class kalkulatorTest : Spek({

    val first = 24
    val second = 3
    val third = 5

    fun signToString(sign: String): String {
        return when(sign) {
            "+" -> "add"
            "-" -> "remove"
            "/" -> "divide"
            "*" -> "multiply"
            else -> "UNKNOWN SIGN"
        }

    }

    given("calculator") {
        val data = arrayOf(
                data("+", "+", 27, 32),
                data("+", "-", 27, 22),
                data("+", "*", 27, 135),
                data("+", "/", 27, 5),
                data("-", "+", 21, 26),
                data("-", "-", 21, 16),
                data("-", "*", 21, 105),
                data("-", "/", 21, 4),
                data("*", "+", 72, 77),
                data("*", "-", 72, 67),
                data("*", "*", 72, 3600),
                data("*", "/", 72, 14),
                data("/", "+", 8, 13),
                data("/", "-", 8, 3),
                data("/", "*", 8, 40),
                data("/", "/", 8, 1)
        )

        on("%s and: %s", with = *data) { sign1, sign2, partial, result ->
            val console = System.out
            val out = ByteArrayOutputStream()
            System.setIn("$first\n$sign1\n$second\n$sign2\n$third".byteInputStream())
            System.setOut(PrintStream(out))
            main(emptyArray())
            System.setOut(console)

            val output = out.toString().split("\r\n")

            it("Should ask for first number") {
                output[0] shouldEqual "Podaj pierwszą liczbę:"
            }

            it("Should ask for first operator") {
                output[1] shouldEqual "Podaj rodzaj operacji: +, -, *, /:"
            }

            it("Should ask for second number") {
                output[2] shouldEqual "Podaj drugą liczbę:"
            }

            it("Should print partial result") {
                output[3] shouldEqual "Cząstkowy wynik: $partial"
            }

            it("Should ask for second operator") {
                output[4] shouldEqual "Podaj rodzaj operacji: +, -, *, /:"
            }

            it("Should ask for third number") {
                output[5] shouldEqual "Podaj trzecią liczbę:"
            }

            it("Should print final result") {
                output[6] shouldEqual "Wynik: $result"
            }

        }
    }


})
