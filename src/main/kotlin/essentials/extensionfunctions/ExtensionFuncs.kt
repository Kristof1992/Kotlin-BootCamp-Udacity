package essentials.extensionfunctions

// Ver. 1
fun String.hasSpaces(): Boolean {
    val found = this.find { it == ' '}
    return found != null
}

// Ver. 2
fun String.hasSpacesTwo() = find { it == ' '} != null

fun extensionsExample() {
    "Does it have spaces?".hasSpaces()
}

open class AquariumPlant(val color: String, private val size: Int)

    fun AquariumPlant.isRed() = color == "Red"

    class GreenLeafyPlant(size: Int): AquariumPlant("Green", size)

    fun AquariumPlant.print() = println("AquariumPlant")
    fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

    fun staticExample() {
        val plant = GreenLeafyPlant(50)
        plant.print()

        /**
         * Extension function is resolved statically
         * at compile-time, therefore the type of
         * aquariumPlant below is AquariumPlant
          */

        val aquariumPlant: AquariumPlant = plant
        aquariumPlant.print()
    }

fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}

fun nullableExample(){
    val plant: AquariumPlant? = AquariumPlant("Black", 10)
    return plant.pull() // ok
}

val AquariumPlant.isGreen: Boolean
get() = color == "Green"

fun main(args: Array<String>) {
//    println("Has spaces".hasSpacesTwo())

    staticExample()
    val aqRed = AquariumPlant("Red", 1)
    val aqGreen = AquariumPlant("Green", 5)

    println(aqRed.isRed())
    println(aqGreen.isGreen)

    nullableExample()


}