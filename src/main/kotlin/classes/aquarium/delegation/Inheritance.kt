package classes.aquarium.delegation

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val red = RedColor
    val gold = GoldColor
    val pleco = Plecostomus(red)
    println("Fish has color ${pleco.color}")
    pleco.eat()
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

/**
 *
 */
class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("a lot of algae"),
    FishColor by fishColor // Delegates field implementation to implementors

object GoldColor: FishColor {
    override val color: String = "gold"
}

object RedColor: FishColor {
    override val color: String = "red"
}

class PrintingFishAction(val food: String): FishAction {
    override fun eat() {
        println(food)
    }
}