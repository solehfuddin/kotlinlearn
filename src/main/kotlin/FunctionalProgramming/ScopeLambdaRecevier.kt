package FunctionalProgramming

import java.lang.StringBuilder

//Contoh penggunaan fungsi run
//fun main() {
//    val text = "Hello"
//    val result = text.run {
//        val from = this
//        val to = this.replace("Hello", "Soleh")
//        "Replace value from $from to $to"
//    }
//    println(result)
//}

//contoh penggunaan fungsi with
//fun main() {
//    val msg = "Hello soleh"
//    with(msg) {
//        println("Output : $this")
//        println("Text length : ${this.length}")
//    }
//}

//contoh penggunaan fungsi apply
fun main() {
    val text = StringBuilder().apply {
        append("Hello ")
        append("Soleh")
    }

    println(text.toString())
}