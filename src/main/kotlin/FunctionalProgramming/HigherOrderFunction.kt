package FunctionalProgramming


fun main() {
    printResult(10, sumVal)

    printResult(10){value ->
        value + value
    }
}

var sumVal : (Int) -> Int = {value -> value + value}

fun printResult(value : Int, sumVal: (Int) -> Int) {
    val result = sumVal(value)
    println(result)
}