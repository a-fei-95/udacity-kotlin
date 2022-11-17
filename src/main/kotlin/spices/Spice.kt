package spices

sealed class Spice (
    val name: String,
    private val spiciness: String = "mild"
) {
    private val heat: Int
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

    abstract val color: SpiceColor
    abstract fun prepareSpice()
}

fun main() {
    val curry = Curry()
    println(curry.color.color)
}