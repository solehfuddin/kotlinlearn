//fun main() {
//    val text = "Soleh"
//    println("Karakter pertama adalah ${text[0]}")
//
//    for (char in text)
//    {
//        print("$char ")
//    }
//}

fun main() {
    val name = "Unicode : \u00A9"
    println(name)

    val line = """
        Baris 1
        Baris 2
        Baris 3
    """.trimIndent()
    println(line)

    //String template
    println("Office ${if (5 > 7) "Udah buka" else "Masih nutup"}")
}