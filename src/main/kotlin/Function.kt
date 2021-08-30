fun main() {
    val user = setUser("Soleh", 28)
    println(user)

    setNama("Bambang")
}

// contoh function 1 baris statement
fun setUser(nama : String, umur : Int) = "Nama saya $nama, umur saya $umur tahun"

// contoh prosedur
fun setNama(nama: String) = print("Nama saya $nama")