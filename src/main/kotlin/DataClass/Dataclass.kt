package DataClass

class User(val name: String, val age: Int) {
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

data class DataUser (val name: String, val age: Int) {
    //contoh pembuatan fungsi custom di data class
    fun info() {
        println("Hello semua jenengku $name, umurku $age tahun")
    }
}

fun main() {
    val user = User("Bambang", 15)
    val dataUser = DataUser("Alfath", 2)
    val dataUser1 = DataUser("Alfath", 2)
    val dataUser2 = dataUser.copy(name = "Muhamad Alfath Virendra")

    println(user)
    println(dataUser)
    println(dataUser.equals(dataUser1))
    println(dataUser2)
    dataUser2.info()

    //destructuring atau pemisahan deklarasi
    val name = dataUser.component1()
    val age = dataUser.component2()

    val (name1, age1) = dataUser2
    println("Namaku $name dan umurku $age")
    println("Namaku $name1 dan umurku $age1")
}