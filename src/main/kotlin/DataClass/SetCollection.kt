package DataClass

fun main() {
    val setContoh = setOf(1, 2, 3, 1, 2)
    val setLain = setOf(1,2)

    val union = setContoh.union(setLain)
    val intersect = setContoh.intersect(setLain)

    println(setContoh)
    println(3 in setContoh)
    println(union)
    println(intersect)

    val mutableSet = mutableSetOf(1,2,3,1,2)

    println(mutableSet)
    mutableSet.add(4)
    println(mutableSet)
    mutableSet.remove(1)
    println(mutableSet)

    val genap = setContoh.filter { it % 2 == 0 }

    println(genap)
}