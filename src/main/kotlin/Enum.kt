fun main() {
    println(Colors.RED)
    println(Colors.GREEN)
    println(Colors.BLUE)

    println(MyColors.WHITE)
    println(MyColors.BLACK)

    ColorsAnonimous.RED
    ColorsAnonimous.BLUE
    ColorsAnonimous.GREEN

    //Syntetic Method value => mendapatkan daftar enum
    val allColors : Array<Colors> = Colors.values()
    allColors.forEach { colors -> println(colors) }

    //Syntetic Method valueOf => mengakses enum berdasarkan value tertentu
    val myChooseColors : Colors = Colors.BLUE
    println("My favorite color : $myChooseColors")

    //Pemanggilan dengan fungsi umum
    val callColors : Array<Colors> = enumValues()
    callColors.forEach { colors ->  println(colors)}

    //Pemanggilan suatu value dengan fungsi umum
    val callSpesificColors : Colors = enumValueOf("RED")
    println(callSpesificColors)

    //Ambil index dari suatu enum
    val getIndexColors : Colors = Colors.BLUE
    println("Index of Blue is ${getIndexColors.ordinal}")

    //Pemanggilan enum dengan when expression mirip switch case
    val sampleWhenColors : Colors = Colors.RED

    when(sampleWhenColors) {
        Colors.RED -> println("color is RED")
        Colors.BLUE -> println("color is BLUE")
        Colors.GREEN -> println("color is GREEN")
    }
}

enum class Colors(val value : Int){
    RED(0XFF0000),
    GREEN(0X00FF00),
    BLUE(0X0000FF)
}

enum class MyColors {
    WHITE, BLACK
}

enum class ColorsAnonimous(val value: Int){
    RED(0XFF0000) {
        override fun printValue() {
            println("Value of RED is $value")
        }
    },
    GREEN(0X00FF00) {
        override fun printValue() {
            println("Value of GREEN is $value")
        }
    },
    BLUE(0X0000FF) {
        override fun printValue() {
            println("Value of BLUE is $value")
        }
    };

    abstract fun printValue()
}