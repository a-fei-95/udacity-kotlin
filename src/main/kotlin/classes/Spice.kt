package classes

class Spice (
    val name: String,
    private val spiciness: String = "mild"
) {
    val heat: Int
        get() = when (spiciness) {
            "none" -> 0
            "mild" -> 5
            "medium" -> 10
            "hot" -> 15
            else -> 0
        }

    init {
        println("$name's hot level is: $heat")
    }
}

fun makeSalt() = Spice("salt", "none")

fun main() {
    val spices = listOf<Spice>(
        Spice("curry", "mild"),
        Spice("老干妈", "mild"),
        Spice("green pepper", "medium"),
        Spice("hot pepper", "hot"),
    ).filter {
        it.heat <= 10
    }
    println(spices.map { it.name })
}