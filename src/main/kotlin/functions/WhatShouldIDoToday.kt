fun whatShouldIDoToday(
    weather: String = "sunny",
    temperature: Int = 24,
) : Unit {
    println("How's your mood today? (happy/sad/angry):")
    val mood: String = readLine().toString()

    val job = when {
        mood == "happy" && weather == "sunny" -> "Go for a walk."
        mood == "happy" && weather == "cloudy" -> "Draw something."
        mood == "sad" && weather == "rainy" && temperature == 0 -> "Stay in bed."
        mood == "angry" -> "Meditation."
        temperature < 10 -> "Wear your goose!"
        temperature > 35 -> "Go swimming."
        else -> "Stay home and read."
    }

    println(job)
}

fun main(args: Array<String>) {
    whatShouldIDoToday("sunny")
    whatShouldIDoToday("cloudy", 9)
    whatShouldIDoToday(temperature = 36)
}