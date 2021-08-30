package DataClass

fun main() {
    val brand = mapOf(
            "Xpander" to "Mitsubishi",
            "Terios" to "Deehatsu",
            "Rush" to "Toyota"
    )

    println(brand)
    println(brand["Xpander"])
    println(brand.keys)
    println(brand.values)

    //Mutable map
    val otherBrand = brand.toMutableMap()
    otherBrand.put("Livina", "Nissan")
    otherBrand.put("Crv", "Honda")
    println(otherBrand)
}