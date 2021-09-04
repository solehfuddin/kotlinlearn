package FunctionalProgramming

fun main() {
    10.printInt()

    println("Hasil perkalian dari 20 * 2 = ${20.multiplyTwo()}")

    println("Hasil dari 10 / 2 = ${10.slice}")

    println("Hasil dari 100 / 2 = ${100.divTwo}")

    val valueNull : Int? = null
    println("Output value null = ${valueNull.divTwo}")
}

fun Int.printInt() {
   println("Output : $this")
}

fun Int.multiplyTwo() : Int {
    return this * 2
}

val Int.slice : Int
    get() = this / 2

//contoh nullable receiver type with safe and elvis operator
val Int?.divTwo : Int
    get() = this?.div(2) ?: 0