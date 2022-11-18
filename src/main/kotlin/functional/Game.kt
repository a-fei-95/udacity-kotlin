package functional

class Game {
    val path = mutableListOf(Directions.START)

    val location = Location()

    val north = { location.updateLocation(Directions.NORTH); path.add(Directions.NORTH)}
    val south = { location.updateLocation(Directions.SOUTH); path.add(Directions.SOUTH) }
    val east = { location.updateLocation(Directions.EAST); path.add(Directions.EAST) }
    val west = { location.updateLocation(Directions.WEST); path.add(Directions.WEST)}

    val end = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false
    }

    private fun move(where: () -> Boolean) {
        where()
    }

    fun makeMove(direction: String?) {
        when (direction) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }

    init {
        println(location.map[0][0])
    }
}