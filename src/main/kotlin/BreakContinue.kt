fun main() {
    val data = listOf(1,2,3,null,4,5,6,null)

    //Contoh continue
    for (i in data){
        if (i == null) continue
        println("Output $i")
    }

    //Contoh break
    for (i in data){
        if (i == null) break
        println("Result $i")
    }

    loop@ for (i in 1..10){
        println("Outside loop")

        for (j in 1..10) {
            println("Inside loop")
            if (j > 5) break@loop
        }
    }
}