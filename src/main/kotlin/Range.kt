fun main() {
    val rangeInt = 1..10
    //Untuk menampilkan data secara naik 1 atau increment 1
    rangeInt.forEach {
        println("$it")
    }

    //Mengubah step atau increment
    val rangeVal = 1..10 step 2
    rangeVal.forEach {
        println("$it")
    }

    //Contoh penggunaan range to
    val rangeTo = 11.rangeTo(15)
    rangeTo.forEach {
        println("$it")
    }

    //Penerapan down to
    val downTo = 15.downTo(11)
    downTo.forEach {
        println("$it")
    }

    //cek nilai pada range
    if (12 in downTo)
    {
        println("12 ternyata ada loh")
    }

    if (10 !in downTo)
    {
        println("10 ga ada ternyata")
    }

    //Range character
    val rangeChar = 'A'..'F'
    rangeChar.forEach { print("$it ,") }
}