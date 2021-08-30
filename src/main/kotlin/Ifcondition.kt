//fun main() {
//    val openHours = 7
//    val now = 6
//
//    val office : String
//    office = if (now > openHours) {
//        "Office already open"
//    }
//    else if (now == openHours) {
//        "Wait a minute, office will open soon"
//    }
//    else {
//        "Sorry office still closed"
//    }
//
//    println(office)
//}

// Konjungsi (&&)
//fun main() {
//    val openHours = 8
//    val closeHours = 17
//    val now = 20
//
//    val isOpen = now >= openHours && now <= closeHours
//    val output = if (isOpen) {
//        "Office still open"
//    }
//    else {
//        "Office is close"
//    }
//
//    print(output)
//}

// Disjungsi (||)
//fun main() {
//    val openHours = 8
//    val closeHours = 17
//    val now = 20
//
//    val isOpen = now >= openHours || now <= closeHours
//    val output = if (isOpen){
//        "Office still open"
//    }else
//    {
//        "Office is close"
//    }
//
//    print (output)
//}

//negasi (!)
fun main() {
    val openHours = 8
    val now = 20

    val isOpen = now > openHours
    val output = if (!isOpen) {
        "Office still open"
    }
    else
    {
        "Office is close"
    }

    print(output)
}