fun main() {
    var counter = 1

    //Contoh while
    while (counter <= 5)
    {
        println("Output $counter")
        counter++
    }

    var counter2 = 1
    //contoh do while
    do {
        println("Result $counter2")
        counter2++
    }while (counter2 <= 5)

    //contoh for loop
//    val oneToFive = 1..5
    val oneToFive = 1.rangeTo(5) step 2
    for (i in oneToFive)
    {
        println("Output $i")
    }

    for ((index, value) in oneToFive.withIndex()) {
        println("index $index value is $value")
    }

    //contoh foreach
    oneToFive.forEach {
        println("Foreach output : $it")
    }

    oneToFive.forEachIndexed { index, i -> println("Foreach index $index is $i") }
}