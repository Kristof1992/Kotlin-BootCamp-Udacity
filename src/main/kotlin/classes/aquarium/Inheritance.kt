package classes.aquarium

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val pleco = Plecostomus()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

// Interface delegation
// This means implement the interface FishColor
// by deferring all calls to the object, gold color.
// Every time color property is called on this class
// it will actually call the property on gold color.


class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("a lot of algae"),
    FishColor by fishColor

// Kotlin makes exactly one instance of Goldcolor
object GoldColor: FishColor {
    override val color = "gold"
}

object RedColor: FishColor {
    override val color = "red"
}

class PrintingFishAction(val food: String): FishAction {
    override fun eat() {
        println(food)
    }
}