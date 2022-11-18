package functional

class Location(val width: Int = 4, val height: Int = 4) {
    val map = Array(width) {
        arrayOfNulls<String>(height)
    }

    var location: Pair<Int, Int> = Pair(0, 0)

    init {
        map[0][0] = "You are at the start of your journey. [n / e]"
        map[0][1] = "The road stretches before you. It promises beauty and adventure. [ n / s / e]"
        map[0][2] = "The road still stretches before you. It rains and the water forms puddles. [ n / s / e]"
        map[0][3] = "It is getting much colder and you wish you had a wool coat. [ s / e]"

        map[1][0] = "The narrow path stretches before you. You are glad you are on foot. [ n / e /w]"
        map[1][1] = "It is getting warmer. You smell moss, and marmot scat. You are stung by a mosquito. [ n / s / e / w]"
        map[1][2] = "You decide to sit on your backside and slide down a vast snowfield. [ n / s / e /w]"
        map[1][3] = "You have climbed to the top of a snowy mountain and are enjoying the view. [ w / s / e]"

        map[2][0] = "You cross an old stone bridge. Your hear the murmuring of water. And another grumbling sound. [ n / e / w]"
        map[2][1] = "A bridge troll appears. It swings a club and demands gold. You give them all your coins. [ n / s / e  /w]"
        map[2][2] = "It is getting cooler. A dense fog rolls in. You can hear strange voices. [ n / s / e / w]"
        map[2][3] = "The foothills promise a strenuous journey. You thread your way around gigantic boulders. [ s / e / w ]"

        map[3][0] = "Your journey continues. A fox runs across the path with a chicken in its mouth.[ n / e ]"
        map[3][1] = "In the distance, you see a house. You almost bump into a farmer with a large shotgun. They pay you no heed. [ n / s / w ]"
        map[3][2] = "It is getting hot, and dry, and very, very quiet. You think of water and wish you had brought a canteen.[ n / s / w ]"
        map[3][3] = "You have reached the infinite desert. There is nothing here but sand dunes. You are bitten by a sand flea.[ s / w ] "
    }

    fun updateLocation(direction: Directions) {
        val (i, j) = location
        var newLocation = Pair(0, 0)
        when (direction) {
            Directions.NORTH -> newLocation = Pair(i, j+1)
            Directions.SOUTH -> newLocation = Pair(i, j-1)
            Directions.EAST -> newLocation = Pair(i+1, j)
            Directions.WEST -> newLocation = Pair(i-1, j)
            else -> {}
        }
        if (newLocation.first in 0 until height && newLocation.second in 0 until width) {
            location = newLocation
            val (m, n) = location
            println(map[m][n])
        } else {
            println("No can do :(")
        }
        println("You're at [${location.first}, ${location.second}]")
    }
}