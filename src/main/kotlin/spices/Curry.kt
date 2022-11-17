package spices

class Curry :
    Spice("curry", "mild"),
    Grinder
{
    override val color: SpiceColor = YellowSpiceColor
    override fun prepareSpice() {
        println("preparing curry...")
    }
}