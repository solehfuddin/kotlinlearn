package FunctionalProgramming

fun main() {
    val myName = getName(firstName = "Muhamad", lastName = "Solehfuddin")
    println(myName)

    val otherName = getName(lastName = "Subedjo", firstName = "Bambang")
    println(otherName)
}

fun getName(firstName: String, lastName: String) : String {
    return "$firstName $lastName"
}
