package functional

fun main() {
    val game = Game()

    while (true) {
        val input = readLine()
        game.makeMove(input)
        if (input !in listOf("n", "s", "e", "w")) {
            break
        }
    }

    // lambda
    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
    println(numbers.divideByThree { this.rem(3) })
}

fun List<Int>.divideByThree(block: Int.() -> Int): List<Int> {
    val output = mutableListOf<Int>()
    this.forEach {
        if (it == 0 || it.block() == 0) {
            output.add(it)
        }
    }
    return output
}