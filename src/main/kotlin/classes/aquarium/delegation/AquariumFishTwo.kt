package classes.aquarium.delegation

//fun main(args: Array<String>) {
//    makeFish()
//}

abstract class AquariumFishTwo {
    abstract val color: String
}

class Shark: AquariumFishTwo(), FishAction {
    // Overridden field from abstract class
    override val color: String = "gray"

    override fun eat() {
        TODO("Not yet implemented")
    }
}

//class Plecostomus: AquariumFishTwo(), FishAction {
//    // Overridden field from abstract class
//    override val color: String = "gold"
//
//    override fun eat() {
//        TODO("Not yet implemented")
//    }
//}

//interface FishAction {
//    fun eat()
//}

/**
 * param fish interface type
 */
fun feedFish(fish: FishAction) {
    fish.eat()
}

//fun makeFish() {
//    val shark = Shark()
//    val pleco = Plecostomus()
//
//    println("Shark: ${shark.color} \nPlecostomus: ${pleco.color}")
//}