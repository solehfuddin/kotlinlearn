package FunctionalProgramming

//contoh penggunaan fungsi let
//fun main() {
//    val msg : String? = null
//    msg?.let {
//        val len = it.length * 2
//        val text = "Text length : $len"
//        println(text)
//    } ?: run {
//        val text = "Message is null"
//        println(text)
//    }
//}

//conteoh penggunaan fungsi also
fun main() {
    val text = "Hello soleh"
    val result = text.also {
        println("text len : ${it.length}")
    }

    println("Text : $result")
}