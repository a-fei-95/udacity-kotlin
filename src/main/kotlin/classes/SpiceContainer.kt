package classes

data class SpiceContainer(val spice: Spice) {
    val label = spice.name
}

fun main() {
    val curry = Spice("curry", "mild")
    val pepper = Spice("pepper")
    val garlic = Spice("garlic")
    val sc1 = SpiceContainer(curry)
    println(sc1.label)
}
