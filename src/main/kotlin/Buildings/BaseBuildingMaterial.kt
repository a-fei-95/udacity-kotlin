package Buildings

open class BaseBuildingMaterial {
    var numberNeeded: Int = 1
}

class Wood : BaseBuildingMaterial()

class Brick : BaseBuildingMaterial()

class Building<T: BaseBuildingMaterial>(private val material: T) {
    private val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = baseMaterialsNeeded + material.numberNeeded
    fun build() {
        println("Needs $actualMaterialsNeeded ${material::class.simpleName}!")
    }
}

fun <T: BaseBuildingMaterial> Building<T>.isSmallBuilding() {
    if (this.actualMaterialsNeeded < 500) {
        println("small building")
    } else {
        println("large building")
    }
}

fun main() {
    val wood = Wood()
    val building = Building(wood)
    building.build()
    building.isSmallBuilding()

    val brick = Brick()
    brick.numberNeeded = 645
    val building2 = Building(brick)
    building2.build()
    building2.isSmallBuilding()
}