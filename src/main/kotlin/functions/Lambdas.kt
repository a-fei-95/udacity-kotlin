fun gamePlay(numSides: Int, rolledDice: (Int) -> Int) {
    println(rolledDice(numSides))
}

fun main() {
    val rollDice = { it: Int -> if (it == 0) 0 else (1..it).random() }
    val rollDice2: (Int) -> Int = { if (it == 0) 0 else (1..it).random() }
    gamePlay(4) {
        if (it == 0) 0 else (1..it).random()
    }
}