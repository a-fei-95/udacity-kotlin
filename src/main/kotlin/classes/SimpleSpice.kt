package classes

class SimpleSpice {
    var name: String = "curry"
    var spiciness: String = "mild"
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            else -> -1
        }
}

fun main() {
    val spice = SimpleSpice()
    println("name: ${spice.name}, heat level: ${spice.heat}")
}