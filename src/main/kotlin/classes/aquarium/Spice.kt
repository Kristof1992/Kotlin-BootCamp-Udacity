package classes.aquarium

class Spice(var name: String, var spiciness: String = "mild") {

    // Task:
    // "Add an init block that prints out the values for the object after it has been created. Create a spice."
    // Remarks: Object is being created after the init block has run.
    init {

    }

    val heat: Int
        get() {
            return when(spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
        }
    }

}

fun makeSalt() = Spice("Salt")