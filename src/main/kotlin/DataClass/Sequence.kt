package DataClass

fun main() {
    val sampel = generateSequence(1) {it + 1}
    sampel.take(5).forEach { println("$it") }

    //convert list as sequence supaya performa lebih cepat
    val list = 1..100000
    list.asSequence().filter { it % 10 == 0 }.map { it * 2 }.forEach { println("$it") }
}