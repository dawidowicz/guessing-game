fun main(xxx: Array<String>) {
    println("Podaj nazwę użytkownika")
    val name = readLine() !!
    println("podaj hasło")
    var password = readLine()
    println("powtórz hasło")
    var password2 = readLine()
    if (password == password2)
    println("Konto o nazwie: " +name + " zostało założone")
    else if (password != password2)
        println("Podane hasła są różne! Nie założono konta!")
}