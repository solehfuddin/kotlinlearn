package FunctionalProgramming

fun main() {
    val msgVal = "Hello lambda"

    printMsg(msgVal)
    println(countMsg(msgVal))
}

val printMsg = {msg : String -> println(msg)}
val countMsg = {msg : String -> msg.length}