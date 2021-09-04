package FunctionalProgramming

//contoh penerapan member reference
//fun main() {
//    val sum : (Int, Int) -> Int = ::countSum
//    println(sum(10, 10))
//}
//
//fun countSum(valA : Int, valB : Int) : Int {
//    return valA + valB
//}

//contoh penerapan function reference
//fun main() {
//    val numbers = 1.rangeTo(10)
//    //val result = numbers.filter(::isEvenNumbers)
//    val result = numbers.filter(Int::isEvenNumbers)
//    print("$result ")
//}
//
////fun isEvenNumbers(value : Int) = value % 2 == 0
//
//fun Int.isEvenNumbers() = this % 2 == 0

//contoh penerapan property reference
var msg = "Kotlin"

fun main() {
    println(::msg.name)
    println(::msg.get())

    ::msg.set("Kotlin academy")
    println(::msg.get())
}