package DataClass

fun main() {
    //List tidak bisa diubah"
    val numberList = listOf(1,2,3,4)
    val charList = listOf('a', 'b', 'c')
    val anyList = listOf(1, 'b', true, "bambang")

    println(numberList)
    println(charList)
    println(numberList[2])
    println(anyList)

    //Mutable list ialah list yang bisa diubah
    val contohMutable = mutableListOf(1, 'b', true, "contoh")

    println(contohMutable)
    contohMutable.set(3, "Bambang")
    println(contohMutable)

    //contoh filter dan filternot
    val genap = numberList.filter { it % 2 == 0 }
    val ganjil = numberList.filterNot { it % 2 == 0 }

    println(genap)
    println(ganjil)

    //contoh map untuk collection baru
    val dikali10 = numberList.map { it * 10 }
    println(dikali10)

    //Hitung banyak item collection
    println(numberList.count())
    println(numberList.count{it % 3 == 0})

    //get first and last
    println(numberList.first())
    println(numberList.last())

    //sum total
    println(numberList.sum())

    //sorting asc dan desc
    val newList = listOf('K', 'O', 'T', 'L', 'I', 'N')

    println(newList.sorted())
    println(newList.sortedDescending())
}