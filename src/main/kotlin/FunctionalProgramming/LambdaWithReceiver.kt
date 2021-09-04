package FunctionalProgramming

import java.lang.StringBuilder

fun main() {
    val msg = buildString {
        append("Hello")
        append("Bambang")
        append("Setio")
        append("Adji")
    }

    print("$msg")
}

fun buildString(action: StringBuilder.() -> Unit) : String {
    val sb = StringBuilder()
    sb.action()
    return sb.toString()
}