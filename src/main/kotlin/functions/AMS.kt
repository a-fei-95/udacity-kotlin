fun canAddFish(
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true,
) : Boolean {
    return fishSize <= ((if (hasDecorations) 0.8 else 1).toDouble() * tankSize).minus(currentFish.sum())
}

fun main(args: Array<String>) {
    println(canAddFish(10.0, listOf(3,3,3)))
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1,1,3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}