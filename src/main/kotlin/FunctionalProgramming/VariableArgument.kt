package FunctionalProgramming

fun main() {
    val input = sumNumber(10, 20, 30, 40)
    println("Total value is $input")

    val counter = countNumber(10,20,30,40)
    println("Length data is $counter")

    val solehOrder = myOrder(1,3,1,2, name = "Soleh")
    println(solehOrder)

    val newOrders = intArrayOf(3,5,2,4)
    val totalOrder = myOrder(1,3,1,2,*newOrders, name = "Si bambang")
    println(totalOrder)
}

fun sumNumber(vararg number : Int) : Int {
    return number.sum()
}

fun countNumber(vararg number: Int) : Int {
    return number.size
}

fun myOrder(vararg number: Int, name: String) : String {
    val totalOrder = number.sum()
    return "$name order barang sebanyak $totalOrder item"
}