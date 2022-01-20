package classes.aquarium.decorations

import classes.aquarium.spices.Curry
import classes.aquarium.spices.Spice

fun main(args: Array<String>) {
    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy")))

    for(element in spiceCabinet) println(element.label)
}

data class SpiceContainer(var spice: Spice) {
    var label = spice.name
}