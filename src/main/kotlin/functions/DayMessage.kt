import java.util.Calendar

fun dayOfWeek() {
    println("What day is it today?")
    val output: String = when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        Calendar.SUNDAY -> "Get some rest!"
        Calendar.MONDAY -> "Happy Monday!"
        Calendar.TUESDAY -> "Get some activities done!"
        Calendar.WEDNESDAY -> ""
        Calendar.THURSDAY -> ""
        Calendar.FRIDAY -> ""
        Calendar.SATURDAY -> ""
        else -> ""
    }
    println(output)
}

fun main(args: Array<String>) {
    dayOfWeek()
}