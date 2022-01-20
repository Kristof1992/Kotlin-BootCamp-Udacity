package essentials.generics.exercise

// Base class
open class BaseBuildingMaterial(var numberNeeded: Int = 1)

class Wood(numberNeeded: Int = 4) : BaseBuildingMaterial(numberNeeded)

class Brick(numberNeeded: Int = 8) : BaseBuildingMaterial(numberNeeded)

class Building<out T: BaseBuildingMaterial>(val buildingMaterial: T) {
    val baseMaterialsNeeded: Int = 100
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println(" $actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }
}

// Exercise

fun <T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("Small building")
    else println("large building")
}



fun main(args: Array<String>) {
    val subInstanceOne = Wood()
    val subInstanceTwo = Brick()

    val myBuilder = Building(Wood()).build()
    isSmallBuilding(Building(Brick()))

}