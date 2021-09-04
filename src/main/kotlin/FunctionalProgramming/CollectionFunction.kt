package FunctionalProgramming

//contoh penggunaan fold
//fun main() {
//    val numbers = listOf(1,2,3)
////    val fold = numbers.fold(10) { current, item ->
////        println("current $current")
////        println("item $item")
////        println()
////        current + item
////    }
//     val fold = numbers.foldRight(10) {current, item ->
//         println("current $current")
//         println("item $item")
//         println()
//         current + item
//     }
//
//    println("Fold result : $fold")
//}

//contoh penggunaan drop
//fun main() {
//    val numbers = listOf(1,2,3,4,5,6)
////    val drop = numbers.drop(3)
//    val drop = numbers.dropLast(3)
//    println(drop)
//}

//contoh penggunaan take
//fun main() {
//    val numbers = listOf(1,2,3,4,5,6)
////    val take = numbers.take(3)
//    val take = numbers.takeLast(3)
//    println(take)
//}

//contoh penggunaan slice
//fun main() {
//    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
//    val index = listOf(3,4,6,8)
////    val slice = numbers.slice(3..6)
////    val slice = numbers.slice(3..6 step(2))
//    val slice = numbers.slice(index)
//    println(slice)
//}

//contoh penggunaan distinct
//data class Item(val key : String, val value : Any)
//
//fun main() {
//    val numbers = listOf(1,2,1,3,4,5,1,2)
//    val distinct = numbers.distinct()
//    println(distinct)
//
//    val items = listOf(
//            Item("1", "Kotlin"),
//            Item("2", "is"),
//            Item("3", "awesome"),
//            Item("3", "as"),
//            Item("3", "Programming")
//    )
//
//    val distinctItem = items.distinctBy { it.key }
//    distinctItem.forEach {
//        println("${it.key} with value ${it.value}")
//    }
//
//    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGGG")
//    val distinctLen = text.distinctBy {
//        it.length
//    }
//
//    println(distinctLen)
//}

//contoh penggunaan chunked
fun main() {
    val words = "QWERTY"
    val chunked = words.chunked(3) {
        it.toString().toLowerCase()
    }
    println(chunked)
}