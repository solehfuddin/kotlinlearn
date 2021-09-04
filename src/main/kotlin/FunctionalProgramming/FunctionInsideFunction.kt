package FunctionalProgramming

fun main() {
    println(sumInside(10, 20, 30))
}

fun sumInside(valA: Int, valB: Int, valC: Int) : Int {
    fun validateNumber(value: Int) {
        if (value == 0)
        {
            throw IllegalArgumentException("value must greater than 0")
        }
    }

    validateNumber(valA)
    validateNumber(valB)
    validateNumber(valC)
    return valA + valB + valC
}