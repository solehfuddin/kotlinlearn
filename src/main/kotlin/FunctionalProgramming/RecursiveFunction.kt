package FunctionalProgramming

fun main() {
    println("Nilai faktorial : ${factorial(3)}")
}

//fun factorial(i : Int): Int {
//    return if (i == 1){
//        i
//    } else {
//        i * factorial(i - 1)
//    }
//}

tailrec fun factorial(i : Int, result: Int = 1) : Int {
    val newResult = i * result
    return if (i == 1) {
        newResult
    }else {
        factorial(i - 1, newResult)
    }
}