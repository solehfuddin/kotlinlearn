fun main() {
    var text : String? = null
    text = "Bagol"

    if (text != null)
    {
        println(text.length)
    }

    val safecall : String? = null
    println(safecall?.length)

    val elviscall = safecall?.length ?: 10
    println(elviscall)
}