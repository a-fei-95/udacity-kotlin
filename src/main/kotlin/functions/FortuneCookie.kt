fun getFortuneCookie(): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.",
    )
    val birthday = getBirthday()
    return when(birthday) {
        28, 31 -> fortunes[4]
        in 1..7 -> fortunes[3]
        else -> fortunes[birthday.rem(fortunes.size)]
    }
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun main(args: Array<String>) {
    var fortune: String
    while (true) {
        fortune = getFortuneCookie()
        println("Your fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}