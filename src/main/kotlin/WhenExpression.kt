import kotlin.random.Random

fun main() {
//    val value = 7

    val value = 20

    //Bisa ditambahkan else jika semua kondisi tidak terpenuhi
//    when(value) {
//        6 -> println("Nilainya 6")
//        7 -> println("Nilainya 7")
//        8 -> println("Nilainya 8")
//        else -> println("Nilainya ngawur")
//    }

    // Bisa ditampung dalam variable
//    val output =  when(value) {
//        6 -> "Nilainya 6"
//        7 -> "Nilainya 7"
//        8 -> "Nilainya 8"
//        else -> "Nilainya ngawur"
//    }

    //Apabila terdapat lebih dari 1 baris kode bisa menggunakan curly braces {}
    val output =  when(value) {
        6 -> {
            println("Six")
            "Nilainya 6"
        }
        7 -> {
            println("Seven")
            "Nilainya 7"
        }
        8 -> {
            println("Eight")
            "Nilainya 8"
        }
        else -> {
            println("Null")
            "Nilainya ngawur"
        }
    }

    println(output)

    // Contoh penggunaan is pada when expression
    val anyType : Any = 100L

    when(anyType) {
        is Long -> println("Tipe datanya long")
        is String -> println("Tipe datanya string")
        else -> print("Tipe data tidak jelas")
    }

    // Contoh penggunaan ranges pada when expression
    val nilai = 20
    val range = 10..30

    when(nilai) {
        in range -> println("Nilai masuk area range")
        !in range -> println("Nilai tidak masuk area range")
        else -> println("Nilai tidak jelas")
    }

    // Ambil nilai dari variable lain
    val outputRandom = when(val random = getRandom()) {
        in 1..50 -> random
        in 51..100 -> 100 * random
        else -> random
    }

    println(outputRandom)
}

//Generate random value
fun getRandom() = Random.nextInt(100)