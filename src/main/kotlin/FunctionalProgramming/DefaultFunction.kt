package FunctionalProgramming

fun main() {
    val title1 = getTitle()
    println(title1)

    val title2 = getTitle(title = "Bambang si hoki")
    println(title2)
}

private fun getTitle(title: String = "Type title here ...") : String {
    return title
}