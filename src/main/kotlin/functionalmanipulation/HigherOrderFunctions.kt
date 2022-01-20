package functionalmanipulation

data class MyFish(var name: String)

fun fishExamples() {
    val fish = MyFish("splashy")

    myWith(fish.name) {
        println(uppercase())
    }

    // without inline an object is created every call to myWith
//    fish.name.capitalize()

    // Returns the result of executing the lambda
    println(fish.run {name})
    // Apply returns the object after the lambda has been applied
    println(fish.apply {})

    val fish2 = Fish(name = "splashy").apply { name }
    println(fish2.name)

    // Let returns a copy of the changed object.
    // Useful for chaining manipulations together
    println(
        fish.let { it.name.capitalize() }
        .let { it + "fish" }
        .let { it.length }
        .let {it + 31}
    )
}

/**
 * Higher-order function
 * If we use inline functions there's no overhead for the compiler
 * It's best used for simple functions
 */
inline fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}


fun main(args: Array<String>) {
    fishExamples()
}