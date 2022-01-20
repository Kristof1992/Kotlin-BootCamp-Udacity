package classes.aquarium.spices

fun main(args: Array<String>) {
//    val spice = Spice()
//    spice.color
}

abstract class Spice(val name: String, var spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
        abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String,
color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color) , Grinder {
    override fun grind() {

    }

    override fun prepareSpice() {
        grind()
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color: String = "yellow"
}