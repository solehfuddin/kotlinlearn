fun main() {
    val array = arrayOf(1, 3, 5, 7)
    val mixarray = arrayOf(1, 3, 5, 7, "Bambang", true)
    val intarray = Array(3, { i -> i * i})

    println(array[1])
    for (int in array)
    {
        println("Output : $int")
    }

    mixarray[3] = "Soleh"
    println(mixarray[3])
    for (int in mixarray)
    {
        println("mix : $int")
    }

    for (int in intarray)
    {
        println("array : $int")
    }
}