package FunctionalProgramming

fun main() {
    //Without nullable
//    val sumInvoke = sum.invoke(10, 10)
//    val sumOnly = sum(10, 10)
//
//    val multiplyInvoke = multiply.invoke(10, 10)
//    val multiplyOnly = multiply(10, 10)

    //With nullable
    val sumInvoke = sum?.invoke(10, 10)
    val sumOnly = sum!!(10, 10)

    val multiplyInvoke = multiply?.invoke(10, 10)
    val multiplyOnly = multiply!!(10, 10)

    println("Sum with invoke = $sumInvoke")
    println("Sum direct = $sumOnly")
    println("Multiply with invoke = $multiplyInvoke")
    println("Multiply direct = $multiplyOnly")
}

//Without nullable
//typealias Aritmatika = (Int, Int) -> Int

//With nullable
typealias Aritmatika = ((Int, Int) -> Int)?

val sum : Aritmatika = {valueA, valueB -> valueA + valueB}
val multiply : Aritmatika = {valueA, valueB -> valueA * valueB}