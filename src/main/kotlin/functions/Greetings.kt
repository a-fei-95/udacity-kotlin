fun main(args: Array<String>) {
    println("Good ${ if (args[0].split(':')[0].toInt() < 12) "morning" else "night"}, Kotlin")
}